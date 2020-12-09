import java.util.Scanner;

public class LojaKabum {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
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
				leia.close();
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
