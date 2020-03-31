package lista01_15;

import java.util.Scanner;

public class Aps10_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		/**
		 * 10. Leia uma velocidade em km/h (quilometros por hora) e apresente-a
		 * convertida em m/s ˆ (metros por segundo). A formula de convers �? ao ̃ e: �?
		 * M = K/3.6, sendo K a velocidade em km/h e M em m/s.
		 

		System.out.print("KM/H: ");
		double km = sc.nextDouble();
		double ms = km / 3.6;
		System.out.printf("M/S: %.2f", ms); */

		
		/**
		 * 11. Leia uma velocidade em m/s (metros por segundo) e apresente-a convertida
		 * em km/h (quilometros por hora). A formula de convers ́ ao ̃ e: ́ K = M ∗
		 * 3.6, sendo K a velocidade em km/h e M em m/s.
		 */
		
		System.out.print("M/S: ");
		double ms = sc.nextDouble();
		double km = ms * 3.6;
		System.out.printf("KM/H: %.2f", km);

	}

}
