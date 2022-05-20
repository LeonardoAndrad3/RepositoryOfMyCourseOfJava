package exercicios;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ProductFileWrite;

public class Files {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		File strPath = new File("c:\\Users\\leona\\out.txt");
		new File(strPath.getParent()+"\\out").mkdir();
		List<ProductFileWrite> pf = new ArrayList<>();
		
		System.out.println("Enter more about product: ");
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(strPath.getParent()+"\\out\\out.txt", true))){
	
			for(int i=0;i<4;i++) {
			pf.add(new ProductFileWrite(sc.nextLine().split(",")));
			}
			
			
			System.out.println();
			for(ProductFileWrite product: pf) {
				bw.write(product.toString());
				bw.newLine();
				System.out.println(product);
			}

		}
		catch(IOException e){
			e.printStackTrace();
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
		}
	}
	
	
}
