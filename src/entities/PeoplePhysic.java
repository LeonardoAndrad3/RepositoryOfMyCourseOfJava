package entities;

public class PeoplePhysic extends Contribute {

	private Double spentWithHealth;
	
	public PeoplePhysic() {}
	
	public PeoplePhysic(String name, Double income) {
		super(name, income);
	}
	
	public PeoplePhysic(String name, Double income, Double spentWithHealth) {
		super(name, income);
		this.spentWithHealth = spentWithHealth;
	}

	public Double getSpentWithHealth() {
		return spentWithHealth;
	}

	public void setSpentWithHealth(Double spentWithHealth) {
		this.spentWithHealth = spentWithHealth;
	}

	@Override
	public double tax() {
		double auxTax = 0;
		if(income < 20000) {
				auxTax = (income*0.15)-(spentWithHealth*0.50);		
		} else if(income >= 20000) {
				auxTax = (income*0.25)-(spentWithHealth*0.50);
		}
		if(auxTax < 0) {
			auxTax = 0;
		}
		return auxTax;
	}

}
