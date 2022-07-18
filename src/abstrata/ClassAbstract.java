package abstrata;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.SavingsAccount;

public class ClassAbstract {

	public static void main(String [] args){

		List<Account> list = new ArrayList<>();
		list.add(new SavingsAccount(1001, "Alex", 1000.0, 0.01));
		list.add(new SavingsAccount(1002, "Leo", 1000.0, 0.01));
		list.add(new SavingsAccount(1003, "Maria", 1000.0, 0.01));
		list.add(new SavingsAccount(1004, "João", 1000.0, 0.01));

		double sum = 0;

		for(Account acc : list){
			sum += acc.getBalance();
		}

		System.out.printf("Total balance: %.2f%n", sum);
		for(Account acc : list) {
			acc.deposit(10.0);
		}
		for(Account acc : list) {
			System.out.printf("Update balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
		}

	}
}
