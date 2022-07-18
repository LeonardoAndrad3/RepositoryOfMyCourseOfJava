package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entites.Contract;
import model.entites.Installment;
import model.services.PaymentOnline;
import model.services.ProcessPayment;

public class ClassInterface {

	public static void main(String [] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("Enter contract data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		sc.nextLine();
		Date date = sdf.parse(sc.nextLine());
		System.out.print("Contract value: ");
		double contractValue = sc.nextDouble();
		System.out.print("Enter number of installments: ");
		int installments = sc.nextInt();

		Contract ct = new Contract(number, date, contractValue);
		ProcessPayment pp = new ProcessPayment(ct, installments, new PaymentOnline());

		System.out.println();
		System.out.println("Installments: ");
		for(Installment t : pp.getList()) {
			System.out.println(sdf.format(t.getDueDate())+" - " + t.getAmount());
		}


		sc.close();
	}
}
