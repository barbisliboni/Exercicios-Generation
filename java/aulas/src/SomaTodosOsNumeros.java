import java.util.Scanner;

public class SomaTodosOsNumeros {

	public static void main(String[] args) {
		int numero, soma = 0, contador = 0;

		Scanner leia = new Scanner(System.in);
				System.out.println("Digite um número:");
				numero = leia.nextInt();

				do{
					contador++;
					soma += contador;
					System.out.print(contador + " + ");
					
				}while(contador < numero);
				System.out.println("A soma é " + soma);
				
	}

}
