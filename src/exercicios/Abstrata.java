package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribute;
import entities.PeopleCompany;
import entities.PeoplePhysic;

public class Abstrata {

	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribute> list = new ArrayList<>();
		
			System.out.print("Enter the number of tax payers: ");
			int n = sc.nextInt();
						
			for(int i= 1; i<=n; i++) {
				System.out.println("Tax payer #"+i+" data:");
			
				System.out.print("Individual or company (i/c)? ");
				char ch = sc.next().charAt(0);
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double income = sc.nextDouble();
				
				switch(ch){
					case 'i':
						System.out.print("Health expenditures: ");
						double health = sc.nextDouble();
						list.add(new PeoplePhysic(name, income, health));
					break;
					case 'c':
						System.out.print("Number of employees: ");
						int employee = sc.nextInt();
						list.add(new PeopleCompany(name, income, employee));
					break;
					
					default:
						System.out.println("Empty, this is err!");
					break;
				}
			}
			System.out.println();
			System.out.println("TAXES PAID:");
			double sum = 0;
			for(Contribute x : list) {
				System.out.println(x.getName()+": $"+ String.format("%.2f",x.tax()));
				sum += x.tax();
			}
			
			System.out.println();
			System.out.println("TOTAL TAXES: $ "+ String.format("%.2f", sum));
		
		sc.close();
	}
	
	
}
