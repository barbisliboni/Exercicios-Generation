package poo.herancaEPolimorfismo;

public class Cachorro extends Animal{

	public Cachorro(String nome, int idade, String emitirSom, String correr) {
		super(nome, idade, emitirSom, correr);
	}
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	//MÉTODOS
	public String som (String animal) {
		animal = "*Wooof... Wooof...*";
		return animal;
		}
}
