package lista01_15;

import java.util.Scanner;

public class Aps08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		/*
		 *  8. Leia uma temperatura em graus Kelvin e apresente-a convertida em graus
		 * Celsius. A formula de conversao ̃ e: �? C = K − 273.15, sendo C a temperatura
		 * em Celsius e K a temperatura em Kelvin.
		 * 
		 */

		System.out.print("KELVIN: ");
		double kelvin = sc.nextDouble();

		double celsius = kelvin - 273.15;

		System.out.println("CELSIUS:  " + celsius);

	}

}
