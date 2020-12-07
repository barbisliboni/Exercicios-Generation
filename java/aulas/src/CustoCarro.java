import java.util.Scanner;

public class CustoCarro {
	
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		
		double custoCarro, custoConsumidor;
		
		System.out.println("Insira o valor de seu veículo: R$ ");
		custoCarro = leia.nextDouble();
		
		custoConsumidor = custoCarro + custoCarro*0.73;
		
		System.out.println("O custo total de seu veículo é de R$ " + custoConsumidor);
		leia.close();
	}
}
