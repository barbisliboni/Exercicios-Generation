import java.util.Scanner;

public class IdadeApenasDias {
	
	public static void main (String args[]){
		
		Scanner leia = new Scanner(System.in);
		int idadeAnos, idadeMeses, idadeDias, contaMeses, contaAnos, total;
		
		System.out.println("Digite sua idade em anos: ");
		idadeAnos = leia.nextInt();
		
		System.out.println("Digite sua idade em meses: ");
		idadeMeses = leia.nextInt();
		
		System.out.println("Digite sua idade em dias: ");
		idadeDias = leia.nextInt();
		
		contaMeses = idadeMeses*30;
		contaAnos = idadeAnos*365;
		
		total = (idadeDias+contaMeses)+contaAnos;
		
		System.out.println("Você tem " + total +" dias de vida!");
		
		leia.close();
		
		
	}

}
