import java.util.Scanner;

public class MediaPopulacao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double mediaSalario = 0.0, maiorSalario = 0.0, mediaNumFilhos = 0, salarioMorador = 0.0;
		int numFilhos = 0, salarioAte100 = 0;

				
		for(int x = 1; x <= 20; x++){
			System.out.println("Digite seu sal�rio, morador " + x + ": ");
			salarioMorador = leia.nextDouble();

			System.out.println("Quantos filhos voc� tem, morador " + x + "? ");
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

				System.out.println("M�dia de sal�rio: R$ " + Math.round(mediaSalario) + "\nM�dia de n�mero de filhos: " +
				Math.round(mediaNumFilhos) + "\n Maior sal�rio: " + maiorSalario + "\n Pessoas que ganham at� R$ 100: " + Math.round(salarioAte100) + "%");		

	}

}
