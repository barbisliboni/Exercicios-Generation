package poo;

public class AviaoDados {

	public static void main(String[] args) {
		
		Aviao modelo1 = new Aviao("Airbus A320", 11.7, 64.300, 345 ,871);
		
		Aviao modelo2 = new Aviao("Boeing 737", 12.5, 41.413, 215, 850);
		
		System.out.printf("Modelo %s \nAltura: %.2f \nPeso: %.2f \nCapacidade máxima de passageiros: %d \nVelocidade máxima: %.2f \n\n", modelo1.modelo, 
				modelo1.altura, modelo1.peso, modelo1.maxPessoas, modelo1.velocidadeMaxima);
		
		System.out.printf("Modelo %s \nAltura: %.2f \nPeso: %.2f \nCapacidade máxima de passageiros: %d \nVelocidade máxima: %.2f \n\n", modelo2.modelo, 
				modelo2.altura, modelo2.peso, modelo2.maxPessoas, modelo2.velocidadeMaxima);
	}

}
