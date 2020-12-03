programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro lancamentos [10]
		inteiro x, numero, repetir = 0
		real media = 0.0

		
			para(x = 0; x < 10; x++){

				numero = Util.sorteia(1, 10) //Importei a biblioteca Util para sortear um número entre 1 e 10 
				escreva("\nNumero sorteado: ", numero)

				media = (numero + numero)/2
				
		}

			escreva("\nMédia aritmética: ",media)		
	}

		

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 380; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */