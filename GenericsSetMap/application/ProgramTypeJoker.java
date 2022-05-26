package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramTypeJoker {
	
	public static void main(String[] args) {
		
		List<Object> myObjs = new ArrayList<>();
		List<Integer> myNumbers = new ArrayList<>();
		
//		myObjs = myNumbers; Error comp
		
		List<Integer> myInts = Arrays.asList(5,2,10);
		printList(myInts);
		
		List<String> myStrs = Arrays.asList("Maria","Alex","Bob");
		printList(myStrs);	
	}
	
	public static void printList(List<?> list) {
//		list.add(3); Error compilation; Not possible add on that list, for reason from the joker
		for(Object obj : list)System.out.println(obj);
	}
}
