package poo.exercicioHeranca;

public class Administrador extends Pessoa{
	
	private double ajudaDeCusto;
	
	public Administrador(String nome, String endereco, int telefone, double ajudaDeCusto) {
		super(nome, endereco, telefone);
		this.setAjudaDeCusto(ajudaDeCusto);
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto2) {
		this.ajudaDeCusto = ajudaDeCusto2;
	}
}

