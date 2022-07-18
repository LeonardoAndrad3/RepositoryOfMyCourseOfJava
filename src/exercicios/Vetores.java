package exercicios;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudent;

public class Vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.print("Estudent number: ");
		int n = sc.nextInt();
		Estudent[] vect = new Estudent[10];

		for(int i = 1; i<=n; i++) {
			System.out.println("Rent #"+i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Estudent(room, name, email);
		}

		System.out.println();
		System.out.println("Busy rooms: ");
		for (Estudent element : vect) {
			if(element != null) {
				System.out.println(element);
			}
		}

		sc.close();
	}

}
