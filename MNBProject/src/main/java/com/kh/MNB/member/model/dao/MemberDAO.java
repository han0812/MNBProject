package com.kh.MNB.member.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("mDAO")
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate sqlSession;
}
