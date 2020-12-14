package poo;

import java.util.Scanner;

public class ClienteDados {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Cliente cliente1 = new Cliente();
		
		System.out.println("Insira seu nome:");
		cliente1.nome = leia.next();
		
		System.out.println("Insira seu email:");
		cliente1.email = leia.next();
		
		System.out.println("Insira seu cpf:");
		cliente1.cpf = leia.nextDouble();
		
		System.out.println("Insira seu telefone:");
		cliente1.telefone = leia.nextInt();
		
		System.out.printf("Cliente %s \nEmail: %s \nTelefone: %d \nCPF: %.1f \n \n", cliente1.nome, cliente1.email, cliente1.telefone, cliente1.cpf);
		
		

	}

}
