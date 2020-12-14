package poo;

import java.util.Scanner;

public class Loja {
	
	public static void main(String[] args)
	{
		
		Scanner leia = new Scanner(System.in);
		
		Pessoa cliente = new Pessoa();
		Pessoa clienteAvulso = new Pessoa();
		//Produto item1 = new Produto(); USANDO UM CONSTRUTOR VAZIO
		Produto item1 = new Produto();
		Produto item2 = new Produto("BLUSA", 20, 50.00);
		Produto item3 = new Produto("CAMISA", 6, 20.00);
		Produto item4 = new Produto("CALÇA", 5, 30.00);
		
		
		int contaAnoNascimento = (2020 - cliente.anoNascimento);	
		
		System.out.println("Bom dia, digite o seu nome: ");
		cliente.nome = leia.next().toUpperCase();
		
		System.out.println("Você é Masculino, Feminino ou Outros: [M/F/O");
		cliente.genero = leia.next().toUpperCase().charAt(0);
		
		System.out.println("Qual seu ano de nascimento?");
		cliente.anoNascimento = leia.nextInt();
		
		
		if(cliente.genero == 'M') {
			System.out.printf("Seja bem vindo, %s", cliente.nome);
		}
		else if(cliente.genero == 'F') {
			System.out.printf("Seja bem vinda, %s", cliente.nome);
		}
		else if(cliente.genero == 'O') {
			System.out.printf("Sejx bem vindx, %s", cliente.nome);
		}
		else {
			System.out.println("Valor inválido!");
		}
		
		
		if(contaAnoNascimento < 18) {
			System.out.println(". Você é boot jovem [boot arduíno]!");
		}
		else if(contaAnoNascimento >= 18 && contaAnoNascimento <= 55) {
			System.out.println(". Você é javeiro [boot java]!");
		}
		else {
			System.out.println(". Você é old boot [boot da melhor idade]!");
		}
		
		
		System.out.println("\nQual item deseja? [BLUSA, CAMISA OU CALÇA JEANS?");
		item1.nomeProduto = leia.next().toUpperCase();
		
		if(item1.nomeProduto == item2.nomeProduto) {
			System.out.printf("PRODUTO ESCOLHIDO: %s", item2.nomeProduto);
		}
		else if(item1.nomeProduto == item3.nomeProduto) {
			System.out.printf("PRODUTO ESCOLHIDO: %s", item3.nomeProduto);
		}
		else if(item1.nomeProduto == item3.nomeProduto) {
			System.out.printf("PRODUTO ESCOLHIDO: %s", item4.nomeProduto);
		}
		
		//System.out.println("PRODUTO DISPONIVEL NO MOMENTO:");
		//System.out.printf("PRODUTO: %s, qtde: %d, valor R$: %.2f\n", produto, qtde, valorProduto);

}
}