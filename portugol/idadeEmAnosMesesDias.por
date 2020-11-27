programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		inteiro idadeAnos 
		inteiro idadeMeses
		inteiro idadeDias 
		inteiro contaMeses
		inteiro contaAnos


	
		
		escreva("Digite sua idade em dias: ");
		leia(idadeDias);

		contaAnos = idadeDias/365;
		idadeDias -= contaAnos*365;
		contaMeses = idadeDias/30;
		idadeDias -= contaMeses*30
		
		
		escreva("Você tem " + contaAnos + " anos, " + contaMeses + 
		" meses e " + idadeDias + " dias de vida!")  
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 394; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */