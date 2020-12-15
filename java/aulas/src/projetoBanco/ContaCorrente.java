package projetoBanco;

public class ContaCorrente extends Conta {
	
	protected int numerotalaoCheque;

	public int getNumerotalaoCheque() {
		return numerotalaoCheque;
	}

	public void setNumerotalaoCheque(int numerotalaoCheque) {
		this.numerotalaoCheque = numerotalaoCheque;
	}
	
	public ContaCorrente(int numeroConta, String cpf) {
		super(numeroConta, cpf);
	}
	
	public ContaCorrente(String cpf) {
		super(cpf);
	}
}
