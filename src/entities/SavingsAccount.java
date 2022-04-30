package entities;

public class SavingsAccount extends Account {

	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	//O override � para sobrescrever um m�todo
	
	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
	// O final � para indicar que esse m�todo n�o pode ser sobreposto;
	// Atribuindo assim, maior seguran�a no c�digo. Se tiver o final em uma classe, essa, n�o pode ser herdada;
}
