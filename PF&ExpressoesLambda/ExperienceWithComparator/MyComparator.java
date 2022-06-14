package ExperienceWithComparator;

import java.util.Comparator;

import entities.Product;

public class MyComparator{
	public static Comparator<Product> comp = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
}
