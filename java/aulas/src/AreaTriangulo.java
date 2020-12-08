import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double base, altura, area;

		System.out.println("Insira a base do triângulo:");
		base = leia.nextDouble();

		System.out.println("Insira a altura do triângulo:");
		altura = leia.nextDouble();

		if(base >= 0 && altura >= 0){
			area = (base*altura)/2;
			System.out.println("A área total do triângulo é de " + area);
		}
		else{
			System.out.println("Valor inválido! Não é possível calcular a área sendo um número negativo.");
		}

	}

}
