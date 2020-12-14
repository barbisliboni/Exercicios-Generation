package poo;

import java.util.Scanner;

public class ContaBancariaDados {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		ContaBancaria conta1 = new ContaBancaria();
		
		System.out.println("Insira seu nome completo:");
		conta1.nomeCompleto = leia.next();
		
		System.out.println("Insira seu CPF: ");
		conta1.cpf = leia.nextInt();
		
		System.out.println("Insira seu RG: ");
		conta1.rg = leia.nextInt();
		
		System.out.println("Insira sua renda por mês: ");
		conta1.renda = leia.nextDouble();
		
		System.out.printf("NOME: %s \n CPF: %d \n RG: %d \n RENDA: R$ %.2f", conta1.nomeCompleto, conta1.cpf, conta1.rg, conta1.renda);

	}

}
