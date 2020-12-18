package loja;

import java.util.Scanner;

public class Produto {
	
	private String nomeProduto;
	private String codigo;
	private double precoUnitario;
	private int qtdeProdutoEstoque;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public int getQtdeProdutoEstoque() {
		return qtdeProdutoEstoque;
	}
	public void setQtdeProdutoEstoque(int qtdeProdutoEstoque) {
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
	}	
	
	public Produto(String nomeProduto, String codigo, double precoUnitario, int qtdeProdutoEstoque) {
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoUnitario = precoUnitario;
		this.qtdeProdutoEstoque = qtdeProdutoEstoque;
	}
	
	public Produto() {
		
	}
	
	
	//MÉTODOS
	public void tiraEstoque(int saida) {
		if(testarEstoque(saida)) { //SE DER TRUE, O ESTOQUE DECREMENTA
			this.qtdeProdutoEstoque -= saida;
		}
		else {
			System.out.println("ESTOQUE ESGOTADO!"); //SE DER FALSE, APARECE ESSA MENSAGEM, POIS A QUANTIDADE Q A PESSOA QR EH MAIOR Q O ESTOQUE DISPONIVEL
		}
	}
	
	public boolean testarEstoque(int valor) {
		if(valor > this.qtdeProdutoEstoque) {
			return false; 
		}
		else if(valor == 0 || this.qtdeProdutoEstoque <= 0 ) {
			System.out.println("QUANTIDADE INVÁLIDA!");
			return false;
		}
		else {
			return true;
		}
	}
	
	public void adicionaEstoque(int entrada) {
		
	}
	
	public double venda(int qtdeVendida) {
		Scanner leia = new Scanner(System.in);
		double parcelas, valor = 0;
		
		if(testarEstoque(qtdeVendida)) {
			tiraEstoque(qtdeVendida);
			System.out.println("PAGAMENTO À VISTA - 10% DE DESCONTO [1]");
			System.out.println("PAGAMENTO DEBITO - VALOR NORMAL [2]");
			System.out.println("PAGAMENTO CREDITO - 5% DE JUROS [3]");
			System.out.println("PARCELAR EM 2X - 10% DE JUROS [4]");
			System.out.println("PARCELAR EM 3X - 10% DE JUROS [5]");
			System.out.println("Qual a forma de pagamento?");
			int formaPagamento = leia.nextInt();
			
			if(formaPagamento == 1) {
				System.out.println();
				System.out.println(" ╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲");
				System.out.println("│                                    │");
				System.out.println("│                                    │");
				System.out.println("│                                    │");
				System.out.println("│                KaBuM               │");
				System.out.println("│       O maior e-commerce tech      │");
				System.out.println("│                                    │");
				System.out.println("│        Total da sua compra:        │");
				System.out.println("│                                    │"); 
				System.out.print("│              R$ ");
				System.out.println(valor = Math.round(qtdeVendida + (this.precoUnitario - 0.10)));
				System.out.println("│                                    │");
				System.out.println("│                                    │");
				System.out.println("│                                    │");
				System.out.println(" ────────────────────────────────────");
				
				return valor;
			}
			else if(formaPagamento == 2) {
				System.out.println();
				System.out.println(" ╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲");
				System.out.println("│                                    │");
				System.out.println("│                                    │");
				System.out.println("│                                    │");
				System.out.println("│                KaBuM               │");
				System.out.println("│       O maior e-commerce tech      │");
				System.out.println("│                                    │");
				System.out.println("│        Total da sua compra:        │");
				System.out.println("│                                    │"); 
				System.out.print("│              R$ ");
				System.out.println(valor = Math.round(qtdeVendida + this.precoUnitario));
				System.out.println("│                                    │");
				System.out.println("│                                    │");
				System.out.println("│                                    │");
				System.out.println(" ────────────────────────────────────");
				
				return valor;
			}
			else if(formaPagamento == 3) {
				System.out.println();
				System.out.println(" ╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲");
				System.out.println("│                                    │");
				System.out.println("│                                    │");
				System.out.println("│                                    │");
				System.out.println("│                KaBuM               │");
				System.out.println("│       O maior e-commerce tech      │");
				System.out.println("│                                    │");
				System.out.println("│        Total da sua compra:        │");
				System.out.println("│                                    │"); 
				System.out.print("│              R$ ");
				System.out.println(valor = Math.round(qtdeVendida * (this.precoUnitario + 0.5)));
				System.out.println("│                                    │");
				System.out.println("│                                    │");
				System.out.println("│                                    │");
				System.out.println(" ────────────────────────────────────");
				
				return valor;

			}
			else if(formaPagamento == 4) {
				valor = qtdeVendida * (this.precoUnitario + 0.10);
				parcelas = valor/2;
				System.out.println();
				System.out.println(" ╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲");
				System.out.println("│                                    │");
				System.out.println("│                                    │");
				System.out.println("│                                    │");
				System.out.println("│                KaBuM               │");
				System.out.println("│       O maior e-commerce tech      │");
				System.out.println("│                                    │");
				System.out.println("│        Total da sua compra:        │");
				System.out.println("│                                    │"); 
				System.out.println("|         Valor total: R$ " + Math.round(valor) + "         │");
				System.out.println("|        em parcelas de R$ " + Math.round(parcelas) + "        │");
				System.out.println("│                                    │");
				System.out.println("│                                    │");
				System.out.println("│                                    │");
				System.out.println(" ────────────────────────────────────");
			}
			else if(formaPagamento == 5) {
				valor = qtdeVendida * (this.precoUnitario + 0.10);
				parcelas = valor/3;
				System.out.println();
				System.out.println(" ╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲╱╲");
				System.out.println("│                                    │");
				System.out.println("│                                    │");
				System.out.println("│                                    │");
				System.out.println("│                KaBuM               │");
				System.out.println("│       O maior e-commerce tech      │");
				System.out.println("│                                    │");
				System.out.println("│        Total da sua compra:        │");
				System.out.println("│                                    │"); 
				System.out.println("|         Valor total: R$ " + Math.round(valor) + "         │");
				System.out.println("|        em parcelas de R$ " + Math.round(parcelas) + "        │");
				System.out.println("│                                    │");
				System.out.println("│                                    │");
				System.out.println("│                                    │");
				System.out.println(" ────────────────────────────────────");
			}	
		}
		else {
			System.out.println("VENDA NEGADA!");
			return 0;
		}	
		return valor;
	}
	
}
