package projetoBanco;

public class ContaUniversitaria extends Conta{

	private int emprestimoUniversitario;

	public int getEmprestimoUniversitario() {
		return emprestimoUniversitario;
	}

	public void setEmprestimoUniversitario(int emprestimoUniversitario) {
		this.emprestimoUniversitario = emprestimoUniversitario;
	}
	
	public ContaUniversitaria(int numeroConta, String cpf, int emprestimoUniversitario) {
		super(numeroConta, cpf);
		this.emprestimoUniversitario = emprestimoUniversitario;
	}
}
