import java.util.Scanner;

public class MultiplicarAteMaiorQueCem {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, multiplicarNumero, total = 0;

		System.out.println("Insira um valor: ");
		numero = leia.nextInt();

			while(numero <= 100){
				multiplicarNumero = numero * 3;
				total = total + 3;
				System.out.println("\n" + total);	
				break;
			}	
	}
}
