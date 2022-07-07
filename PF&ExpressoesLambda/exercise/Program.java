package exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		String path = ("C:\\Users\\leona\\out\\out.txt");
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			System.out.print("Enter salary: ");
			double minSalary = sc.nextDouble();
			
			
			String line = br.readLine();
			while(line != null) {
				String[] em = line.split(",");
				list.add(new Employee(em[0],em[1],Double.parseDouble(em[2])));
				line = br.readLine();
			}
			
			list.stream()
			.filter(x -> x.getSalary() >= minSalary)
			.sorted((x,y) -> x.getEmail().toUpperCase().compareTo(y.getEmail().toUpperCase()))
			.forEach(x -> System.out.println(x.getEmail()));
			
			double sum = list.stream().filter(x -> x.getName().charAt(0) == 'M' ).map(x -> x.getSalary())
			.reduce(0.0, (x,y) -> x + y);
			
			System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
			
		
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		} 
		catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		finally{
			sc.close();
		}	
		
	
	}

}
