package lista01_15;

import java.util.Scanner;

public class Aps14_15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	/**
	 * 14. Leia um angulo em graus e apresente-o convertido em radianos. A f ˆ
	 * ormula de convers ́ ao ̃ e: ́ R = G ∗ π/180, sendo G o angulo em graus e ˆ R
	 * em radianos e π = 3.14.
	 
	
	//////////CODIGO////////////
	
	
	System.out.print("ANGULO: ");
	double graus = sc.nextDouble();
	double radianos = angulo * Math.PI/180;
	System.out.println("RADIANOS: " + angulo);
	
	
	*/
		
	/*
	 * 15. Leia um angulo em radianos e apresente-o convertido em graus. A f ˆ
	 * ormula de convers ́ ao ̃ e: ́ G = R ∗ 180/π, sendo G o angulo em graus e ˆ R
	 * em radianos e π = 3.14.
	 */
	
	/////////////CODIGO/////////////
			
	System.out.print("ANGULOS EM RADIANOS: ");
	double radianos = sc.nextDouble();
	double graus = radianos * 180/Math.PI;
	System.out.println("GRAUS: " + graus );
	
	
	}
}
