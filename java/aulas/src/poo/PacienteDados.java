package poo;

import java.util.Scanner;

public class PacienteDados {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Paciente paciente1 = new Paciente();
		
		System.out.println("Insira seu nome:");
		paciente1.nome = leia.next();
		
		System.out.println("Insira seu endereço:");
		paciente1.endereco = leia.next();
		
		System.out.println("Qual o tipo de exame que será realizado?");
		paciente1.tipoExame = leia.next();
		
		System.out.println("Insira seu CPF:");
		paciente1.cpf = leia.nextInt();
		
		System.out.println("Insira seu RG: ");
		paciente1.rg = leia.nextInt();
		
		System.out.println("NOME DO PACIENTE\t ENDEREÇO\t TIPO DE EXAME\t RG\t CPF");
		System.out.printf("%s\t %s\t %s\t %d\t %d\t", paciente1.nome, paciente1.endereco, paciente1.tipoExame, paciente1.cpf, paciente1.rg);

	}

}
