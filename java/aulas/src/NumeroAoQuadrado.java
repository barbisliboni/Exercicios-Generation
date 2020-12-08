import java.util.Scanner;

public class NumeroAoQuadrado {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3, n4, conta1, conta2, conta3, conta4;
		
		System.out.println("Insira o primeiro número: ");
		n1 = leia.nextDouble();
		
		System.out.println("Insira o segundo número: ");
		n2 = leia.nextDouble();

		System.out.println("Insira o terceiro número: ");
		n3 = leia.nextDouble();
		
		System.out.println("Insira o quarto número: ");
		n4 = leia.nextDouble();
		
		conta1 = n1*n1;
		conta2 = n2*n2;
		conta3 = n3*n3;
		conta4 = n4*n4;
		
		if(conta3 >= 1000) {
			System.out.println("Terceiro número: " + conta4);
		}
		else {
			System.out.println("Primeiro número: " + conta1 + "\nSegundo número: " + conta2 + "\nQuarto número: " + conta4);
		}
	}
	

}
