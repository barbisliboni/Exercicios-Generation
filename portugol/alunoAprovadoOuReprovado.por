programa
{
	funcao inicio()
	{
		inteiro nota
		cadeia nome
		caracter aluno
		escreva("Você é aluno? [S/N] ");
		leia(aluno);
		se(aluno == 'N' ou aluno == 'n'){
			escreva("Você não estuda aqui!")
		}
		senao se (aluno == 'S' ou aluno == 's')
		{
			escreva("Qual o seu nome? ")
			leia(nome)
			escreva("Insira a sua nota: ")
			leia(nota)
			limpa()
			se(nota >= 6 e nota <= 10 e aluno == 'S' ou aluno == 's')
			{
				escreva(nome,", você está aprovado(a)!")
			}
			senao se(nota >=0 e nota <=5)
			{
				escreva(nome,", você está reprovado(a)!")
			}
			senao
			{
				escreva("Nota e/ou valor inválida(o)!")
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 458; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */