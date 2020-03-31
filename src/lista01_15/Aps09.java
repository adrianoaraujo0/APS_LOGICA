package lista01_15;

import java.util.Scanner;

public class Aps09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		/**
		 * * 
		 * 9. Leia uma temperatura em graus Celsius e apresente-a convertida em graus
		 * Kelvin. A formula de conversao e: Ì? K = C + 273.15, sendo C a temperatura em
		 * Celsius e K a temperatura em Kelvin.
		 */
		
		
		System.out.print("CELSIUS: ");
		double celsius = sc.nextDouble();

		double kelvin = celsius + 273.15;

		System.out.println("CELSIUS: " + kelvin);

	}

}
