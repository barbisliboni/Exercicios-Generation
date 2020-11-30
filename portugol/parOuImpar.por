programa
{
	
	funcao inicio()
	{
	 	inteiro numero

	 	escreva("Insira um número positivo/inteiro: ");
	 	leia(numero)


		se(numero <= 0){
	 		escreva("Valor incorreto! Insira um número positivo.");
	 	}

	 	senao se(numero % 2 == 1){
	 		escreva("Seu número é ímpar!");
	 	}

	 	
	 	
	 	senao{
	 		escreva("Seu número é par!");
	 	}
	 	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 343; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */