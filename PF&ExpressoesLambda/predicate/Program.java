package predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import predicate.entities.Product;
import predicate.util.ProductPredicate;

public class Program {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));	
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("HD Case", 80.90));
		
		//Versions different the predicate
		
		//Interface implements
		list.removeIf(new ProductPredicate());
		
		//Reference method with static method
		list.removeIf(Product::staticProductPredicate);
		
		//Reference method without static method
		list.removeIf(Product::nonStaticProductPredicate);
		
		//Lambda expression declared
		Predicate<Product> pred = p -> p.getPrice() >= 100.00;
		list.removeIf(pred);
		
		//Lambda expression inline;
		list.removeIf(x -> x.getPrice() >= 100);
		
		for(Product p: list)
			System.out.println(p.priceTag());
	}

}
