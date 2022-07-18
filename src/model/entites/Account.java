package model.entites;

import model.exceptions.AccountException;

public class Account {

	private Integer number;
	private String holder;
	protected Double balance;
	private Double withdrawLimit;

	public Account() {}

	public Account(Integer number, String holder, Double balance,Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Account(Integer number, String holder, Double balance) {
		super();
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	//Functions

	public void withdraw(double amount){
		valitedWithdraw(amount);
		balance -= amount;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	private void valitedWithdraw(double amount){
		if(amount > withdrawLimit) {
			throw new AccountException("Withdraw error: the amount exceeds withdraw limit");
		}
		else if(amount > balance) {
			throw new AccountException("Withdraw erro: not enough balance");
		}
	}

}
