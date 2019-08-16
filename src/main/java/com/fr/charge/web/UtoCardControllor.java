package com.fr.charge.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.fr.charge.config.WxPayConfig;

@Controller
public class UtoCardControllor {
	
	@Autowired
	private WxPayConfig wxPayConfig;

}
