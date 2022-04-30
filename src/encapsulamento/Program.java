package encapsulamento;

import java.util.Locale;
import java.util.Scanner;
import entities.Test;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Test ts = new Test();
		
		System.out.println("What's your age?");
		double idade = sc.nextDouble();
		ts.setIdade(idade);
		
		System.out.println(ts);		
		sc.close();
	}
}
