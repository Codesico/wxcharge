package com.fr.charge.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter
@Component
@Configuration
@PropertySource(value = "classpath:wxPayConfig.properties")
public class WxPayConfig {
	
	@Value("${uto.chat.pay.notify.url}")
	private String unotifyUrl;

	@Value("${uto.chat.pay.notify.frcurl}")
	private String unotifyFrcUrl;

	@Value("${server.ip}")
	private String serverIp;

	@Value("${base.url}")
	private String baseUrl;

	@Value("${uto.action}")
	private String uactionName;

	@Value("${uto.wxAppId}")
	private String uwxAppId;

	@Value("${uto.wxAppsecret}")
	private String uwxAppsecret;

	@Value("${uto.mchId}")
	private String umchId;

	@Value("${uto.mchKey}")
	private String umchKey;
	
	/************************************************国际MIFI**********************************************/
	@Value("mifi.wxAppId")
	private String mwxAppId;
	
	@Value("mifi.wxAppsecret")
	private String mwxAppsecret;
	
	@Value("mifi.mchid")
	private String mmchid;
	
	@Value("mifi.mchkey")
	private String mmchkey;
	
	@Value("mifi.chat.pay.notify.url")
	private String mnotifyUrl;

}
