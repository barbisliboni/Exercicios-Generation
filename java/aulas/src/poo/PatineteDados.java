package poo;

public class PatineteDados {

	public static void main(String[] args) {
		
	Patinete patinete1 = new Patinete("Patinete Xiomi M365", "Liga de alumínio", "Preto e Branco", 25, 12);
	
	System.out.println("NOME\t\t\t  MATERIAL\t\t CORES\t\t VEL. MAX.\t PESO");
	System.out.printf("%s\t %s\t %s\t %.2f km/h\t %d kg\t", patinete1.nome, patinete1.material, patinete1.cor, patinete1.velocidadeMaxima, patinete1.peso );
	}

}
