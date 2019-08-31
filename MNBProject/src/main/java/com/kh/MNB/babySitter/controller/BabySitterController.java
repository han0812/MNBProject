package com.kh.MNB.babySitter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kh.MNB.babySitter.model.service.BabySitterService;

@Controller
public class BabySitterController
{
	@Autowired
	BabySitterService bsService;
	
	
}
