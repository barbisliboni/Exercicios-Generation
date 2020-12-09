import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Qual a sua idade?");
		idade = leia.nextInt();
		
		while(idade >= 1) {
			System.out.printf("\nSua idade: %d", idade);
			
			if(idade >= 18) {
				System.out.printf("\nVocê é maior de idade!");
			}
			else {
				System.out.printf("\nVocê é menor de idade!");
			}
			System.out.println("\nQual a sua idade?");
			idade = leia.nextInt();
			System.out.printf("\nSua idade: %d", idade);
			leia.close();
			break;
		}

	}

}
