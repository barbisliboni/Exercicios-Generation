import java.util.Scanner;

public class ProdutoCompra {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double precoProduto, aVistaDinheiro, aVistaCartao, aVistaCartao2, duasVezes, tresVezes, tresVezes2, tresVezesParcelas;
		String metodoPagamento;

		System.out.println("Insira o pre�o do produto: R$ ");
		precoProduto = leia.nextDouble();

		System.out.println("\nDinheiro ou cheque: Recebe 20% de desconto");
		System.out.println("\n� vista no cart�o de cr�dito: Recebe 15% de desconto");
		System.out.println("\nEm duas vezes no cart�o: Pre�o normal sem juros");
		System.out.println("\nEm tr�s vezes no cart�o: Pre�o normal mais 10% de juros");
		System.out.println("\n[DINHEIRO], [CHEQUE], [A VISTA], [DUAS VEZES], [TRES VEZES]");
		System.out.println("\nQual op��o de pagamento deseja? (Responda do jeito escrito acima) ");
		metodoPagamento = leia.next();
		

		if(metodoPagamento == "dinheiro" || metodoPagamento == "DINHEIRO" || metodoPagamento == "cheque" || metodoPagamento == "CHEQUE"){
			aVistaDinheiro = precoProduto / 5;
			System.out.printf("Seu produto ficou de R$ %f por R$ %f",precoProduto, aVistaDinheiro);
		}
		else if(metodoPagamento == "a vista" || metodoPagamento == "A VISTA" || metodoPagamento == "avista" || metodoPagamento == "AVISTA"){
			aVistaCartao = precoProduto * 0.15 ;
			aVistaCartao2 = precoProduto - aVistaCartao;
			System.out.printf("Seu produto ficou de R$ %f por R$ %f",precoProduto, aVistaCartao2);
		}
		else if(metodoPagamento == "duas vezes" || metodoPagamento == "DUAS VEZES" || metodoPagamento == "duasvezes" || metodoPagamento == "DUASVEZES"){
			duasVezes = precoProduto / 2;
			System.out.printf("Voc� pagar� seu produto em duas parcelas de R$ %f",duasVezes);
		}
		else if(metodoPagamento == "tres vezes" || metodoPagamento == "TRES VEZES" || metodoPagamento == "tresvezes" || metodoPagamento == "TRESVEZES"){
			tresVezes = (10 * precoProduto)/100;
			tresVezes2 = precoProduto + tresVezes;
			tresVezesParcelas = tresVezes2 / 3;
			System.out.println("Seu item ficou de R$ " + precoProduto + " por R$ " + tresVezes2 + ", e voc� pagar� em parcelas de R$ " + Math.round(tresVezesParcelas));
		}
		else{
		System.out.println("Valor inv�lido! Tente novamente");
		}


	}

}
