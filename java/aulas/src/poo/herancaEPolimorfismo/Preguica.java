package poo.herancaEPolimorfismo;

public class Preguica extends Animal {

	public Preguica(String nome, int idade, String emitirSom, String correr) {
		super(nome, idade, emitirSom, correr);
	}
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	//MÉTODOS
	public String som (String animal){
			animal = "*Uaaaa... Uaaaa...*";
			return animal;
		}
}
