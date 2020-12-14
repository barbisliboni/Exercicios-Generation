package poo;

import java.util.Scanner;

public class FuncionarioDados {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		Funcionario funcionario1 = new Funcionario();
		
		System.out.println("Insira seu nome:");
		funcionario1.nome = leia.next();
		
		System.out.println("Insira seu código de funcionário:");
		funcionario1.codigo = leia.nextInt();
		
		System.out.println("Masculino [M] Feminino [F]");
		System.out.println("Com qual gênero você se identifica?");
		funcionario1.genero = leia.next().toUpperCase().charAt(0);
		
		System.out.println("Insira seu CPF:");
		funcionario1.cpf = leia.nextDouble();
		
		System.out.println("Insira o seu ano de nascimento:");
		funcionario1.anoNascimento = leia.nextInt();
		
		System.out.println("Insira seu cargo ou função na empresa:");
		funcionario1.cargoFuncao = leia.next();
		
		System.out.println("Casado [C] Divorciado [D] Solteiro [S] Viúvo [V]");
		System.out.println("Qual seu estado civil?");
		funcionario1.estadoCivil = leia.next().toUpperCase().charAt(0);
		
		System.out.println("Nome: " + funcionario1.nome + "\n" + "Código: " + funcionario1.codigo + "\n" + "CPF: " + funcionario1.cpf +
		"\n" + "Idade: " + funcionario1.suaIdade(funcionario1.anoNascimento) + "\n" + "Função/Cargo: " + funcionario1.cargoFuncao+ "\n" + 
		"Estado civil: " + funcionario1.estado(funcionario1.estadoCivil)+ "\n" + "Gênero: " + funcionario1.genero);
		
		

	}

}
