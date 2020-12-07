import java.util.Scanner;
import java.lang.Math;

public class CalculoDistancia {

		public static void main(String args[]) {
			
			Scanner leia = new Scanner (System.in);
			double x1 = 0.0,  x2 = 0.0, y1 = 0.0, y2 = 0.0, d = 0.0, p1 = 0.0, p2 = 0.0;
			
			System.out.println("Valor de X1: ");
			x1 = leia.nextDouble();
			
			System.out.println("Valor de X2: ");
			x2 = leia.nextDouble();
			
			System.out.println("Valor de Y1: ");
			y1 = leia.nextDouble();
			
			System.out.println("Valor de Y2: ");
			y2 = leia.nextDouble();
			
			p1 = Math.pow((x2-x1),2);
			p2 = Math.pow((y2-y1),2);
			d = Math.sqrt((p1+p2));
			
			System.out.println("Valor da distância: " + Math.round(d));
			
			
			
		}
}
