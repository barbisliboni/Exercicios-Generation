programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real tempFah; 
		escreva("Digite a temperatura em graus Fahrenheit: ");
		leia(tempFah);
		real conta = (tempFah-32)/1.8;
		escreva("A temperatura " + tempFah + " em Celsius é igual a " + Matematica.arredondar(conta, 2));
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 291; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */