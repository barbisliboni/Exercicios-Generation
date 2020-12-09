import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("\nQual a sua idade?");
		idade = leia.nextInt();
		
		do {
			System.out.printf("\nSua idade: %d", idade);
			
			if(idade >= 18) {
				System.out.printf("\nVocê é maior de idade!");
			}
			else {
				System.out.printf("\nVocê é menor de idade!");
			}
			System.out.println("\nQual a sua idade?");
			idade = leia.nextInt();
			leia.close();
		}
		while(idade >= 1);
	}

}
