import java.util.Scanner;

public class NumeroMaiorQueCem {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int N;
		System.out.println("Insira um n�mero qualquer:");
		N = leia.nextInt();

		if(N > 100){
			System.out.println("O n�mero " + N + " � maior que 100.");
		}
		else{
			N = 0;
			System.out.println("O n�mero inserido � menor que 100, portanto, vale " + N);
		}

	}

}
