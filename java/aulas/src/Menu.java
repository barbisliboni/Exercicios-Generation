import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		//for - Repetição tinha tamanho definido
		//while - Quando não sabe quando para/o tamanho e testa no início
		//do... while - Não sabe onde para/o tamanho, mas roda pelo menos uma vez e testa no final
		
		/*for(int x = 1; x <= 10; x++) {
			//x++ = x+1
			
			System.out.printf("Rodada %d\n", x);
		}*/
		
		//-----------------------------------------------------------
		
		/*for (int x = 1; x <=1; x++) {
			for(int y = 20; y>=1;y--) {
				System.out.println(" Teste " + y);
			}
		}*/
		
		//-----------------------------------------------------------
		
		Scanner leia = new Scanner(System.in);
		
		/*
		 System.out.println("Digite o tamanho da linha:");
		int tamanho = leia.nextInt();
		
		for(int i = 1; i <= tamanho; i++) {
			System.out.println("Teste " + i);
		}
		*/
		
		//-----------------------------------------------------------
		
				System.out.println("Começa o programa S/N: ");
				char opcao;
				
				do
				{
					for (int x=1; x<=20; x++)
					{
						System.out.print("═");
					}
					System.out.println();
					System.out.println("SISTEMA DE CADASTRO");
					System.out.println();
					for (int x=1; x<=20; x++)
					{
						System.out.print("═");
					}
					System.out.println();
					System.out.println("Continuar S/N: ");
					opcao = leia.next().toUpperCase().charAt(0);
					while (true)
						
					{
						if (opcao != 'S' && opcao !='N')
						{
							System.out.println("Por favor digite S ou N tá bom. Tente de novo: ");
							opcao = leia.next().toUpperCase().charAt(0);
						} else
						{
							break;
						}
						
					}
				} while (opcao == 'S');
				
						
				System.out.println("FIM DO PROGRAMA");
			}

}
