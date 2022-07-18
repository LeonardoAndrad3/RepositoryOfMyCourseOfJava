package exercices;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entites.LogFromStudents;

public class Sets {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cont = 0;
		int gang = 'a';

		try{
			Set<LogFromStudents> set = new HashSet<>();

			while(cont < 3) {

				System.out.print("How many students for course " + (char)gang+"?");
				int n = sc.nextInt();
				for(int i = 0; i < n; i++) {
					set.add(new LogFromStudents(sc.nextInt()));
				}

				cont++;
				gang++;
			}

			System.out.println("Total students: "+set.size());
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		finally {

			sc.close();
		}
	}

}
