package com.catchdog.notice.controller;

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

import com.catchdog.common.ChabunUtil;
import com.catchdog.common.CommonUtils;
import com.catchdog.common.FileUploadUtil;
import com.catchdog.common.service.ChabunService;
import com.catchdog.notice.service.NoticeService;
import com.catchdog.notice.vo.NoticeVO;

@Controller
public class NoticeController {
	Logger logger = Logger.getLogger(NoticeController.class);
	
	private NoticeService noticeService;
	private ChabunService chabunService;
	
	//해당 인스턴스 변수에 스프링으로부터 자동으로 Bean을 주입, new 연사자와 같음
	@Autowired(required=false)
	public NoticeController( NoticeService noticeService,ChabunService chabunService) {
		this.noticeService = noticeService;
		this.chabunService = chabunService;
	}
	
	//게시판 글 입력 폼 
	@GetMapping("/noticeForm")
	public String noticeForm(){
		
		logger.info("NoticeController.noticeInsert() >>>");
		
		return "notice/NoticeForm";
	}
	
	//공지사항 입력 폼에 글쓰기 
	@PostMapping("/noticeInsert")
	//@RequestMapping(value="noticeInsert", method= {RequestMethod.POST, RequestMethod.GET})
	public String noticeInsert(HttpServletRequest req){
		logger.info("NoticeController.noticeInsert()>>>");
		
		//게시판 번호 채번구하기
		String nnum =ChabunUtil.getNoticeChabun("N",chabunService.getNoticeChabun().getNnum());
		logger.info("NoticeController.noticeInsert.nnum >>>:" + nnum);
		
		//이미지 업로드
		FileUploadUtil fu = new FileUploadUtil(CommonUtils.NOTICE_PATH,
											   CommonUtils.NOTICE_SIZE,
											   CommonUtils.NOTICE_ENCODE);
		//boolean bool = fu.imgfileUpload(req);
		boolean bool = fu.imgfileUploadSize(req);
		logger.info("NoticeController.noticeInsert.bool(이미지 업로드) >>>:" + bool);
		
		//채번, 이미지 업로드 성공하면 vo 세팅하기 
		NoticeVO _nvo = null;
		_nvo = new NoticeVO();
	
		_nvo.setNnum(nnum);
		_nvo.setNtitle(fu.getParameter("ntitle"));
		_nvo.setNcontent(fu.getParameter("ncontent"));
		_nvo.setNimage(fu.getFileName("nimage"));
		logger.info("fu.getFileNames() >>> : " + fu.getFileNames());
		
		logger.info("CatchDogNoticeController.noticeInsert _nvo.getNnum()>>>" +  _nvo.getNnum());
		logger.info("CatchDogNoticeController.noticeInsert _nvo.getNtitle()>>>" + _nvo.getNtitle());
		logger.info("CatchDogNoticeController.noticeInsert _nvo.getNcontent()>>>" +  _nvo.getNcontent());
		logger.info("CatchDogNoticeController.noticeInsert _nvo.getNimage()>>>" + _nvo.getNimage());
		
		int nCnt = noticeService.noticeInsert(_nvo);
		logger.info("NoticeController.noticeInsert nCnt(이미지 업로드)" + nCnt);
		
		if(nCnt >0) {return "notice/NoticeInsert";}
		return "notice/NoticeForm";
	}
	
	//전체조회 
	@GetMapping("/noticeSelectAll")
	public String noticeSelectAll(NoticeVO nvo, Model model) {
		logger.info("NoticeController.noticeSelectAll() >>>");
		
		List<NoticeVO> listAll = noticeService.noticeSelectAll(nvo);
		logger.info("NoticeController.listAll.size() >>>:" + listAll.size());
		
		if(listAll.size()>0) {
			model.addAttribute("listAll",listAll);
			return "notice/noticeSelectAll";
		}
		
		return "notice/NoticeForm";
	}
	
	//수정 삭제
	@PostMapping("/noticeSelect")
	public String noticeSelect(NoticeVO nvo, Model model){
		logger.info("NoticeController.noticeSelect()>>>");
		logger.info("NoticeController.noticeSelect nvo.getNnum()>>>>"+nvo.getNnum());
		
		List<NoticeVO> listS = noticeService.noticeSelect(nvo);
		logger.info("NoticeController.noticeSelect listS.size()" + listS.size());
		
		if(listS.size() ==1) {
			model.addAttribute("listS",listS);
			return "notice/NoticeSelect";
	}
	
	return "notice/NoticeForm";
	}
	
	//글 수정 
	@PostMapping("/noticeUpdate")
	public String noticeUpdate(NoticeVO nvo, Model model) {
		logger.info("NoticeController.noticeUpdate()>>>");
		logger.info("NoticeController.noticeUpdat.nvo.getNnum()>>>"+nvo.getNnum());
		logger.info("NoticeController.noticeUpdate.nvo.getNtitle()>>>"+nvo.getNtitle());
		logger.info("NoticeController.noticeUpdate.nvo.getNcontent()>>>"+nvo.getNcontent());
		
		int nCnt = noticeService.noticeUpdate(nvo);
		logger.info("NoticeController.noticeUpdate.nCnt" + nCnt);
		if(nCnt >0) {return "notice/NoticeUpdate";}
		return "notice/NoticeForm";
	}
	
	
	//글 삭제 
	@PostMapping("/noticeDelete")
	public String noticeDelete(NoticeVO nvo , Model model){
		logger.info("NoticeController.noticeDelete() >>>");
		logger.info("NoticeController.noticeUpdat.nvo.getNnum()>>>"+nvo.getNnum());
		int nCnt =noticeService.noticeDelete(nvo);
		logger.info("NoticeController.noticeDelete.nCnt" + nCnt);
		
		if(nCnt >0) {return "notice/NoticeDelete";}
		return "notice/NoticeForm";
	}
	
	//페이징 
	@RequestMapping(value="NoticeSelectPaging",method= {RequestMethod.POST, RequestMethod.GET})
	public String NoticeSelectPaging(NoticeVO nvo , Model model) {
		logger.info("NoticeController.NoticeSelectPaging()>>>:");
		
		//페이징 변수 세팅
		int pageSize= CommonUtils.NOTICE_PAGE_SIZE;
		int groupSize=CommonUtils.NOTICE_GROUP_SIZE;
		int curPage = CommonUtils.NOTICE_CUR_PAGE;
		int totalCount=CommonUtils.NOTICE_TOTAL_COUNT;
		
		if(nvo.getCurPage() != null) {
			curPage = Integer.parseInt(nvo.getCurPage());
		}
		nvo.setPageSize(String.valueOf(pageSize));
		nvo.setGroupSize(String.valueOf(groupSize));
		nvo.setCurPage(String.valueOf(curPage));
		nvo.setTotalCount(String.valueOf(totalCount));
		
		logger.info("NoticeController.NoticeSelectPaging.nvo.getPageSize()>>>:" + nvo.getPageSize());
		logger.info("NoticeController.NoticeSelectPaging.nvo.getGroupSize()>>>:" +nvo.getGroupSize());
		logger.info("NoticeController.NoticeSelectPaging.nvo.getCurPage()>>>:" + nvo.getCurPage());
		logger.info("NoticeController.NoticeSelectPaging.nvo.getTotalCount()>>>:" + nvo.getTotalCount());
		
		List<NoticeVO> listAll = noticeService.noticeSelectPaging(nvo);
		logger.info("NoticeController.NoticeSelectPaging.listAll.size()>>>:" + listAll.size());
		
		if(listAll.size()>0) {
			model.addAttribute("pagingNVO",nvo);
			model.addAttribute("listAll", listAll);
			return "notice/NoticeSelectPaging";
		}
		return "notice/NoticeForm";
	}
	
}
