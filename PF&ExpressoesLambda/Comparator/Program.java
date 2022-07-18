package Comparator;

import java.util.ArrayList;
import java.util.List;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1200.00));
		list.add(new Product("Tablet", 450.00));

		//Comparator<Product> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		//This is Arrow function in java;

		//list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		list.sort(MyComparator.comp);
		//this function receive comparator as argument and responsible in sort collection per comparator

		for(Product p : list) {
			System.out.println(p.priceTag());
		}
	}

}
