import java.util.Scanner;

public class AreaTriangulo {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		double base, altura, area;

		System.out.println("Insira a base do tri�ngulo:");
		base = leia.nextDouble();

		System.out.println("Insira a altura do tri�ngulo:");
		altura = leia.nextDouble();

		if(base >= 0 && altura >= 0){
			area = (base*altura)/2;
			System.out.println("A �rea total do tri�ngulo � de " + area);
		}
		else{
			System.out.println("Valor inv�lido! N�o � poss�vel calcular a �rea sendo um n�mero negativo.");
		}

	}

}
