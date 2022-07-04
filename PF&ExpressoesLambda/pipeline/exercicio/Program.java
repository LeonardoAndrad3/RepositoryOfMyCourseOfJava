package pipeline.exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import predicate.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String path = "C:\\Users\\leona\\out\\product.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			List<Product> list = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			double avg = list.stream()
				.map(p -> p.getPrice())
				.reduce(0.0, Double::sum) / list.size();
			
			System.out.println("Average price: " + String.format("%.2f", avg));
			
			
			List<String> names = list.stream()
					.filter(p -> p.getPrice() < avg)
					.map(p -> p.getName())
					.sorted((x,y) -> - x.toUpperCase().compareTo(y.toUpperCase()))
					.collect(Collectors.toList());
			
			names.forEach(System.out::println);
		}
		catch(IOException e){
			System.out.println("Error " + e.getMessage());
		}
		finally {
			sc.close();
		}
		
	}

}
