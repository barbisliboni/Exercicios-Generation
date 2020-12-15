package poo.exercicioHeranca;

public class Fornecedor extends Pessoa{
	
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome, String endereco, int telefone, double valorCredito, double valorDivida) {
		super(nome, endereco, telefone);
		this.setValorCredito(valorCredito);
		this.setValorDivida(valorDivida);
	}
	
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	public double obterSaldo(double valores) {
		double diferenca;
		valores = valorCredito;
		diferenca = valores - valorDivida;
		return diferenca;
	}
	
}
