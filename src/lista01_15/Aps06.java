package lista01_15;

import java.util.Scanner;

public class Aps06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);


		System.out.print("CELSIUS: ");
		double celsius = sc.nextDouble();

		double fahrenheit = celsius * (9.0 / 5.0) + 32.0;

		System.out.println("FAHRENHEIT: " + fahrenheit);
	}

}
