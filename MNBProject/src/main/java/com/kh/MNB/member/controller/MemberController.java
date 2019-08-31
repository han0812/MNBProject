package com.kh.MNB.member.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kh.MNB.member.model.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	MemberService mService;
	
	
}
