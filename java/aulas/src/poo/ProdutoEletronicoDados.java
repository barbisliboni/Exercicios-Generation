package poo;

public class ProdutoEletronicoDados {

	public static void main(String[] args) {

		ProdutoEletronico produto1 = new ProdutoEletronico("Echo Dot", true, true, 43);
		
		if(produto1.wifi == true && produto1.bluetooth == true) {
			System.out.printf("Produto %s \nPossui: wifi e bluetooth \nTamanho: %d mm \n \n", produto1.tipo, produto1.tamanho);
		}
		else {
			System.out.printf("Produto %s \nNão possui: wifi e bluetooth \nTamanho: %d mm \n \n", produto1.tipo, produto1.tamanho);
		}

	}

}
