package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.EmployeeComparable;

public class ProgramComparable {

	public static void main(String[] args) {
		List<EmployeeComparable> list = new ArrayList<>();
		String path = "C:\\Users\\leona\\out\\out.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employee = br.readLine();
			while (employee != null) {
				String[] emp = employee.split(",");
				list.add(new EmployeeComparable(emp[0],Double.parseDouble(emp[1])));
				employee = br.readLine();
			}
			Collections.sort(list);
			for (EmployeeComparable s : list) {
				System.out.println(s.getName()+", "+s.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
