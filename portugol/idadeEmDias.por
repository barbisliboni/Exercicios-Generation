programa
{
	
	funcao inicio()
	{
		real idadeAnos 
		real idadeMeses
		real idadeDias 
		real contaMeses
		real contaAnos
		real total
		
		
		escreva ("Digite sua idade em anos: ");
		leia(idadeAnos);
		
		escreva("Digite sua idade em meses: ");
		leia(idadeMeses);
		
		escreva("Digite sua idade em dias: ");
		leia(idadeDias);

		contaMeses = idadeMeses*30;
		contaAnos = idadeAnos*365;

		total = (idadeDias+contaMeses)+contaAnos;
		

		escreva("Você tem " + total + " dias de vida!")  
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 389; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */