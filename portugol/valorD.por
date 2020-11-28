programa
{
	
	funcao inicio()
	{
		inteiro A, B, C, R, S;
		real D;

		escreva("Insira o valor de A: ");
		leia(A)

		escreva("Insira o valor de B: ");
		leia(B)

		escreva("Insira o valor de C: ");
		leia(C)

		R = (A + B)*(A + B);
		S = (B + C)*(B + C);

		D = (R + S)/2.0; //a divisão deve ser 2.0 pois em algumas lingaguens alguma parte pelo menos deve ser em real

		escreva ("O resultado de D é igual a: ",D);
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 368; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */