programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real x1 = 0.0, x2 = 0.0, y1 = 0.0, y2 = 0.0, d = 0.0, p1 = 0.0, p2 0.0

		escreva ("Valor de X1: ");
		leia(x1);

		escreva ("Valor de X2: ");
		leia(x2);

		escreva ("Valor de Y1: ");
		leia(y1);

		escreva ("Valor de Y2: ");
		leia(y2);

		p1 = Matematica.potencia((x2-x1),2);
		p2 = Matematica.potencia((y2-y1),2);
		d = Matematica.raiz((p1+p2),2);

		escreva("Valor de distância é ", Matematica.arredondar(d, 2));
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 487; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */