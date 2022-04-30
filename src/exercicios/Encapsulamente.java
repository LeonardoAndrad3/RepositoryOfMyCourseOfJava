package exercicios;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import entities.Bank;

public class Encapsulamente {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int command = 0;
		Bank bk;

		System.out.println("Hello, welcome to BankUdemy!");
		System.out.println("Please, what's data to account!");
		System.out.print("Your number account: ");
		int numberAccount = sc.nextInt();
		System.out.print("Your name: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit? (y/n)");
		char decision = sc.next().charAt(0);
		if (decision != 'n') {
			System.out.print("What's value to deposit:");
			Double priceAccount = sc.nextDouble();
			bk = new Bank(name, numberAccount, priceAccount);
		} else {
			bk = new Bank(name, numberAccount);
		}

		System.out.println("Greent! This is data your account:");
		System.out.println(bk);

		TimeUnit.SECONDS.sleep(2);
		for (int i = 0; i < 20; i++) {
			System.out.println("");
		}

		System.out.println("---------------------------");
		System.out.println("Menu bankUdemy");
		TimeUnit.SECONDS.sleep(2);
		System.out.println("You options comand:");
		System.out.println("---------------------------");
		System.out.println("1. Saque");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("2. Deposit");
		TimeUnit.SECONDS.sleep(1);
		System.out.println("3. Exit");
		System.out.println();

		while (command != 3) {
			System.out.println("What's comand?");
			command = sc.nextInt();
			switch (command) {
			case 1:
				command = 1;
				System.out.println("What's your saque?");
				double saque = sc.nextDouble();
				bk.saque(saque);
				System.out.println("Good, this your saque!");
				System.out.println(bk);
				break;
			case 2:
				command = 2;
				System.out.println("What's your deposit?");
				double deposit = sc.nextDouble();
				bk.deposit(deposit);
				System.out.println("Good, this your deposit!");
				System.out.println(bk);
				break;
			case 3:
				System.out.println("Thanks, goodbye...");
				TimeUnit.SECONDS.sleep(2);
				System.exit(0);
				break;
			default:
				System.out.println("Dont's this command! Please, other command!");
			}
		}

		sc.close();
	}

}
