package projetoBanco;

public class ContaEspecial extends ContaCorrente {

	private double valorLimite;

	public double getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(double valorLimite) {
		this.valorLimite = valorLimite;
	}
	
	public ContaEspecial(int numeroConta, String cpf) {
		super(numeroConta, cpf);
		
	}
	
}
