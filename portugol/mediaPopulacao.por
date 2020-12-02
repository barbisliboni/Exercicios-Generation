programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real mediaSalario = 0.0, maiorSalario = 0.0, mediaNumFilhos = 0, salarioMorador = 0.0
		inteiro numFilhos = 0, salarioAte100 = 0

		
		para(inteiro x = 1; x <= 20; x++){
			escreva("Digite seu salário, morador ", x, ": ")
			leia(salarioMorador);

			escreva("Quantos filhos você tem, morador ", x, "? ")
			leia(numFilhos);
			limpa()

			mediaSalario = salarioMorador/x

			mediaNumFilhos = numFilhos/x

			se(salarioMorador > mediaSalario){
				maiorSalario = salarioMorador
			}
			se(salarioMorador <= 100){
				salarioAte100 = mediaSalario/100
			}
			
		}

		escreva("Média de salário: R$ ",Matematica.arredondar(mediaSalario, 2), "\nMédia de número de filhos: ",
		Matematica.arredondar(mediaNumFilhos, 2), "\n Maior salário: ",maiorSalario, "\n Pessoas que ganham até R$ 100: ", Matematica.arredondar(salarioAte100, 2), "%");		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 227; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */