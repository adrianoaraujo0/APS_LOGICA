package lista01_15;

import java.util.Scanner;

public class Aps12_13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/**
		 * 12 - Leia uma distancia em milhas e apresente-a convertida em quilometros. A
		 * formula de ́ conversao ̃ e: ́K = 1, 61 ∗ M, sendo K a distancia em quil ˆ
		 * ometros e ˆ M em milhas.
		 
		 
		 //////CODIGO//////////
		System.out.print("MILHAS: ");
		double milhas = sc.nextDouble();
		double km = 1.61 * milhas;
		System.out.printf("KM: %.2f", km);

		 */
		 
		/*
		 * 13 - Leia uma distancia em quil ˆ ometros e apresente-a convertida em
		 * milhas. A formula de ́conversao ̃e: ́M = K 1,61 , sendo K a distancia
		 * em quilometros e M em milhas.
		 
		/////////CODIGO////////////
		System.out.print("KM: ");
		double km = sc.nextDouble();
		double milhas = km/ 1.61;
		System.out.printf("MILHAS: %.2f", milhas);
		*/
	}

}
