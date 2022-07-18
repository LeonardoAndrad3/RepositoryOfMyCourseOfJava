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

	//O override é para sobrescrever um método

	@Override
	public final void withdraw(double amount) {
		balance -= amount;
	}
	// O final é para indicar que esse método não pode ser sobreposto;
	// Atribuindo assim, maior segurança no código. Se tiver o final em uma classe, essa, não pode ser herdada;
}
