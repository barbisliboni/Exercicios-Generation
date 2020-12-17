package poo.collections;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import poo.collections.EstoqueLoja;

public class Loja {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		List <EstoqueLoja> produtos = new ArrayList<>();
		produtos.add(new EstoqueLoja("produto1", 50.00));
		produtos.add(new EstoqueLoja("produto2", 80.00));
		char continua = 'S';
		char op;
		
		do {
			System.out.println("[1] - ADICIONAR PRODUTO");
			System.out.println("[2] - REMOVER PRODUTO");
			System.out.println("[3] - ATUALIZAR PRODUTO");
			System.out.println("[4] - LISTA DE PRODUTOS");
			System.out.print("DIGITE A OPÇÃO:");
			op = leia.next().charAt(0);

			while (op != '1' && op != '2' && op != '3' && op != '4') {
				System.out.println("ESCOLHA UMA OPÇÃO CORRETA");
				System.out.print("DIGITE A OPÇÃO:");
				op = leia.next().charAt(0);
			}

			if (op == '1') {
				linha(80);
				System.out.println("   LISTA DE PRODUTOS EXISTENTES    ");
				linha(80);
				System.out.println(" NOME\t\t  PREÇO\n");
				for(EstoqueLoja prod: produtos) {
					System.out.println(prod.getNome() + "\t  " + prod.getPreço());
				}
				System.out.println("DIGITE O NOME DO PRODUTO QUE DESEJA ADICIONAR");
				String nome = leia.next();
				System.out.println("DIGITE O PREÇO DO PRODUTO");
				double preco = leia.nextDouble();
				EstoqueLoja produto = new EstoqueLoja(nome, preco);

				produtos.add(produto);

			} else if (op == '2') {
				linha(80);
				System.out.println("    LISTA DE PRODUTOS EXISTENTES    ");
				linha(80);
				System.out.println(" NOME\t\t  PREÇO\n");
				for(EstoqueLoja prod: produtos) {
					System.out.println(prod.getNome() + "\t  " + prod.getPreço());
				}
				System.out.println("DIGITE O NOME DO PRODUTO QUE DESEJA REMOVER");
				String nome = leia.next();

				for (EstoqueLoja prod : produtos) {
					if (prod.getNome().equals(nome)) {
						produtos.remove(prod);
					}
				}

			} else if (op == '3') {
				linha(80);
				System.out.println("   LISTA DE PRODUTOS EXISTENTES    ");
				linha(80);
				System.out.println(" NOME\t\t  PREÇO\n");
				for(EstoqueLoja prod: produtos) {
					System.out.println(prod.getNome() + "\t  " + prod.getPreço());
				}
				
				System.out.println("DIGITE O NOME DO PRODUTO QUE DESEJA ATUALIZAR");
				String nome = leia.next();
				System.out.println("DIGITE O NOVO NOME DO PRODUTO");
				String nomeNovo = leia.next();
				
				EstoqueLoja produto = new EstoqueLoja(nome);

				for (EstoqueLoja prod : produtos) {
					if (prod.getNome().equals(nome)) {
						prod.setNome(nomeNovo);
					}
				}

			} else if (op =='4'){
				linha(80);
				System.out.println("   LISTA DE PRODUTOS EXISTENTES    ");
				linha(80);
				System.out.println(" NOME\t\t  PREÇO\n");
				for(EstoqueLoja prod: produtos) {
					System.out.println(prod.getNome() + "\t  " + prod.getPreço());
				}

			}
			
			System.out.println("\n\nDESEJA FAZER OUTRA AÇÃO? S/N");
			continua = leia.next().toUpperCase().charAt(0);
			while(continua != 'S' && continua != 'N') {
				System.out.println("Digite uma opção válida");
				System.out.println("[S]-SIM [N]-NÃO");
				continua = leia.next().toUpperCase().charAt(0);
			}

		} while (continua == 'S');
	}
	
	public static void linha(int tamanho) {
		for (int i = 0; i < tamanho; i++) {
			System.out.print("═");
		}
		System.out.print("\n");
	}
}
