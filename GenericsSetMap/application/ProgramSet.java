package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProgramSet {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();
		// more speed, no order

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		System.out.println(set.contains("Notebook"));
		// contains check if exist

		for (String p : set)
			System.out.println(p);

		System.out.println();

		set = new TreeSet<>();
		// more slow, order per compareTo

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		// set.removeIf(x -> x.length() >= 3);
		// set.removeIf(x -> x.charAt(0) == 'T');
		// Remove per predicate

		System.out.println(set.contains("Notebook"));

		for (String p : set)
			System.out.println(p);

		System.out.println();

		set = new LinkedHashSet<>();
		// Velocity middle, elements in order per the add

		set.add("TV");
		set.add("Notebook");
		set.add("Tablet");

		set.remove("Tablet");

		System.out.println(set.contains("Notebook"));

		for (String p : set)
			System.out.println(p);

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));

		// union
		Set<Integer> c = new TreeSet<>(a);
		c.addAll(b);
		System.out.println(c);

		// Intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);

		// Difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);
	}

}
