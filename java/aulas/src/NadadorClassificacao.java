import java.util.Scanner;

public class NadadorClassificacao {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int idade, infantilA, infantilB, juvenilA, juvenilB, adultos;

		System.out.println("Insira sua idade:");
		idade = leia.nextInt();

		if(idade >= 5 && idade <= 7){
			System.out.println("Você está na categoria Infantil A!");
		}
		else if(idade >= 8 && idade <= 11){
			System.out.println("Você está na categoria Infantil B!");
		}
		else if(idade >= 12 && idade <= 13){
			System.out.println("Você está na categoria Juvenil A!");
		}
		else if(idade >=14 && idade <= 17){
			System.out.println("Você está na categoria Juvenil B!");
		}
		else if(idade  >= 0 && idade  <= 4){
			System.out.println("Valor inválido e/ou você ainda não pode fazer natação!");
		}
		else{
			System.out.println("Você está na categoria de Adultos!");
		}

	}

}
