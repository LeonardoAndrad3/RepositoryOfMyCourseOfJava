package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrderComposicao;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Composicao {
	
	public static void main(String [] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		OrderItem oi;
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birth = sdf.parse(sc.nextLine());
		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		OrderComposicao oc = new OrderComposicao(new Client(name,email), OrderStatus.valueOf(status));
		System.out.println("How many items to this order?");
		Integer quantity = sc.nextInt();
		
		for(int i = 1; i<=quantity; i++) {
			System.out.println("Enter"+i+"# item data:");
			sc.nextLine();
			System.out.print("Product name: ");
			String nameProd = sc.nextLine();
			System.out.print("Product price: ");
			Double price = sc.nextDouble();
			System.out.print("Quantity: ");
			Integer quantityProd = sc.nextInt();
			oi = new OrderItem(quantityProd, price, new Product(nameProd, price));
			oc.addItem(oi);
		}
		
		System.out.println(oc);
		
	}
	
}
