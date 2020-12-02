programa
{
	
	funcao inicio()
	{
		cadeia times[4]
		inteiro numero

		times[0] = "Corinthians"
		times[1] = "Palmeiras"
		times[2] = "Santos"
		times[3] = "SPFC" 

		para(inteiro contador = 0; contador <= 4; contador++){
			escreva("Digite um número de 0-3: ")
			leia(numero)
			
			escreva(times[numero], "\n")
			
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 317; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */