package com.kh.MNB.bsApply.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("bsaDAO")
public class BsApplyDAO {
	
	@Autowired
	SqlSessionTemplate sqlSession;
}
