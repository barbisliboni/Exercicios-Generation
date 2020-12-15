package projetoBanco;

public class ContaPoupanca extends Conta {

	private int dataAniversarioConta;

	public int getDataAniversarioConta() {
		return dataAniversarioConta;
	}

	public void setDataAniversarioConta(int dataAniversarioConta) {
		this.dataAniversarioConta = dataAniversarioConta;
	}
	
	public ContaPoupanca(int numeroConta, String cpf, int dataAniversarioConta) {
		super( numeroConta, cpf);
		this.dataAniversarioConta = dataAniversarioConta;
	}
	
	
}
