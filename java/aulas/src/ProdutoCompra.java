import java.util.Scanner;

public class ProdutoCompra {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		double precoProduto, aVistaDinheiro, aVistaCartao, aVistaCartao2, duasVezes, tresVezes, tresVezes2, tresVezesParcelas;
		String metodoPagamento;

		System.out.println("Insira o preço do produto: R$ ");
		precoProduto = leia.nextDouble();

		System.out.println("\nDinheiro ou cheque: Recebe 20% de desconto");
		System.out.println("\nÀ vista no cartão de crédito: Recebe 15% de desconto");
		System.out.println("\nEm duas vezes no cartão: Preço normal sem juros");
		System.out.println("\nEm três vezes no cartão: Preço normal mais 10% de juros");
		System.out.println("\n[DINHEIRO], [CHEQUE], [A VISTA], [DUAS VEZES], [TRES VEZES]");
		System.out.println("\nQual opção de pagamento deseja? (Responda do jeito escrito acima) ");
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
			System.out.printf("Você pagará seu produto em duas parcelas de R$ %f",duasVezes);
		}
		else if(metodoPagamento == "tres vezes" || metodoPagamento == "TRES VEZES" || metodoPagamento == "tresvezes" || metodoPagamento == "TRESVEZES"){
			tresVezes = (10 * precoProduto)/100;
			tresVezes2 = precoProduto + tresVezes;
			tresVezesParcelas = tresVezes2 / 3;
			System.out.println("Seu item ficou de R$ " + precoProduto + " por R$ " + tresVezes2 + ", e você pagará em parcelas de R$ " + Math.round(tresVezesParcelas));
		}
		else{
		System.out.println("Valor inválido! Tente novamente");
		}


	}

}
