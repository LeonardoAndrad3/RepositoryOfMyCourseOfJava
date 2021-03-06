package list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) 	{

		List<String> list = new ArrayList<>();

		list.add("Leonardo");
		list.add("Maria");
		list.add("Marcia");
		list.add("Leandro");
		list.add(2, "Narco");

		System.out.println(list.size());

		for(String x : list) {
			System.out.println(x);
		}

		System.out.println("-----------------------");

		list.removeIf(x -> x.charAt(0) == 'M');
		for(String x : list) {
			System.out.println(x);
		}

		System.out.println("-----------------------");
		System.out.println("Index of bob: " + list.indexOf("bob"));
		System.out.println("-----------------------");

		List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());

		for(String x : result) {
			System.out.println(x);
		}

		System.out.println("-----------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'L').findFirst().orElse(null);
		System.out.println(name);
	}
}
