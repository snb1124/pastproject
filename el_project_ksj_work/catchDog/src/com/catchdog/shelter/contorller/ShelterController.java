package com.catchdog.shelter.contorller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import java.io.File;
import java.util.ArrayList;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.catchdog.common.CommonUtils;
import com.catchdog.shelter.vo.CatchdogVO;

@Controller
public class ShelterController {
	Logger logger = Logger.getLogger(ShelterController.class);

	
	@GetMapping("shelter")
	public String shelterXMLParsing(CatchdogVO cdvo, Model model) {
	
		// 페이징에 필요한 지역변수 초기화
		int curPage =  CommonUtils.SHELTER_CURPAGE;
		int pageSize = CommonUtils.SHELTER_PAGESIZE;
		int groupSize = CommonUtils.SHELTER_GROUPSIZE;
		int totalCount = CommonUtils.SHELTER_TOTALCOUNGT;
		
		// shelterPasingBoard에서 페이징 시 curPage 값을 받는 조건문
		if(cdvo.getCurPage() != null){
			curPage = Integer.parseInt(cdvo.getCurPage()); 
		}
		System.out.println("curpage >>> : " + curPage);
		//페이징에 필요한 데이터 cdvo에 셋팅
		
		cdvo.setCurPage(String.valueOf(curPage));
		cdvo.setPageSize(String.valueOf(pageSize));
		cdvo.setGroupSize(String.valueOf(groupSize));
		

		//XML파일 PARSING처리
		try {
			String xmlFilePath = CommonUtils.XML_FILE_PATH;
			File fileXML = new File( xmlFilePath + "/shelterInfo.xml"); //shelterInfo.xml 가져와서 fileXML에 넣음

			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fileXML);
			doc.getDocumentElement().normalize();

			NodeList nList = doc.getElementsByTagName("item"); 
			
			totalCount = nList.getLength();
			cdvo.setTotalCount(String.valueOf(totalCount));
//			페이징 시 필요한 totalCount 세팅
			
//			System.out.println("totalCount / (curPage)*5 >>>> " + totalCount / ((curPage)*5));
//			System.out.println("totalCount >>> : " + totalCount);
//			System.out.println("curPage >>> : " + curPage);
			
			ArrayList<CatchdogVO> aList = new ArrayList<CatchdogVO>();
//			데이터를 담을 ArrayList객체 준비
			System.out.println("(totalCount / ((curPage)*pageSize) >>>>>> : " + (totalCount / ((curPage)*pageSize)));
			System.out.println("pageSize >>> : " + pageSize);
			System.out.println("curPage >>> : " + curPage);
			System.out.println("totalCount >>> : " + totalCount);
			
			
			if((totalCount / ((curPage)*pageSize)) >= 1  ) {
//				System.out.println("마지막 페이지로 안들어옴");
				System.out.println("(totalCount / ((curPage)*pageSize) >>>>>> : " + (totalCount / ((curPage)*pageSize)));
				for (int temp = (curPage-1)*pageSize ; temp < curPage*pageSize ; temp++) {
					
					Node nNode = nList.item(temp);
					
					CatchdogVO _cdvo = new CatchdogVO();
					
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
						
						Element eElement = (Element) nNode;	
//						System.out.println("careAddr 상세주소 : " + getTagValue("careAddr", eElement));
//						System.out.println("careNm 보호소명 : " + getTagValue("careNm", eElement));
//						System.out.println("careTel 전화번호 : " + getTagValue("careTel", eElement));				
//						System.out.println("lat 위도 : " + getTagValue("lat", eElement));					
//						System.out.println("lng 위도 : " + getTagValue("lng", eElement));
						
						_cdvo.setCsaddress(getTagValue("careAddr", eElement).toString());
						_cdvo.setCsname(getTagValue("careNm", eElement).toString());
						_cdvo.setCstel(getTagValue("careTel", eElement).toString());
						_cdvo.setCslat(getTagValue("lat", eElement).toString());
						_cdvo.setCslng(getTagValue("lng", eElement).toString());
					}
					aList.add(_cdvo);
				}
			}else {// (totalCount / ((curPage)*pageSize)) 가  이하일때  >> 마지막 페이지라는 의미 ; 
				   // totalCount:304, curPage:61, pageSize:5 이면 나머지가 4나오기 때문에
				   // for문 조건을 바꿔줘야한다. >>>> temp < totalCount로
				System.out.println("(totalCount / ((curPage)*pageSize) >>>>>> : " + (totalCount / ((curPage)*	pageSize)));
//					System.out.println("마지막 페이지로 들어옴");
					for (int temp = (curPage-1)*pageSize ; temp < totalCount ; temp++) {
					
					Node nNode = nList.item(temp);
					
					CatchdogVO _cdvo = new CatchdogVO();
					
					if (nNode.getNodeType() == Node.ELEMENT_NODE) {
						
						Element eElement = (Element) nNode;
//						System.out.println("careAddr 상세주소 : " + getTagValue("careAddr", eElement));
//						System.out.println("careNm 보호소명 : " + getTagValue("careNm", eElement));
//						System.out.println("careTel 전화번호 : " + getTagValue("careTel", eElement));				
//						System.out.println("lat 위도 : " + getTagValue("lat", eElement));					
//						System.out.println("lng 위도 : " + getTagValue("lng", eElement));
					
	
						_cdvo.setCsaddress(getTagValue("careAddr", eElement).toString());
						_cdvo.setCsname(getTagValue("careNm", eElement).toString());
						_cdvo.setCstel(getTagValue("careTel", eElement).toString());
						_cdvo.setCslat(getTagValue("lat", eElement).toString());
						_cdvo.setCslng(getTagValue("lng", eElement).toString());
				
					}
					aList.add(_cdvo);				
				}
				
			}
			if(aList.size() > 0) {
				System.out.println("aList.size()" + aList.size());
			

			model.addAttribute("pagingVO", cdvo); // model.addAttrivute를 통해서 key:value형태로 페이징에 필요한 데이터 shelterPasingBoard로 전달
			model.addAttribute("aList", aList); // model.addAttrivute를 통해서 key:value형태로 게시판출력에 필요한 데이터 shelterPasingBoard로 전달
		
			return "shelter/shelterPasingBoard";
			
			} 
		} catch (Exception e) {System.out.println("e >>>> : " + e.getMessage());}
		
		return "shelter/shelterPasingBoard";
	}

	
	// XML태그이름에 따른 element값 받아오기 및  element null값 처리함수
	private static String getTagValue(String sTag, Element eElement) {
		
		Node nValue=null;
		
		NodeList nlList = eElement.getElementsByTagName(sTag);
		
		Node test =  nlList.item(0);
		NodeList t = null;
		if(test != null) {

			t = test.getChildNodes();
			if((Node)t.item(0)!=null) {nValue=(Node)t.item(0);}			
		}
		if(nValue==null) return ""; // item태그에서 가지고 올 데이터가 없을시 ""으로 return
		return nValue.getNodeValue();
	}
}