package com.kh.MNB.chat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.kh.MNB.chat.model.service.ChatService;

@Controller
public class ChatController
{
	@Autowired
	ChatService cService;
	
	
}
