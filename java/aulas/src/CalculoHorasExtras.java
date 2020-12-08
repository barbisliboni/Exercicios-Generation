
import java.util.Scanner;

public class CalculoHorasExtras {
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		
		String C;
		int N = 0, E = 0;
		double salarioTotal = 0.0, salarioExcedente = 0.0;

		final double VALORHORANORMAL = 10.00;
		final double VALORHORAEXCEDENTE = 20.00;
		final int LIMITEHORAS = 50;

		System.out.println("Digite o seu c�digo de funcion�rio:");
		C = leia.next();

		System.out.println("Digite a quantidade de horas trabalhadas:");
		N = leia.nextInt();
		
		if(N <= LIMITEHORAS){ 
			salarioTotal = (N*VALORHORANORMAL); 
			leia.close();
		}
		else{
			E = (N- LIMITEHORAS);
			salarioTotal = (LIMITEHORAS*VALORHORANORMAL); 
			salarioExcedente = E*VALORHORAEXCEDENTE; 
			salarioTotal = salarioTotal + salarioExcedente; 
			
		}
		
		System.out.println("\nQuantidade de horas trabalhadas: " + N);
		System.out.println("\nQuantiadade de horas excedentes: " + E);
		System.out.println("\nSal�rio excedente: R$ " + salarioExcedente);
		System.out.println("\nSal�rio total: R$ " + salarioTotal);
	}
}

