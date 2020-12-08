import java.util.Scanner;

public class IndicePoluicao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double indicePoluicao;
		int grupo, grupo1 = 1, grupo2 = 2, grupo3 = 3;
		
		System.out.println("A qual grupo sua empresa pertence (1, 2 ou 3)?");
		grupo = leia.nextInt();
		
		System.out.println("Insira o índice de poluição de sua empresa:");
		indicePoluicao = leia.nextDouble();
		
		if(indicePoluicao >= 0.05 && indicePoluicao <= 0.25) {
			System.out.println("Muito bem! Continue assim que o meio ambiente agradece! :)");
		}
		else if(grupo == grupo1 && indicePoluicao == 0.3) {
			System.out.println("A sua e todas as outras indústrias do grupo 1 serão intimadas.");
		}
		else if(grupo == grupo1 || grupo == grupo2 && indicePoluicao == 0.4){
			System.out.println("Todas as empresas pertencentes aos grupos 1 e 2 serão intimadas a suspenderem suas atividades.");
		}
		else if(grupo == grupo1 || grupo == grupo2 || grupo == grupo3 && indicePoluicao >= 0.5) {
			System.out.println("Todos os grupos devem paralisar suas atividades imediatamente!");
		}
		else {
			System.out.println("Valores inválidos! Tente novamente.");
		}
	}	

}
