import java.util.Scanner;

public class IdadeAnosMesesDias {

	public static void main(String args[]){
		
		Scanner leia = new Scanner(System.in);
		int idadeAnos, idadeMeses, idadeDias, contaMeses, contaAnos;
		
		System.out.println("Digite sua idade em dias: ");
		idadeDias = leia.nextInt();
		
		contaAnos = idadeDias/365;
		idadeDias -= contaAnos*365;
		contaMeses = idadeDias/30;
		idadeDias -= contaMeses*30;
		
		System.out.println("Você tem " + contaAnos + " anos, " + contaMeses + " meses e " + idadeDias + " dias de vida!");
		
		leia.close();
	}
}
