package com.kh.MNB.board.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("bDAO")
public class BoardDAO {
	
	@Autowired
	SqlSessionTemplate sqlSession;
}
