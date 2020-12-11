package loja;

import java.util.Scanner;

public class KaBuM {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String codigos[] = new String [10];
		String produtos[] = {"TECLADO MECÂNICO","PEN DRIVE","MESA DIGITALIZADORA","HEADSET", "MOUSE GAMER",
		"WEBCAM","CABO","ADAPTADOR", "FILTRO DE LINHA","MICROFONE"};
		double precoUnitario [] = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int estoque []= new int [10];
		String codigo;
		int escolhido = 0;
		
		
		
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
		switch(opcao) {
			case '1':
				System.out.println(sexo(genero));
				
				System.out.println("CÓDIGO\t\tR$(UNI.)\tESTOQUE\t\tPRODUTO\n");
				for(int x = 0; x < 10; x++) {
					estoque[x] = 10;
					codigos[x]=(x<9)?"BLG-00"+(x+1):"BLG-0"+(x+1);
					
					System.out.printf("%s\t\t%.2f\t\t%d\t\t%s\n",codigos[x],precoUnitario[x],estoque[x],produtos[x]);
					
				}
				
				System.out.println("\nDigite o código completo (incluindo letras e números)");
				System.out.println("Qual o código do produto desejado?");
				codigo = leia.next().toUpperCase();
				
				
				for(int x = 0; x < 10; x++) {
					if(codigo.equals(codigos[x])) {
						escolhido = x;
					}
				}
				
				System.out.println("\nProduto escolhido: " + produtos[escolhido]);
				
				break;
				
				
			case '2':
				System.out.println("WIP - Work in Progress");
				leia.close();
				break;
			case '3':
				System.out.println("Agradeço por sua compra!! Volte quando quiser :D");
				leia.close();
				break;
		}	
	}
	
	
	
	
	
				/*   FUNÇAO SEXO    */ 
				static char sexo(char genero) {
					Scanner leia = new Scanner(System.in);
					char seuGenero = 0;
					System.out.println("Qual o seu nome?");
					String nome;
					nome = leia.next();
					linha(80);
					System.out.println("\n");
					System.out.println("Digite [F] para feminino");
					System.out.println("Digite [M] para masculino");
					System.out.println("Digite [O] para outros");
					System.out.println("Com qual você se identifica?");
					genero = leia.next().toUpperCase().charAt(0);
					if(genero == 'F') {
						System.out.println("Seja bem vinda à KaBuM, sra " + nome + "!");
					}
					else if(genero == 'M'){
						System.out.println("Seja bem vindo à KaBuM, sr " + nome + "!");
					}
					else if(genero == 'O') {
						System.out.println("Sejx bem vindx à KaBuM, " + nome + "!");
					}
					else {
						System.out.println("Valores inválidos! Tente novamente.");
					}
					return seuGenero;
				}
				/*   FIM    */
		
				
				
				
				/*   FUNÇAO LINHA    */ 
				public static void linha(int tamanho) {
					for(int x = 1; x <= tamanho; x++) {
						System.out.print("-");
					}
				}
				/*   FIM    */

}
