package com.himedia.twoving.vo;

import java.sql.Timestamp;

public class PaymentVO {
	private int pmseq;
	private String subscribeyn;
	private String productname;
	private String paymentprice;
	private String paymentmeans;
	private Timestamp paymentday;
	private Timestamp runperiod1;
	private Timestamp runperiod2;
	public int getPmseq() {
		return pmseq;
	}
	public void setPmseq(int pmseq) {
		this.pmseq = pmseq;
	}
	public String getSubscribeyn() {
		return subscribeyn;
	}
	public void setSubscribeyn(String subscribeyn) {
		this.subscribeyn = subscribeyn;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getPaymentprice() {
		return paymentprice;
	}
	public void setPaymentprice(String paymentprice) {
		this.paymentprice = paymentprice;
	}
	public String getPaymentmeans() {
		return paymentmeans;
	}
	public void setPaymentmeans(String paymentmeans) {
		this.paymentmeans = paymentmeans;
	}
	public Timestamp getPaymentday() {
		return paymentday;
	}
	public void setPaymentday(Timestamp paymentday) {
		this.paymentday = paymentday;
	}
	public Timestamp getRunperiod1() {
		return runperiod1;
	}
	public void setRunperiod1(Timestamp runperiod1) {
		this.runperiod1 = runperiod1;
	}
	public Timestamp getRunperiod2() {
		return runperiod2;
	}
	public void setRunperiod2(Timestamp runperiod2) {
		this.runperiod2 = runperiod2;
	}
}
