package entities;

// O extends é herança, quando uma classe herda atributos de outras
public class BusinessAccount extends Account {

	private Double loandLimit;


	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loandLimit) {
		super(number, holder, balance);
		this.loandLimit = loandLimit;
	}


	public Double getLoandLimit() {
		return loandLimit;
	}


	public void setLoandLimit(Double loandLimit) {
		this.loandLimit = loandLimit;
	}

	public void loan(double amount) {
		if(amount <= loandLimit) {
			balance += amount - 10.0;
		}
	}

	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		// Aqui o super aproveita o código no superClass;
		balance -= 2.0;
	}
}
