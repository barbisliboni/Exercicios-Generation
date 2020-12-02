programa
{
	
	funcao inicio()
	{
		cadeia nomeTime1 = "Corinthians", nomeTime2 = "Palmeiras", nomeTime3 = "Santos", nomeTime4 = "SPFC"
		inteiro pontosTime1 = 0, pontosTime2 = 0, pontosTime3 = 0, pontosTime4 = 0
		caracter tipo


		 escreva("--------CONTROLE DE RODADAS--------")

		 para(inteiro rodada = 1; rodada <= 4; rodada++){
		 	
		 	escreva("Rodada: ",rodada,"\n")
		 	escreva(nomeTime1, "[G] - Ganhou, [P] - Perdeu ou [E] - Empatou? ");
		 	leia(tipo)

			escreva("Rodada: ",rodada,"\n")
		 	escreva(nomeTime2, "[G] - Ganhou, [P] - Perdeu ou [E] - Empatou? ");
		 	leia(tipo)

		 	escreva("Rodada: ",rodada,"\n")
		 	escreva(nomeTime3, "[G] - Ganhou, [P] - Perdeu ou [E] - Empatou? ");
		 	leia(tipo)

		 	escreva("Rodada: ",rodada,"\n")
		 	escreva(nomeTime4, "[G] - Ganhou, [P] - Perdeu ou [E] - Empatou? ");
		 	leia(tipo)

		 	
		 	pontosTime1 = pontosTime1 + retornaPontos(tipo)
		 	pontosTime2 = pontosTime2 + retornaPontos(tipo)
		 	pontosTime3 = pontosTime3 + retornaPontos(tipo)
		 	pontosTime4 = pontosTime4 + retornaPontos(tipo)
		 	
			escreva("\n")
		 	escreva("----Total das rodadas----")
		 	escreva("\n",nomeTime1, " - ", pontosTime1, "\n")
		 	escreva(nomeTime2, " - ", pontosTime2, "\n")
		 	escreva(nomeTime3, " - ", pontosTime3, "\n")
		 	escreva(nomeTime4, " - ", pontosTime4, "\n")
		 }
	}

	funcao inteiro retornaPontos(caracter tipo){

		inteiro pontoAtual = 0
		se(tipo == 'G' ou tipo == 'g'){
			pontoAtual = 3
			
		}senao se(tipo == 'E' ou tipo == 'e'){
			pontoAtual = 1
			
		}senao se(tipo == 'P' ou tipo == 'p'){
			pontoAtual = 0
		
		}senao{
			escreva("Valor inválido!")
		}
		retorne pontoAtual
		
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */