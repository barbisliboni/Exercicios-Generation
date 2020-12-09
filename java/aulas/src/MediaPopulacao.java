import java.util.Scanner;

public class MediaPopulacao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double mediaSalario = 0.0, maiorSalario = 0.0, mediaNumFilhos = 0, salarioMorador = 0.0;
		int numFilhos = 0, salarioAte100 = 0;

				
		for(int x = 1; x <= 20; x++){
			System.out.println("Digite seu salário, morador " + x + ": ");
			salarioMorador = leia.nextDouble();

			System.out.println("Quantos filhos você tem, morador " + x + "? ");
			numFilhos = leia.nextInt();
			
			mediaSalario = salarioMorador/x;

			mediaNumFilhos = numFilhos/x;

			if(salarioMorador > mediaSalario){
						maiorSalario = salarioMorador;
					}
					if(salarioMorador <= 100){
						salarioAte100 = (int) (mediaSalario/100);
					}
					
				}

				System.out.println("Média de salário: R$ " + Math.round(mediaSalario) + "\nMédia de número de filhos: " +
				Math.round(mediaNumFilhos) + "\n Maior salário: " + maiorSalario + "\n Pessoas que ganham até R$ 100: " + Math.round(salarioAte100) + "%");		

	}

}
