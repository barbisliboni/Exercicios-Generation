programa
{
	funcao inicio()
	{
		caracter genero
		cadeia materias [4] = {"Português", "Matemática","Ciências", "Artes"}
		inteiro notas [4]
		cadeia nome
		escreva("Insira seu nome: ");
		leia(nome)
		escreva("Escreva [F] para feminino ou [M] para masculino: ");
		leia(genero)
		para(inteiro x = 0; x < 4; x++)
		{
			escreva("Insira a nota de ",materias[x], ": ")
			leia(notas[x])		
		}
		escreva("RESULTADO\n")
		para (inteiro x = 0; x < 4; x++)
		{
			se(notas[x] <= 5 e genero == 'F' ou genero == 'f')
			{
				escreva(nome, " você foi reprovada com a seguintes nota:",materias[x], ": ", notas[x],"\n")
			}
			senao se(notas[x] <= 5 e (genero == 'M' ou genero == 'm'))
			{
				 escreva(nome, " você foi reprovado com as seguinte nota:",materias[x], ": ", notas[x],"\n")
			}
			senao se(notas[x] >= 6 e x <= 10 e (genero == 'F' ou genero == 'f'))
			{
				escreva(nome, " você foi aprovada com as seguinte nota: ",materias[x], ": ", notas[x],"\n")
			}
			senao se(notas[x] >= 6 e x <= 10 e (genero == 'M' ou genero == 'm'))
			{
					escreva(nome, " você foi aprovado com as seguinte nota:",materias[x], ": ", notas[x],"\n")
			}
			senao
			{
					escreva("Valores inválidos!")
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 415; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */