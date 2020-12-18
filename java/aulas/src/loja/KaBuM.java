package loja;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class KaBuM {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String codigos[] = new String[10];
		int estoque[] = new int[10];
		String codigo;
		int escolhido = 0;
		char opcaoContinuar;
		int quantidade = 0;
		char desejaProduto = 'S';

		do {
			int opcao;
			char genero = 0;
			System.out.print("\n█████████████████████████████");
			System.out.print("\n█    Bem vindo a KaBuM      █ ");
			System.out.print("\n█  O maior e-commerce tech  █");
			System.out.print("\n█                           █");
			System.out.print("\n█     ESCOLHA UMA OPÇÃO:    █");
			System.out.print("\n█                           █");
			System.out.print("\n█[1] - COMPRAR PRODUTOS     █");
			System.out.print("\n█[2] - GERENCIAR ESTOQUE    █");
			System.out.print("\n█[3] - SAIR                 █");
			System.out.print("\n█                           █");
			System.out.print("\n█████████████████████████████");
			System.out.println("\nOpção desejada: ");
			opcao = leia.next().toUpperCase().charAt(0);
	
			switch (opcao) {
			case '1':
				 //System.out.println(sexo(genero));
				System.out.println("Continuar [S] [N]?");
				opcaoContinuar = leia.next().toUpperCase().charAt(0);
				if(opcaoContinuar == 'N') {
					break;
				}
				
	
				List<Produto> prodlista = new ArrayList<>();
				prodlista.add(new Produto("TECLADO MECÂNICO", "BLG-001",    10.25, 10));
				prodlista.add(new Produto("PEN DRIVE SANDISK", "BLG-002",   20.50, 10));
				prodlista.add(new Produto("MESA DIGITALIZADORA", "BLG-003", 30.75, 10));
				prodlista.add(new Produto("HEADSET GAMER      ", "BLG-004", 40.25, 10));
				prodlista.add(new Produto("MOUSE GAMER        ", "BLG-005", 50.50, 10));
				prodlista.add(new Produto("WEBCAM LOGITECH    ", "BLG-006", 60.75, 10));
				prodlista.add(new Produto("FILTRO DE LINHA    ", "BLG-007", 70.25, 10));
				prodlista.add(new Produto("CABO HDMI         ", "BLG-008",  80.50, 10));
				prodlista.add(new Produto("ADAPTADOR         ", "BLG-009",  90.75, 10));
				prodlista.add(new Produto("MICROFONE         ", "BLG-010", 100.25, 10));
	
				System.out.println("CÓDIGO\t\t\tPRODUTO\t\t\tR$(UNI.)\n");
				for (Produto produtos : prodlista) {
					System.out.println(produtos.getCodigo() + " " + "\t" + produtos.getNomeProduto() + "\t\t"
							+ produtos.getPrecoUnitario());
				}
	
					System.out.println("\nDigite o código completo (incluindo letras e números)");
					codigo = leia.next();
	
					
					for (int x = 0; x < 10; x++) {
						String codigoTemp = prodlista.get(x).getCodigo();
						codigo = "BLG-001";
						
						if (codigoTemp == codigo) {
							System.out.println("*Checando o produto...*");
							System.out.println("Produto escolhido: " + prodlista.get(x).getNomeProduto());
							
							System.out.println("Qual a quantidade que deseja?");
							quantidade = leia.nextInt();
							prodlista.get(quantidade).tiraEstoque(quantidade);
						}
					}

					Math.round(prodlista.get(quantidade).venda(quantidade));


					
					break;
	
			case '2':
				System.out.println("WIP - Work in Progress");
				leia.close();
				break;
	
			case '3':
				System.out.println("Agradeçemos por sua compra!! Volte quando quiser :D");
				leia.close();
				break;
			}
			
	 } while(true);
   }

	/* FUNÇAO SEXO E PRODUTOS */
	static char sexo(char genero) {
		Scanner leia = new Scanner(System.in);
		char seuGenero = 0;

		System.out.println("Qual o seu nome?");
		String nome;
		nome = leia.next();
		System.out.println("Digite [F] para feminino");
		System.out.println("Digite [M] para masculino");
		System.out.println("Digite [O] para outros");
		System.out.println("Com qual você se identifica?");
		genero = leia.next().toUpperCase().charAt(0);
		System.out.println("Em que ano você nasceu?");
		int anoNascimento = leia.nextInt();
		System.out.println("Insira seu CPF:");
		String cpf = leia.next();

		Cliente cliente1 = new Cliente(nome, genero, anoNascimento, cpf);

		if (genero == 'F') {
			System.out.println("\n");
			linha(80);
			System.out.println("\n");
			System.out.println("Seja bem vinda à KaBuM, sra " + nome + "!");
			System.out.printf("\nSeus dados: \nCPF: %s \nIdade: %d", cliente1.getCpf(),
					cliente1.voltaIdade(anoNascimento));
			System.out.println("\n");
			linha(80);
			System.out.println("\n");
		} else if (genero == 'M') {
			System.out.println("\n");
			linha(80);
			System.out.println("\n");
			System.out.println("Seja bem vindo à KaBuM, sr " + nome + "!");
			System.out.printf("\nSeus dados: \nCPF: %s \nIdade: %d", cliente1.getCpf(),
					cliente1.voltaIdade(anoNascimento));
			System.out.println("\n");
			linha(80);
			System.out.println("\n");
		} else if (genero == 'O') {
			System.out.println("\n");
			linha(80);
			System.out.println("\n");
			System.out.println("Sejx bem vindx à KaBuM, " + nome + "!");
			System.out.printf("\nSeus dados: \nCPF: %s \nIdade: %d", cliente1.getCpf(),
					cliente1.voltaIdade(anoNascimento));
			System.out.println("\n");
			linha(80);
			System.out.println("\n");
		} else {
			System.out.println("Valores inválidos! Tente novamente.");
		}
		return seuGenero;
	}
	/* FIM */

	/* FUNÇAO LINHA */
	public static void linha(int tamanho) {
		for (int x = 1; x <= tamanho; x++) {
			System.out.print("-");
		}
	}
	/* FIM */

}
