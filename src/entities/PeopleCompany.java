package entities;

public class PeopleCompany extends Contribute {

	private Integer employee;
		
	public PeopleCompany() {super();}
	
	public PeopleCompany(String name, Double income, Integer employee) {
		super(name, income);
		this.employee = employee;
	}

	public Integer getEmployee() {
		return employee;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}

	@Override
	public double tax() {
		double auxTax;
		if(employee>10) {
			auxTax = income*0.14;
		} else {
			auxTax = income*0.16;
		}
		if(auxTax < 0) {
			auxTax = 0;
		}

		return auxTax;
	}

	
	
}
