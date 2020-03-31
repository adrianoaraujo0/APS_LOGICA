package lista01_15;

import java.util.Scanner;

public class Aps07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		/**
		 * * 
		 * 7. Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus
		 * Celsius. A formula de conversao ̃ e: �?C = 5.0 ∗ (F − 32.0)/9.0, sendo C a
		 * temperatura em Celsius e F a temperatura em Fahrenheit.
		 */
		
		System.out.print("FAHRENHEIT: ");
		double fahrenheit = sc.nextDouble();

		double celsius = fahrenheit * 5.0 * (fahrenheit - 32.0) / 9.0;

		System.out.println("CELSIUS:  " + celsius);

	}

}
