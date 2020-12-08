import java.util.Scanner;

public class NumeroMaiorQueCem {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int N;
		System.out.println("Insira um número qualquer:");
		N = leia.nextInt();

		if(N > 100){
			System.out.println("O número " + N + " é maior que 100.");
		}
		else{
			N = 0;
			System.out.println("O número inserido é menor que 100, portanto, vale " + N);
		}

	}

}
