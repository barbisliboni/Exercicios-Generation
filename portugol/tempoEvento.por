programa
{
	
	funcao inicio()
	{
		inteiro tempoSegundos 
		inteiro contaMinutos
		inteiro contaHoras
		inteiro segundos
		
		
		escreva ("Digite a duração do evento em segundos: ");
		leia(tempoSegundos);

		contaHoras = tempoSegundos/3600;
		contaMinutos = (tempoSegundos%3600)/60;
		segundos = (tempoSegundos%3600)%60;

		 escreva ("O evento tem duração de " + contaHoras + "horas, " + contaMinutos + " minutos e " + segundos + " segundos."); 
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 428; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */