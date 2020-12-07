import java.util.Scanner;

public class ValorD {
	
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		int A,B,C,R,S;
		double D;
		
		System.out.println("Insira o valor de A: ");
		A = leia.nextInt();
		
		System.out.println("Insira o valor de B: ");
		B = leia.nextInt();
		
		System.out.println("Insira o valor de C: ");
		C = leia.nextInt();
		
		R = (A + B) * (A + B);
		S = (B + C) * (B + C);
		
		D = (R + S)/2.0; 
		
		System.out.println("O resultado de D é igual a: " + D);
		leia.close();
	}
	
}
