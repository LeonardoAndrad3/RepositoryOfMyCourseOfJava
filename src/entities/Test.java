package entities;

public class Test {

	private double idade;
	private String name;
	
	
	public Test() {
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getIdade() {
		return this.idade;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setIdade(double idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return name +" "+ idade;
	}
	
	
}
