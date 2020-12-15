package poo.exercicioHeranca;

public class Vendedor extends Pessoa{
	
	private double valorVendas;
	private double atributoComissao;
	
	public Vendedor(String nome, String endereco, int telefone, double valorVendas, double atributoComissao) {
		super(nome, endereco, telefone);
		this.setValorVendas(valorVendas);
		this.setAtributoComissao(atributoComissao);
	}
	
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getAtributoComissao() {
		return atributoComissao;
	}

	public void setAtributoComissao(double atributoComissao) {
		this.atributoComissao = atributoComissao;
	}
}
