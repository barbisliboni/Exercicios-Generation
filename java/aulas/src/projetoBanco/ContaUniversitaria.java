package projetoBanco;

public class ContaUniversitaria extends Conta{

	private double emprestimoUniversitario;

	public double getEmprestimoUniversitario() {
		return emprestimoUniversitario;
	}

	public void setEmprestimoUniversitario(double emprestimoUniversitario) {
		this.emprestimoUniversitario = emprestimoUniversitario;
	}
	
	public ContaUniversitaria(int numeroConta, String cpf, double emprestimoUniversitario) {
		super(numeroConta, cpf);
		this.emprestimoUniversitario = emprestimoUniversitario;
	}
	
	public ContaUniversitaria(int numeroConta, double emprestimoUniversitario) {
		super(numeroConta);
		this.emprestimoUniversitario = emprestimoUniversitario;
	}
}
