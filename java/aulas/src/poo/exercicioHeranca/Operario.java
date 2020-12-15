package poo.exercicioHeranca;

public class Operario extends Pessoa{
	
	private double valorProducao;
	private double comissao;
	
	public Operario(String nome, String endereco, int telefone, double valorProducao, double comissao) {
		super(nome, endereco, telefone);
		this.setValorProducao(valorProducao);
		this.setComissao(comissao);
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
}
