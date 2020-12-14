package poo;

public class Paciente {
	public String nome;
	public String endereco;
	public String tipoExame;
	public int rg;
	public int cpf;
	
	public Paciente(String nome, String endereco, String tipoExame, int rg, int cpf) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.tipoExame = tipoExame;
		this.rg = rg;
		this.cpf = cpf;
	}
}
