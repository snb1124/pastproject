package com.catchdog.common.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.catchdog.common.dao.ChabunDAO;
import com.catchdog.disadoption.vo.DisadoptionVO;
import com.catchdog.disappearance.vo.DisappearanceVO;
import com.catchdog.goods.vo.GoodsVO;
import com.catchdog.member.vo.MemberVO;
import com.catchdog.notice.vo.NoticeVO;
import com.catchdog.review.vo.ReviewVO;

@Service
@Transactional
public class ChabunServiceImpl implements ChabunService {
	private Logger logger = Logger.getLogger(ChabunServiceImpl.class);

	private ChabunDAO chabunDAO;

	@Autowired(required = false)
	public ChabunServiceImpl(ChabunDAO chabunDAO) {
		this.chabunDAO = chabunDAO;
	}
	// ex)
	// @Override
	// public CatchDogNoticeVO getNoticeChabun(){
	// } logger.info("공지사항 채번 서비스 진입");
	// return chabunDAO.getNoticeChabun();
	// }

	@Override
	public GoodsVO getGoodsChabun() {
		logger.info("굿즈 채번 서비스 진입");
		return chabunDAO.getGoodsChabun();
	}

	@Override
	public GoodsVO getGpdChabun() {
		logger.info("굿즈 상품번호 채번 서비스 진입");
		return chabunDAO.getGpdChabun();
	}

	@Override
	public MemberVO getMemChabun() {
		// TODO Auto-generated method stub
		logger.info("회원가입 채번 서비스 진입");

		return chabunDAO.getMemChabun();
	}

	@Override
	public DisadoptionVO getDisadoptionChabun() {
		// TODO Auto-generated method stub
		logger.info("ChabunServiceImpl getMemChabun >>> : ");

		return chabunDAO.getDisadoptionChabun();
	}

	@Override
	public ReviewVO getReviewChabun() {
		// TODO Auto-generated method stub
		return chabunDAO.getReviewChabun();
	}

	@Override
	public NoticeVO getNoticeChabun() {
		// TODO Auto-generated method stub
		logger.info("ChabunServiceImpl.getNoticeChabun(공지사항 게시판번호 채번)>>>");
		return chabunDAO.getNoticeChabun();
	}

//	@Override
//	public AdoptionVO getdoptionChabun() {
//		// TODO Auto-generated method stub
//		return chabunDAO.getAdoptionChabun();
//	}
//
	@Override
	public DisappearanceVO getDisappearanceChabun() {
		// TODO Auto-generated method stub
		return chabunDAO.getDisappearanceChabun();
	}

}
