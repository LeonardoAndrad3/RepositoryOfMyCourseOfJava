package application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import entities.Product;

public class ProgramMap {

	public static void main(String[] args) {


		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99711122");

		//Put is used for insert;

		cookies.remove("email");
		//remove per reference

		cookies.put("phone", "99711133");
		//when object is duplicate, this object is override and your value too;

		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));
		//This method check if contains exist values at key
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		//Get method is used for get values from the key
		//If values from the key no exist, the method return 'null'

		System.out.println("Size: " + cookies.size());
		// size return this size

		System.out.println("ALL COOKIES:");
		for(String key:cookies.keySet())
			System.out.println(key+": "+cookies.get(key));

		Map<Product, Double> stock = new HashMap<>();

		Product p1 = new Product("TV", 900);
		Product p2 = new Product("TV", 900);
		Product p3 = new Product("TV", 900);

		stock.put(p1, 10000.0);
		stock.put(p2, 20000.0);
		stock.put(p3, 15000.0);

		Product ps = new Product("TV", 900);

		System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
		//return is null, because this object without equals and HashCode
	}
}
