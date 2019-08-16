package com.fr.charge.pojo;

import java.io.Serializable;
import java.sql.Timestamp;
public class CardMsg implements Serializable {

	private static final long serialVersionUID = 123456001l;

	private Long id;
	private String cardNumber;
	private String cardNo;
	private String cardImsi;
	private String vrCardNumber;
	private String cardIsp;
	private String cardClass;
	private String cardCustomer;
	private Timestamp crtTime;
	private Timestamp updTime;

	public CardMsg() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CardMsg(String cardNumber, String cardNo, String cardImsi, String vrCardNumber, String cardIsp,
			String cardClass, String cardCustomer, Timestamp crtTime, Timestamp updTime) {
		super();
		this.cardNumber = cardNumber;
		this.cardNo = cardNo;
		this.cardImsi = cardImsi;
		this.vrCardNumber = vrCardNumber;
		this.cardIsp = cardIsp;
		this.cardClass = cardClass;
		this.cardCustomer = cardCustomer;
		this.crtTime = crtTime;
		this.updTime = updTime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardImsi() {
		return cardImsi;
	}

	public void setCardImsi(String cardImsi) {
		this.cardImsi = cardImsi;
	}

	public String getVrCardNumber() {
		return vrCardNumber;
	}

	public void setVrCardNumber(String vrCardNumber) {
		this.vrCardNumber = vrCardNumber;
	}

	public String getCardIsp() {
		return cardIsp;
	}

	public void setCardIsp(String cardIsp) {
		this.cardIsp = cardIsp;
	}

	public String getCardClass() {
		return cardClass;
	}

	public void setCardClass(String cardClass) {
		this.cardClass = cardClass;
	}

	public String getCardCustomer() {
		return cardCustomer;
	}

	public void setCardCustomer(String cardCustomer) {
		this.cardCustomer = cardCustomer;
	}

	public Timestamp getCrtTime() {
		return crtTime;
	}

	public void setCrtTime(Timestamp crtTime) {
		this.crtTime = crtTime;
	}

	public Timestamp getUpdTime() {
		return updTime;
	}

	public void setUpdTime(Timestamp updTime) {
		this.updTime = updTime;
	}

}
