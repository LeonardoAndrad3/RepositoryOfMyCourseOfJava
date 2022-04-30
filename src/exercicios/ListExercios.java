package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.RegisterE;

public class ListExercios {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		List<RegisterE> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Employee #" + i);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			list.add( new RegisterE(id, name, salary));		
		}
		
		System.out.print("Enter the employee id that will have salary increase: ");
		Integer idIncrease = sc.nextInt();
		RegisterE aux = list.stream().filter(x -> x.getId() == idIncrease).findFirst().orElse(null);
		System.out.print("Enter the percentage: ");
		aux.increase(sc.nextDouble());
		
		System.out.println("List of employees: ");
		for(RegisterE x: list) {
			System.out.println(x);
		}
		
		sc.close();		
	}
	
}
