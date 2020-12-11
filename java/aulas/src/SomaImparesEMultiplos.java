
public class SomaImparesEMultiplos {

	public static void main(String[] args) {
		
		int x, soma = 0;
				for(x = 0; x <= 500; x = x++){
					if(x % 2 == 1){

						soma += x;
						System.out.println("\n" + soma);
					}		
				}

	}

}
