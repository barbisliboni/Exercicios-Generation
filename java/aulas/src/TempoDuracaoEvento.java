import java.util.Scanner;

public class TempoDuracaoEvento {
	
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		
		int tempoSegundos, contaMinutos, contaHoras, segundos;
		
		System.out.println("Digite a duração do evento em segundos: ");
		tempoSegundos = leia.nextInt();
		
		contaHoras = tempoSegundos/3600;
		contaMinutos = (tempoSegundos%3600)/60;
		segundos = (tempoSegundos%3600)%60;
		
		System.out.println("O evento tem duração de " + contaHoras + " horas, " + contaMinutos + " minutos e " + segundos + " segundos.");
		
		leia.close();
	}

}
