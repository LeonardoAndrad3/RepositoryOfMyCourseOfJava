package entities;

public class Bank {

	private String name;
	private int numberAccount;
	private double priceAccount;
	
	public Bank() {
		
	}
		
	public Bank(String name, int numberAccount, double priceAccount) {
		this.name = name;
		this.numberAccount = numberAccount;
		deposit(priceAccount);
	}
	
	public Bank(String name, int numberAccount) {
		this.name = name;
		this.numberAccount = numberAccount;
		this.priceAccount = 0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberAccount() {
		return numberAccount;
	}
	public double getPriceAccount() {
		return priceAccount;
	}
	public void setPriceAccount(double priceAccount) {
		this.priceAccount = priceAccount;
	}
	
	public void deposit(double deposit) {
		this.priceAccount += deposit;
		toString();
	}
	public void saque(double saque) {
		this.priceAccount -= saque+5.0;
		toString();
	}
	
	
	@Override
	public String toString() {
		return "The Sr."+this.name
				+", have $" 
				+ String.format("%.2f", priceAccount)
				+" dollars. Your account number is: "
				+numberAccount; 
	}
	
	
	
	
	
	
}
