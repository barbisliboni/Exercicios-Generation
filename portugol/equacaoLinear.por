programa
{
	
	funcao inicio()
	{
		real A, B, C, D, E, F, X, Y

		escreva("Insira o valor de A: ");
		leia(A);

		escreva("Insira o valor de B: ");
		leia(B);

		escreva("Insira o valor de C: ");
		leia(C);

		escreva("Insira o valor de D: ");
		leia(D);

		escreva("Insira o valor de E: ");
		leia(E);

		escreva("Insira o valor de F: ");
		leia(F);

		X = (C*E - B*F) / (A*E - B*D);
		Y = (A*F - C*D) / (A*E - B*D);

		escreva("O valor de X é de " + X + " e o valor de Y é de "+ Y);
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 258; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */