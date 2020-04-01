package lista28_53;

public class Aps47 {

	public static void main(String[] args) {

		int numero = 3000;
		int n1 = numero/1000;
		int n2 = numero/100 - n1*10;
		int n3 = numero/10 - n1*100 - n2*10;
		int n4 = numero - n1*1000 - n2*100 - n3*10;
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(n4);
		
	}
}