import java.util.Scanner;

public class CalculoPesoMulta {
	
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		
		double P, E, M;
		
		System.out.println("Insira qual a quantidade de tomates (em kg): ");
		P = leia.nextDouble();
		
		if(P > 50){
			E = P - 50;
			M = E*4;
			
			System.out.println("Você está levando " + E + " kg a mais, e pagará um total de R$ " + M + " de multa!");
		}
		else if(P == 50){
			System.out.println("Você está levando 50kg (o peso máximo).");			
		}
		else {
			M = 0.0;
			System.out.println("Você está levando " + P + " kg. Pagará um total de R$ " + M + " de multa.");
		}
		
	}
}
