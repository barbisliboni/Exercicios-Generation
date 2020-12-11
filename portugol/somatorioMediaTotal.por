programa
{

	funcao inicio()
	{
		real numero, soma = 0, media, totalValores

		faca{
				escreva("Insira um valor: ");
				leia(numero)
				limpa()
				soma = soma + numero
				totalValores = numero + 1
				media = numero / totalValores
					
		}
		enquanto(numero != 0){
			
				escreva("\nSoma: ",soma, "\nMédia: ",media, "\nValores lidos: ",totalValores)
		}
		limpa()
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 203; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */