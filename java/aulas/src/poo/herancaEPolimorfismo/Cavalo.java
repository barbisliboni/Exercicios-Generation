package poo.herancaEPolimorfismo;

public class Cavalo extends Animal{

	public Cavalo(String nome, int idade, String emitirSom, String correr) {
		super(nome, idade, emitirSom, correr);
	}
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}
	
	//MÉTODOS
	public String som (String animal) {
			animal = "*Hinn in in... Hinn in in...*";
			return animal;
		}
}
