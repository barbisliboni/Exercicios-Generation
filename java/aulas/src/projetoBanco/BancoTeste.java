package projetoBanco;

import java.util.Scanner;

public class BancoTeste {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("BANCO TESTE");
		int conta;
		
		System.out.println("Insira o número da conta: ");
		conta = leia.nextInt();
		
		Conta processo1 = new Conta(conta);
		System.out.println(conta);
	}

}
