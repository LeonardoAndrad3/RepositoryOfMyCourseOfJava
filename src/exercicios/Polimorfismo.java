package exercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Polimorfismo {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> product = new ArrayList<>();
		
		System.out.println("Welcome to importedPlus");
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Product #"+i+" data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			switch(resp){
				case 'c':
					product.add(new Product(name, price));
				break;
					
				case 'u':
					System.out.print("Manusfacture date (DD/MM/YYYY): ");
					sc.nextLine();
					Date mDate = sdf.parse(sc.nextLine());
					product.add(new UsedProduct(name, price, mDate));
				break;
				
				case 'i':
					System.out.print("Customs fee: ");
					double customsFee = sc.nextDouble();
					product.add(new ImportedProduct(name, price, customsFee));
				break;
				
				default:
					System.out.println();
					System.out.println("Sorry, the product not found!");
				break;
			}
		}
		
		System.out.println();
		
		if(product.size() != 0) {
			System.out.println("PRICE TAGS: ");
			
			for(Product x : product) {
				System.out.println(x.priceTag());
			}
		}
		
		
		sc.close();
	}

}
