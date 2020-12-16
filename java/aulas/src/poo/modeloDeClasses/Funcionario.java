package poo.modeloDeClasses;

public class Funcionario {
	private String nome;
	private int horasMensais;
	private double valorHora;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHotasMensais() {
		return horasMensais;
	}

	public void setHotasMensais(int horasMensais) {
		this.horasMensais = horasMensais;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	
	
	public Funcionario(String nome, int horasMensais, double valorHora) {
		this.nome = nome;
		this.horasMensais = horasMensais;
		this.valorHora = valorHora;
	}
	
	
	//MÉTODOS
	public double pagamentoSalario(double horasMensais) {
		double salario = horasMensais * valorHora;
		return salario;
	}

}
