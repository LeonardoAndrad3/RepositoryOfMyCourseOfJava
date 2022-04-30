package entities;

public class RegisterE {

	private Integer id;
	private String name;
	private Double salary;
	
	public RegisterE(Integer id, String name, Double slary) {
		this.id = id;
		this.name = name;
		this.salary = slary;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double slary) {
		this.salary = slary;
	}
	public void increase(Double por) {
		this.salary += this.salary/100*por;
	}

	@Override
	public String toString() {
		return id + ", " + name + ", " + salary;
	}
	
	
	
}
