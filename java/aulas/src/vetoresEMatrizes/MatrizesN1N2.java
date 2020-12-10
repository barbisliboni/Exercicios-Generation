package vetoresEMatrizes;

import java.util.Scanner;

public class MatrizesN1N2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int N1 [][] = new int [4][6];
		int N2 [][] = new int [4][6];
		int M1 [][] = new int [4][6];
		int M2 [][] = new int [4][6];
		
		//MATRIZ N1
		System.out.print("                             MATRIZ N1");
		for (int coluna = 0; coluna < 4; coluna++ ) {
			System.out.println("\t");
			System.out.println("\n");
			for(int linha = 0; linha < 6; linha++) {
				System.out.print("\t");
				System.out.printf("[%d][%d]\t", coluna, linha);
			}
		}
		
		
		System.out.println("\n");
		for (int coluna = 0; coluna < 4; coluna++ ) {
			for(int linha = 0; linha < 6; linha++) {
				System.out.printf("Insira um valor [%d][%d]", coluna, linha);
				N1[coluna][linha] = leia.nextInt();
			}
		}
		
		
		//MATRIZ N2
		System.out.println("\n\n");
		System.out.print("                             MATRIZ N2");
		for (int coluna = 0; coluna < 4; coluna++ ) {
			System.out.println("\t");
			System.out.println("\n");
			for(int linha = 0; linha < 6; linha++) {
				System.out.print("\t");
				System.out.printf("[%d][%d]\t", coluna, linha);
			}
		}
		
		
		System.out.println("\n");
		for (int coluna = 0; coluna < 4; coluna++ ) {
			for(int linha = 0; linha < 6; linha++) {
				System.out.printf("Insira um valor [%d][%d]", coluna, linha);
				N2[coluna][linha] = leia.nextInt();
			}
		}
		
		
		
		System.out.println("\nSOMA");
		for(int coluna = 0; coluna < 4; coluna++) {
			for(int linha = 0; linha < 6; linha++) {
				M1[coluna][linha] = N1[coluna][linha] + N2[coluna][linha];
				System.out.println("Soma dos elementos: " + M1[coluna][linha]);
			}
		}
		
		System.out.println("\nDIFERENÇA");
		for(int coluna = 0; coluna < 4; coluna++) {
			for(int linha = 0; linha < 6; linha++) {
				M1[coluna][linha] = N1[coluna][linha] - N2[coluna][linha];
				System.out.println("Soma dos elementos: " + M1[coluna][linha]);
			}
		}
	}

}
