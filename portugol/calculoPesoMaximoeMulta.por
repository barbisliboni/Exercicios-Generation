programa
{
	
	funcao inicio()
	{
		real P, E, M

		escreva("Insira qual a quantidade de tomates (em kg) que está levando: ");
		leia(P);

		se(P > 50){
			E = P - 50;
			M = E*4;

			escreva("Você está levando ", E, " kg a mais, e pagará um total de R$ ",M," de multa.");
		}
		senao se(P == 50){
			escreva("Você está levando 50kg (o peso máximo).");
		}

		senao{
			M = 0;
			escreva("Você está levando ",P, " kg. Pagará um total de R$ ",M," de multa.");
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 466; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */