package poo.herancaEPolimorfismo;

public class Animal {
	private String nome;
	private int idade;
	private String emitirSom;
	private String correr;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String isEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}

	public String isCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public Animal(String nome, int idade, String emitirSom, String correr) {
		this.nome = nome;
		this.idade = idade;
		this.emitirSom = emitirSom;
		this.correr = correr;
	}
	
	public Animal(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	//MÉTODOS
	public String som (String animal) {
		animal = "*Any kind of animal sound*";
		return animal;
		
	}
}
