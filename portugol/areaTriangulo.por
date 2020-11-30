programa
{
	
	funcao inicio()
	{
		real base, altura, area

		escreva("Insira a base do triângulo: ");
		leia(base)

		escreva("Insira a altura do triângulo: ");
		leia(altura)
		limpa()

		se(base >= 0 e altura >= 0){
			area = (base*altura)/2
			escreva("A área total do triângulo é de ",area)
		}
		senao{
			escreva("Valor inválido! Não é possível calcular a área sendo um número negativo.");
		}
	}
}



/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 330; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */