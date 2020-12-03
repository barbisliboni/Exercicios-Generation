programa
{
	
	funcao inicio()
	{
		inteiro pontuacao [5]
		inteiro x
		inteiro maiorNota = 0
		

		para(x = 0; x < 5; x++){

			escreva("Insira sua nota ",x+1, ": ")
			leia(pontuacao[x])

			se(maiorNota < pontuacao[x]){
				maiorNota = pontuacao[x]
			}
		}


			escreva("Sua maior nota foi ",maiorNota)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 250; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */