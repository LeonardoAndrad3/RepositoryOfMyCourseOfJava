package functionReceivingFunction;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import model.services.ProductService;
import predicate.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.90));

		System.out.println("Sum = " + String.format("%.2f", new ProductService().filterSum(list, p -> p.getName().charAt(0) == 'T')));
	}

}
