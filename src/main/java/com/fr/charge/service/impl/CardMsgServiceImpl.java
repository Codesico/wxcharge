package com.fr.charge.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fr.charge.dao.CardMsgMapper;
import com.fr.charge.pojo.CardMsg;
import com.fr.charge.service.CardMsgService;

@Service
public class CardMsgServiceImpl implements CardMsgService {

//	private Logger log = LoggerFactory.getLogger(getClass());

	@Autowired
	private CardMsgMapper cardMsgMapper;

	@Override
	public List<CardMsg> query() {
		return cardMsgMapper.query();
	}

}
