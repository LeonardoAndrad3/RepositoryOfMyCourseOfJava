package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramJokerDelimited2 {

	public static void main(String[] args) {
		List<Object> listObject = new ArrayList<>();
		List<Double> listDouble = Arrays.asList(3.14,6.28);
		List<Integer> listInteger = Arrays.asList(1,2,3,4);

		copy(listDouble, listObject);
		printList(listObject);
		copy(listInteger, listObject);
		printList(listObject);
	}

	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number number: source) destiny.add(number);
	}

	public static void printList(List<?> list) {
		for(Object obj : list)System.out.print(obj + " ");
		System.out.println();
	}

}
