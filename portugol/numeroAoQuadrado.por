programa
{
	
	funcao inicio()
	{
		real n1, n2, n3, n4, conta1, conta2, conta3, conta4

		escreva("Insira o primeiro número: ");
		leia(n1);

		
		escreva("Insira o segundo número: ");
		leia(n2);

		
		escreva("Insira o terceiro número: ");
		leia(n3);

		
		escreva("Insira o quarto número: ");
		leia(n4);

		conta1 = n1*n1;
		conta2 = n2*n2;
		conta3 = n3*n3;
		conta4 = n4*n4;
		limpa();

		se(conta4 >= 1000){
			escreva("Terceiro número: ",conta4);
		}
		senao{
			escreva("Primeiro número: ",conta1, "\nSegundo número: ", conta2, "\nQuarto número: ", conta4)
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 398; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */