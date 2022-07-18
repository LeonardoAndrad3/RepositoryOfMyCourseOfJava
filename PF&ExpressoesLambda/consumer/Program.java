package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import predicate.entities.Product;
import util.PriceUpdate;

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
		list.forEach(new PriceUpdate());
		list.forEach(System.out::println);

		System.out.println();

		//Reference method with static method
		list.forEach(Product::staticPriceUpdate);
		list.forEach(System.out::println);

		System.out.println();

		//Reference method without static method
		list.forEach(Product::noStaticPriceUpdate);
		list.forEach(System.out::println);

//		list.forEach(x -> System.out.println(x.priceTag()));

		System.out.println();

		//Lambda expression declared
		Consumer<Product> cons = p -> {
			p.setPrice(p.getPrice() * 1.1);
		};

		list.forEach(cons);
		list.forEach(System.out::println);

		//Lambda expression inline;
		list.forEach(p -> p.setPrice(p.getPrice() * 1.1));
	}
}
