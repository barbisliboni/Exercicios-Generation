import java.util.Scanner;

public class CalcularIdade{

	public static void main(String[] args){
		
		
		Scanner leia = new Scanner(System.in);
		
		int idade, total;
		
		
		System.out.println("Em qual ano você nasceu?");
		idade = leia.nextInt();
		
		calcular(idade);
		
		if(calcular(idade) < 18) {
			
			System.out.println("Infanto juvenil!");
			
		}
		else if(calcular(idade) >= 18 && calcular(idade) <= 60 ) {
			
			System.out.println("Adulto!");
			
		}
		else {
			
			System.out.println("Idoso!");
			
		}
		
		
		System.out.println("Você, que nasceu em " + idade + ", tem " + calcular(idade) +  " anos.");
		leia.close();

	}
	
	
	
		static int calcular(int idade) {
		
			int total;
			
			total = 2020 - idade;
			return total;
		}

}

