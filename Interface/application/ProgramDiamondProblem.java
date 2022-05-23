package application;

import devices.ComboDevice;

public class ProgramDiamondProblem{

	public static void main(String[] args) {
		

		ComboDevice cd = new ComboDevice("2019");
		cd.processDoc("My dissertation");
		cd.print("My dissertation");
		System.out.println("Scan result: " + cd.scan());
		
	}

}
