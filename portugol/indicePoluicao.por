programa
{
	
	funcao inicio()
	{
		real indicePoluicao
		inteiro grupo 
		inteiro grupo1 = 1
		inteiro grupo2 = 2
		inteiro grupo3 = 3

		escreva("A qual grupo sua empresa pertence (1, 2 ou 3)?");
		leia(grupo);
		
		escreva("Insira o índice de poluição de sua empresa: ");
		leia(indicePoluicao);
		limpa();

		se(indicePoluicao >=0.05 e indicePoluicao <= 0.25){
			escreva("Muito bem! Continue assim que o meio ambiente agradece! :)");
		}
		senao se(grupo == grupo1 e indicePoluicao == 0.3){
			escreva("A sua e todas as outras indústrias do grupo 1 serão intimadas.");
		}
		senao se(grupo == grupo1 ou grupo == grupo2 e indicePoluicao == 0.4){
			escreva("Todas as empresas pertencentes aos grupos 1 e 2 serão intimadas a suspenderem suas atividades.");
		}
		senao se(grupo == grupo1 ou grupo == grupo2 ou grupo == grupo3 e indicePoluicao >= 0.5){
			escreva("Todos os grupos devem paralisar suas atividades imediatamente!");
		}
		senao{
			escreva("Valores inválidos! Tente novamente.");
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 232; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */