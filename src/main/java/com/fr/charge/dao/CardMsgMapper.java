package com.fr.charge.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fr.charge.pojo.CardMsg;

@Mapper
public interface CardMsgMapper {
	
	public List<CardMsg> query();

}
