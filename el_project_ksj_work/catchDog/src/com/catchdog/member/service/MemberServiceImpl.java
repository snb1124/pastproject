package com.catchdog.member.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.catchdog.member.dao.MemberDAO;
import com.catchdog.member.vo.MemberVO;

@Service
@Transactional
public class MemberServiceImpl implements MemberService{

	Logger logger = Logger.getLogger(MemberServiceImpl.class);
	
	private MemberDAO memberDAO;
	
	@Autowired(required=false)
	public MemberServiceImpl(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public List<MemberVO> memberSelectAll(MemberVO mvo) {
		// TODO Auto-generated method stub
		logger.info("MemberServiceImpl memberSelectAll() 함수 진입 >>> : ");
		
		return memberDAO.memberSelectAll(mvo);
	}

	@Override
	public List<MemberVO> memberSelect(MemberVO mvo) {
		// TODO Auto-generated method stub
		logger.info("MemberServiceImpl memberSelect() 함수 진입 >>> : ");
		
		return memberDAO.memberSelect(mvo);
	}

	@Override
	public int memberInsert(MemberVO mvo) {
		// TODO Auto-generated method stub
		logger.info("MemberServiceImpl memberInsert() 함수 진입 >>> : ");
		
		return memberDAO.memberInsert(mvo);
	}

	@Override
	public int memberUpdate(MemberVO mvo) {
		// TODO Auto-generated method stub
		logger.info("MemberServiceImpl memberUpdate() 함수 진입 >>> : ");
		
		return memberDAO.memberUpdate(mvo);
	}

	@Override
	public int memberDelete(MemberVO mvo) {
		// TODO Auto-generated method stub
		logger.info("MemberServiceImpl memberDelete() 함수 진입 >>> : ");
		
		return memberDAO.memberDelete(mvo);
	}

	@Override
	public List<MemberVO> memberIdCheck(MemberVO mvo) {
		// TODO Auto-generated method stub
		logger.info("MemberServiceImpl memberIdCheck() 함수 진입 >>> : ");
		return memberDAO.memberIdCheck(mvo);
	}
	
	@Override
	public List<MemberVO> socialCheck(MemberVO mvo){
		return memberDAO.socialCheck(mvo);
	}
	
}
