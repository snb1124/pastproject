package com.catchdog.review.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.catchdog.review.vo.ReviewVO;

@Repository
public class ReviewDAOImpl implements ReviewDAO {
	Logger logger = Logger.getLogger(ReviewDAOImpl.class);
	
	@Autowired(required=false)
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<ReviewVO> reviewSelectAll(ReviewVO rvo) {
		// TODO Auto-generated method stub
		logger.info("ReviewDAOImpl reviewSelectAll() 함수 진입 >>> : ");
		return sqlSession.selectList("reviewSelectPaging", rvo);
	}

	@Override
	public List<ReviewVO> reviewSelect(ReviewVO rvo) {
		// TODO Auto-generated method stub
		logger.info("ReviewDAOImpl memberSelect() 함수 진입 >>> : ");
		return sqlSession.selectList("reviewSelect", rvo);
	}

	@Override
	public int reviewInsert(ReviewVO rvo) {
		// TODO Auto-generated method stub
		return (Integer)sqlSession.insert("reviewInsert", rvo);
	}

	@Override
	public int reviewUpdate(ReviewVO rvo) {
		// TODO Auto-generated method stub
		return (Integer)sqlSession.update("reviewUpdate", rvo);
	}

	@Override
	public int reviewDelete(ReviewVO rvo) {
		// TODO Auto-generated method stub
		return (Integer)sqlSession.delete("reviewDelete", rvo);
	}

}
