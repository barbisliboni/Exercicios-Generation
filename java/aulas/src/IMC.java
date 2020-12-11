import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int peso = 0;
		double altura, imc = 0.0;

				System.out.println("Insira seu peso: ");
				peso = leia.nextInt();
				System.out.println("\nInsira sua altura: ");
				altura = leia.nextDouble();
				

				imc = peso / (altura * altura);
				
				if(imc < 18.5){
				    System.out.println("Você está abaixo do peso!");
				}
				else if(imc >= 18.5 && imc <= 24.9){
				    System.out.println("Você está no seu peso ideal!");
				}
				else if(imc >= 25 && imc <= 29.9){
				    System.out.println("Você está sobrepeso!");
				}
				else if(imc >= 30 && imc <= 34.9){
				    System.out.println("Você está com obesidade grau I");
				}
				else if(imc >= 35 && imc <= 39.9){
				    System.out.println("Você está com obesidade grau II");
				}
				else{
				    System.out.println("Você está com obesidade mórbida");
				}
	}

}
