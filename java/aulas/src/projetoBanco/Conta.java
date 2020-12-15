package projetoBanco;

public class Conta {


	protected int numeroConta;
	protected String cpf;
	protected double saldo;

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Conta(int numeroConta, String cpf, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	
	public Conta(int numeroConta, String cpf) {
		super();
		this.numeroConta = numeroConta;
		this.cpf = cpf;
	}
	
	public Conta(String cpf) {
		super();
		this.cpf = cpf;
	}
	
	public Conta(int numeroConta) {
		super();
		this.numeroConta = numeroConta;
	}
	
	
}


