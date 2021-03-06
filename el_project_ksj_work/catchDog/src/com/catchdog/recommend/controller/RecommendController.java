package com.catchdog.recommend.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.catchdog.recommend.service.RecommendService;
import com.catchdog.recommend.vo.RecommendVO;

@Controller
public class RecommendController {
	Logger logger = Logger.getLogger(RecommendController.class);
	
	private RecommendService recommendService;

	@Autowired(required=false)
	public RecommendController(RecommendService recommendService) {
		this.recommendService = recommendService;
	}
	
	@PostMapping("recommendForm")
	public String recommendForm(HttpServletRequest req, Model model) {
		model.addAttribute("mnum", req.getParameter("mnum"));
		return "recommend/RecommendForm";
	}
	
	@PostMapping("recommendInsert")
	public String RecommendInsert(HttpServletRequest req, Model model) {
		RecommendVO rvo = null;
		rvo = new RecommendVO();

		rvo.setMnum(req.getParameter("mnum"));
		rvo.setAupkind(req.getParameter("aupkind"));
		rvo.setAkind(req.getParameter("akind"));
		rvo.setAsize(req.getParameter("asize"));
		rvo.setAfur(req.getParameter("afur"));
		rvo.setAgender(req.getParameter("agender"));
		rvo.setAcaresite(req.getParameter("acaresite"));
		
		int nCnt = recommendService.recommendInsert(rvo);
		if (nCnt > 0) {
			model.addAttribute("message", "저장되었습니다.");
		}else {
			model.addAttribute("message", "실패.");
		}
		return "recommend/RecommendMessage";
	}
	
	@PostMapping("recommendSelect")
	public String RecommendSelect(RecommendVO rvo, Model model) {
		
		List<RecommendVO> listS = recommendService.recommendSelect(rvo);
		
		if (listS.size() == 1) {
			model.addAttribute("listS", listS);
			return "recommend/RecommendSelect";
		}
		return "recommend/RecommendForm";
	}
	
	@PostMapping("recommendUpdateForm")
	public String RecommendUpdateForm(HttpServletRequest req, RecommendVO rvo, Model model) {
		logger.info("recommendUpdateForm() 함수 진입 >>> : ");
		List<RecommendVO> listS = recommendService.recommendSelect(rvo);
		if (listS.size() == 0) {
			return "recommend/RecommendForm";
		} else {
			model.addAttribute("listS", listS);
			return "recommend/RecommendUpdate";
		}
	}
	
	@PostMapping("recommendUpdate")
	public String RecommendUpdate(HttpServletRequest req, RecommendVO rvo, Model model) {
		logger.info("recommendUpdate() 함수 진입 >>> : ");
		
		rvo.setAupkind(req.getParameter("aupkind"));
		rvo.setAsize(req.getParameter("asize"));
		rvo.setAfur(req.getParameter("afur"));
		rvo.setAkind(req.getParameter("akind"));
		rvo.setAgender(req.getParameter("agender"));
		rvo.setAcaresite(req.getParameter("acaresite"));
		
		int nCnt = recommendService.recommendUpdate(rvo);
		if (nCnt == 1) {
			model.addAttribute("message", "수정되었습니다.");
		} else {
			model.addAttribute("message", "실패라니 쳇");
		}
		return "recommend/RecommendMessage";
	}
	
}
