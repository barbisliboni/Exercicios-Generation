package poo;

public class ContaBancaria {
	public int cpf;
	public int rg;
	public double renda;
	
	public String nomeCompleto;
	public ContaBancaria(String nomeCompleto, int cpf, int rg, double renda) {
		super();
		this.nomeCompleto = nomeCompleto;
		this.cpf = cpf;
		this.rg = rg;
		this.renda = renda;
	}
	
	public ContaBancaria() {
		
	}
}
