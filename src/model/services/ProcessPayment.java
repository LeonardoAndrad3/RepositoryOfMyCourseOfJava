package model.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import model.entites.Contract;
import model.entites.Installment;

public class ProcessPayment {
	
	private Double amount;
	private Date contractData;
	private Integer installments;
	
	private ServicePayment service;
	List<Installment> list = new ArrayList<>();
	
	public ProcessPayment() {
		
	}
	
	public ProcessPayment(Contract ct, Integer installments, ServicePayment service) {
		this.amount = ct.getTotalValue();
		this.contractData = ct.getDate();
		this.installments = installments;
		this.service = service;
		paymentInstance();
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public Date getContractData() {
		return contractData;
	}

	public void setContractData(Date contractData) {
		this.contractData = contractData;
	}

	public Integer getInstallments() {
		return installments;
	}

	public void setInstallments(Integer installments) {
		this.installments = installments;
	}

	public ServicePayment getService() {
		return service;
	}

	public void setService(ServicePayment service) {
		this.service = service;
	}
	
	public List<Installment> getList() {
		return list;
	}

	public void paymentInstance() {
		double pricePerInstallment = amount/installments;
		Calendar c = Calendar.getInstance();
		c.setTime(getContractData());
		
		for(int i=1;i<=installments;i++) {
			double taxInstallment = service.calcTaxInstallment(pricePerInstallment, i);
			c.add(Calendar.MONTH, 1);
			list.add(new Installment(c.getTime(), taxInstallment));
		}
	}
	
	
	
	
	
}
