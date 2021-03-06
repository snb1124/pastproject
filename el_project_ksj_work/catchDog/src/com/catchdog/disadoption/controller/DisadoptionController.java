package com.catchdog.disadoption.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.catchdog.common.ChabunUtil;
import com.catchdog.common.CommonUtils;
import com.catchdog.common.FileUploadUtil;
import com.catchdog.common.service.ChabunService;
import com.catchdog.disadoption.service.DisadoptionService;
import com.catchdog.disadoption.vo.DisadoptionVO;

@Controller
public class DisadoptionController {
	Logger logger = Logger.getLogger(DisadoptionController.class);

	private DisadoptionService disadoptionService;
	private ChabunService chabunService;
	
	// 생성자 오토와이어드
	@Autowired(required = false)
	public DisadoptionController(DisadoptionService disadoptionService , ChabunService chabunService) {
		this.disadoptionService = disadoptionService;
		this.chabunService = chabunService;
	}
	
	// 게시판 전체 폼
	@GetMapping("disadoptionBoardSelectForm")
	public String disadoptionBoardSelectForm() {
		logger.info("DisadoptionController disadoptionBoardSelectForm() 함수 진입 >>> : ");
		return "disadoption/disadoptionBoardSelectForm";
	}
	
	// 게시판 조회 폼
	@PostMapping("disadoptionBoardSelectAll")
	public String disadoptionselectAll(DisadoptionVO dvo, Model model) {
		logger.info("DisadoptionselectController disadoptionboardSelectAll() 함수 진입 >>> : " );
		
		// 페이징 변수 세팅
		int pageSize = CommonUtils.BOARD_PAGE_SIZE;
		int groupSize = CommonUtils.BOARD_GROUP_SIZE;
		int curPage = CommonUtils.BOARD_CUR_PAGE;
		int totalCount = CommonUtils.BOARD_TOTAL_COUNT;
		
	
		if (dvo.getCurPage() !=null){
			curPage = Integer.parseInt(dvo.getCurPage());
		}
		
		dvo.setPageSize(String.valueOf(pageSize));
		dvo.setGroupSize(String.valueOf(groupSize));
		dvo.setCurPage(String.valueOf(curPage));
		dvo.setTotalCount(String.valueOf(totalCount));
			
		logger.info("DisadoptionselectController disadoptionboardSelectPaging dvo.getPageSize() >>> : " + dvo.getPageSize());
		logger.info("DisadoptionselectController disadoptionboardSelectPaging dvo.getGroupSize() >>> : " + dvo.getGroupSize());
		logger.info("DisadoptionselectController disadoptionboardSelectPaging dvo.getCurPage() >>> : " + dvo.getCurPage());
		logger.info("DisadoptionselectController disadoptionboardSelectPaging dvo.getTotalCount() >>> : " + dvo.getTotalCount());
		
		DisadoptionVO.printVO(dvo);
		List<DisadoptionVO> listAll = disadoptionService.disadoptionboardSelectAll(dvo);
		logger.info("SpringBoardController disadoptionboardSelectAll listAll.size() >>> : " + listAll.size());
		
		if(listAll.size() > 0) {
			model.addAttribute("listAll" , listAll);
			model.addAttribute("pagingDVO", dvo);
			
			return "disadoption/disadoptionBoardSelectAll";
		}
		
		return "disadoption/disadoptionBoardSelectForm";
	}
	
	// 글 목록 페이징 조회
	@RequestMapping(value= "disadoptionBoardSelectPaging", method=RequestMethod.GET)
	public String disadoptionboardSelectPaging(DisadoptionVO dvo, Model model) {
		logger.info("DisadoptionController disadoptionboardSelectPaging 함수 진입 >>> : ");
		
		logger.info("DisadoptionController disadoptionboardSelectPaging 함수 진입 >>> : 페이징 관련 로그 =================");
	
		// 페이지 변수 세팅
		int pageSize = CommonUtils.BOARD_PAGE_SIZE;
		int groupSize = CommonUtils.BOARD_GROUP_SIZE;
		int curPage = CommonUtils.BOARD_CUR_PAGE;
		int totalCount = CommonUtils.BOARD_TOTAL_COUNT;
		
		if(dvo.getCurPage() != null) {
			curPage = Integer.parseInt(dvo.getCurPage());
		}
		
		dvo.setPageSize(String.valueOf(pageSize));
		dvo.setGroupSize(String.valueOf(groupSize));
		dvo.setCurPage(String.valueOf(curPage));
		dvo.setTotalCount(String.valueOf(totalCount));
		
		logger.info("DisadoptionController disadoptionboardSelectPaging dvo.getPageSize() >>> : " + dvo.getPageSize());
		logger.info("DisadoptionController disadoptionboardSelectPaging dvo.getGroupSize() >>> : " + dvo.getGroupSize());
		logger.info("DisadoptionController disadoptionboardSelectPaging dvo.getCurPage() >>> : " + dvo.getCurPage());
		logger.info("DisadoptionController disadoptionboardSelectPaging dvo.getTotalCount() >>> : " + dvo.getTotalCount());

		DisadoptionVO.printVO(dvo);
		
		List<DisadoptionVO> listAll = disadoptionService.disadoptionboardSelectPaging(dvo);
		logger.info("DisadoptionController disadoptionboardSelectPaging listAll.size() >>> : " + listAll.size());
				
		if(listAll.size() > 0 ) {
//			for (int i=0; i < listAll.size(); i++) {
//			SpringBoardVO sdvo = (SpringBoardVO)listAll.get(i);
//			logger.info("listAll ::: dvo.getPageSize() >>> : " + dvo.getPageSize());
//			logger.info("listAll ::: dvo.getGroupSize() >>> : " + dvo.getGroupSize());
//			logger.info("listAll ::: dvo.getCurPage() >>> : " + dvo.getCurPage());
//			logger.info("listAll ::: dvo.getTotalCount() >>> : " + dvo.getTotalCount());
//		}
					
			model.addAttribute("pagingDVO", dvo);
			model.addAttribute("listAll", listAll);
			return "disadoption/disadoptionBoardSelectAll";
		
			}
		
		return "disadoption/disadoptionBoardSelectForm";
	}
	

	// 파양게시판 입력 폼
	@PostMapping("disadoptionPwCheck")
	@ResponseBody // 안쓰면 msg 값을 jsp페이지를 찾음
	public String disadoptionPwCheckForm(DisadoptionVO dvo, Model model) {
		logger.info("DisadoptionController disadoptionPwCheck() 함수 진입 >>> : ");		

		
		logger.info("DisadoptionController disadoptionPwCheck dvo.getAnum() >>> : " + dvo.getAnum());
		logger.info("DisadoptionController disadoptionPwCheck dvo.getApw() >>> : " + dvo.getApw());
		
		List<DisadoptionVO> list = disadoptionService.disadoptionPwCheck(dvo);
		logger.info("DisadoptionController disadoptionPwCheck dvo.getApw() >>> : " + list.size());
		model.addAttribute("anum", dvo.getAnum());

		// responsebody를 사용해 msg를 자바객체로 변환 
		String msg = "";
		if (list.size() == 1) {msg = "PW_GOOD";}
		else {msg = "PW_BAD";}
		
		return msg;
	}
	
	// 파양게시판 비밀번호체크 
	// 수정 삭제 버튼 눌렀을때 
	@PostMapping("disadoptionPwCheckForm")
	public String disadoptionPwCheck(DisadoptionVO dvo, Model model) {
		logger.info("DisadoptionController disadoptionPwCheckForm() 함수 진입 >>> : ");
		logger.info("pwcheck anum >>> : " + dvo.getAnum());
		List<DisadoptionVO> listS= disadoptionService.disadoptionboardSelect(dvo);
		// select된 anum이 있으면 listS.size에 1 나온다.
		logger.info("DisadoptionController disadoptionPwCheckForm listS.size() >>> : " + listS.size());
		
		// 1이 나오면 anum을 model로 담아서 disadoptionPwCheckForm 로 보내준다.
		model.addAttribute("anum", dvo.getAnum());
		return "disadoption/disadoptionPwCheckForm";	
	}
	
	// 파양게시판 수정/삭제 글 조회
	@PostMapping("disadoptionSelect")
	public String disadoptionboardSelect(DisadoptionVO dvo, Model model) {
		logger.info("DisadoptionController disadoptionboardSelect 함수 진입 >>> : ");
		logger.info("DisadoptionController disadoptionboardSelect dvo.Anum() >>> : " + dvo.getAnum());
	
		List<DisadoptionVO> listS= disadoptionService.disadoptionboardSelect(dvo);
		logger.info("DisadoptionController disadoptionboardSelect listS.size() >>> : " + listS.size());
		
		if(listS.size() == 1) {
			model.addAttribute("listS",listS);
			return "disadoption/disadoptionSelect";
		}
		return "disadoption/disadoptionBoardSelectForm";
	}
	
	// 파양게시판 수정
	@PostMapping("disadoptionUpdate")
	public String disadoptionboardUpdate(HttpServletRequest req, DisadoptionVO dvo, Model model) {
		logger.info("DisadoptionController disadoptionboardUpdate 함수 진입 >>> : ");
		logger.info("DisadoptionController disadoptionboardUpdate dvo.getAnum() >>> : " + dvo.getAnum());
		logger.info("DisadoptionController disadoptionboardUpdate dvo.getAsubject() >>> : " + dvo.getAsubject());
		logger.info("DisadoptionController disadoptionboardUpdate dvo.getAsubject() >>> : " + dvo.getAkind());
		
		
		
		int nCnt = disadoptionService.disadoptionboardUpdate(dvo);
		logger.info("DisadoptionController boarddisadoptionUpdate nCnt >>> : " + nCnt);
		
		if(nCnt > 0) {return "disadoption/disadoptionBoardUpdate";}
		return "disadoption/disadoptionBoardSelectForm";
		
	}
	// 파양게시판 삭제
	@PostMapping("disadoptionDelete")
	public String disadoptionboardDelete(DisadoptionVO dvo, Model model) {
		logger.info("DisadoptionController disadoptionboardDelete 함수 진입 >>> : ");
		logger.info("DisadoptionController disadoptionboardDelete dvo.getAnum() >>> : " + dvo.getAnum());
		
		int nCnt = disadoptionService.disadoptionboardDelete(dvo);
		logger.info("DisadoptionController disadoptionboardDelete nCnt >>> : " + nCnt);
		
		if(nCnt > 0) {return "disadoption/disadoptionBoardDelete";}
		return "disadoption/disadoptionBoardSelectForm";
		
	}
	// 파양게시판 입력 폼
	@GetMapping("disadoptionBoardInsert")
	public String disadoptionBoardInsert() {
		logger.info("DisadoptionController disadoptionBoardInsert() 함수 진입 >>> : ");
		return "disadoption/disadoptionBoardInsert";
	}
	
	// 게시글 입력
	@PostMapping("disadoptionBoardInsertForm")
	public String disadoptionboardInsertForm(HttpServletRequest req) {
		logger.info("DisadoptionController disadoptionboardInsertForm()함수 진입 >>> : ");
		
		//작성자 불러오기
		//String mnum =  
		
		// 채번 구하기
		String anum = ChabunUtil.getDisadoptionChabun("D", chabunService.getDisadoptionChabun().getAnum());
		logger.info("DisadoptionController boardInsert anum >>> : " + anum);
	
		// 이미지 업로드
		FileUploadUtil fu = new FileUploadUtil(CommonUtils.DISADOPTION_PATH,CommonUtils.DISADOPTION_SIZE,CommonUtils.DISADOPTION_ENCODE);
	
		// 이미지 파일 원본 
		boolean bool = fu.imgfileUpload(req);
		logger.info("DisadoptionController disadoptionboardInsert bool >>>> : " + bool);
		
		// 채번, 이미지 업로드 성공하면 vo 세팅하기
		DisadoptionVO dvo = null;
		dvo = new DisadoptionVO();
		
		// 회원번호 mnum
		//dvo.setMnum(mnum);
		// 회원아이디  (작성자)
		dvo.setMname(fu.getParameter("mname"));
		System.out.println("mname >>> : " + dvo.getMname());
		// 게시판 글번호 anum
		dvo.setAnum(anum);
		System.out.println("anum >>> " + anum);
		// 게시판 글제목 asubject
		dvo.setAsubject(fu.getParameter("asubject"));
		// 글 비밀번호 apw
		dvo.setApw(fu.getParameter("apw"));
		// 유기번호 adno
		dvo.setAdno(fu.getParameter("adno"));
		// 이름 aname
		dvo.setAname(fu.getParameter("aname"));
		// 종구분(강아지,고양이) aupkind
		dvo.setAupkind(fu.getParameter("aupkind"));
		// 세부 종	akind
		dvo.setAkind(fu.getParameter("akind"));		
		// 색상 acolor
		dvo.setAcolor(fu.getParameter("acolor"));
		// 털길이 afur
		dvo.setAfur(fu.getParameter("afur"));
		// 크기 asize
		dvo.setAsize(fu.getParameter("asize"));
		// 중성화여부 aneut
		dvo.setAneut(fu.getParameter("aneut"));
		// 추정나이 aage
		dvo.setAage(fu.getParameter("aage"));
		// 사진  aimage
		ArrayList<String> aFileName = fu.getFileNames();
		String aimage = aFileName.get(0);
		dvo.setAimage(aimage);
		// 성별 agender
		dvo.setAgender(fu.getParameter("agender"));
		// 보호장소 acaresite
		dvo.setAcaresite(fu.getParameter("acaresite"));		
		// 보호장소 전화번호 acaretel
		String acaretel = fu.getParameter("acaretel");
		String acaretel1 = fu.getParameter("acaretel1");
		String acaretel2 = fu.getParameter("acaretel2");
		acaretel = acaretel + acaretel1 + acaretel2;
		dvo.setAcaretel(acaretel);
		// 특징 aspecial
		dvo.setAspecial(fu.getParameter("aspecial"));
		
		
		 logger.info("boardInsert dvo.getAnum >>> : " 		+ dvo.getAnum());
		 logger.info("boardInsert dvo.getAsubject >>> : "   + dvo.getAsubject());
		 logger.info("boardInsert dvo.getApw 		>>> : " + dvo.getApw());
		 logger.info("boardInsert dvo.getAdno >>> : " + dvo.getAdno());
		 logger.info("boardInsert dvo.getAname >>> : " + dvo.getAname());
		 logger.info("boardInsert dvo.getAupkind >>> : " + dvo.getAupkind());
		 logger.info("boardInsert dvo.getAkind >>> : " + dvo.getAkind());
		 logger.info("boardInsert dvo.getAcolor >>> : " + dvo.getAcolor());
		 logger.info("boardInsert dvo.getAfur >>> : " + dvo.getAfur());
		 logger.info("boardInsert dvo.getAsize >>> : " + dvo.getAsize());
		 logger.info("boardInsert dvo.getAneut >>> : " + dvo.getAneut());
		 logger.info("boardInsert dvo.getAage >>> : " + dvo.getAage());
		 logger.info("boardInsert dvo.getAimage >>> : " + dvo.getAimage());
		 logger.info("boardInsert dvo.getAgender >>> : " + dvo.getAgender());
		 logger.info("boardInsert dvo.getAcaresite >>> : " + dvo.getAcaresite());
		 logger.info("boardInsert dvo.getAcaretel >>> : " + dvo.getAcaretel());
	
		int nCnt = disadoptionService.disadoptionboardInsert(dvo);
		
		if(nCnt > 0) {return "disadoption/disadoptionBoardSelectForm";}
		
		
		return "disadoption/disadoptionBoardInsert";
	} 
	
	

}
