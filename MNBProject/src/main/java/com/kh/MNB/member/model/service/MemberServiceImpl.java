package com.kh.MNB.member.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.MNB.member.model.dao.MemberDAO;

@Service("mService")
public class MemberServiceImpl implements MemberService {
	
	@Autowired
	MemberDAO mDAO;
	
	
}
