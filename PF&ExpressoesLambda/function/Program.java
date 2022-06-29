package function;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import predicate.entities.Product;
import util.UpperCaseName;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.90));
		
		//Interface implements
		List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		//Reference method with static method
		names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		
		//Reference method without static method
		names = list.stream().map(Product::noStaticUpperCaseName).collect(Collectors.toList());
		
		//Lambda expression declared
		Function<Product,String> upperName = p -> p.getName().toUpperCase();
		names = list.stream().map(upperName).collect(Collectors.toList());
		
		//Lambda expression inline
		names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
				
		names.forEach(System.out::println);
	}

}
