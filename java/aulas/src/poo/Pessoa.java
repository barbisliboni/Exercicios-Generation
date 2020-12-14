package poo;

public class Pessoa {
	
	public String nome;
	public char genero;
	public int anoNascimento;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(String nome, char genero) {
		this.nome = nome;
		this.genero = genero; 
	}
	
	public Pessoa() {
		
	}
}

