package poo.herancaEPolimorfismo;

public class AnimaisSons {

	public static void main(String[] args) {
		
		Cachorro cachorro1 = new Cachorro ("Willy", 12);
		Cavalo cavalo1 = new Cavalo ("Horseman", 6);
		Preguica preguica1 = new Preguica ("Robson", 2);
		
		System.out.println("O cachorro chamado " + cachorro1.getNome() + " faz " + cachorro1.som("Cachorro"));
		System.out.println("O cavalo chamado " + cavalo1.getNome() +  " faz " + cavalo1.som("Cavalo"));
		System.out.println("A preguiça chamada " + preguica1.getNome() + " faz " + preguica1.som("Preguiça"));
	}

}
