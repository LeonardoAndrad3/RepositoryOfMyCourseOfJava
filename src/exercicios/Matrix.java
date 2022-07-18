package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Matrix {


	public static void main(String []args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int l = sc.nextInt();
		int c = sc.nextInt();
		int[][] mat = new int[l][c];

		for(int i = 0; i <l; i++) {
			for(int j = 0; j<c; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Number: ");
		int number = sc.nextInt();

		for(int i = 0; i<l; i++) {
			for(int j = 0; j<c; j++) {
				if(number == mat[i][j]) {
					System.out.println(i+","+j+":");
					System.out.println(j > 0 ? "Left: "+ mat[i][j-1] : "");
					System.out.println(j < mat[i].length-1 ? "Right: "+ mat[i][j+1] : "");
					System.out.println(i > 0 ? "Up: "+ mat[i-1][j] : "");
					System.out.println(i < mat.length-1 ? "Dowm: "+ mat[i+1][j] : "");

				}
			}
		}


		sc.close();
	}
}
