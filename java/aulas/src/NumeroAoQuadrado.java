import java.util.Scanner;

public class NumeroAoQuadrado {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double n1, n2, n3, n4, conta1, conta2, conta3, conta4;
		
		System.out.println("Insira o primeiro n�mero: ");
		n1 = leia.nextDouble();
		
		System.out.println("Insira o segundo n�mero: ");
		n2 = leia.nextDouble();

		System.out.println("Insira o terceiro n�mero: ");
		n3 = leia.nextDouble();
		
		System.out.println("Insira o quarto n�mero: ");
		n4 = leia.nextDouble();
		
		conta1 = n1*n1;
		conta2 = n2*n2;
		conta3 = n3*n3;
		conta4 = n4*n4;
		
		if(conta3 >= 1000) {
			System.out.println("Terceiro n�mero: " + conta4);
		}
		else {
			System.out.println("Primeiro n�mero: " + conta1 + "\nSegundo n�mero: " + conta2 + "\nQuarto n�mero: " + conta4);
		}
	}
	

}
