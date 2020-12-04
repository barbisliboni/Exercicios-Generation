programa
{
	
	funcao inicio()
	{
		real movimento [10], saldo = 0.0, limite = 10000.00, totalGasto = 0.0, cpf, numeroConta

		
		escreva("Qual seu CPF?")
		leia(cpf)
		escreva("Qual  o número da sua conta?")
		leia(numeroConta)
		
		para(inteiro x = 0; x < 10; x++){
			escreva("Quanto pretende gastar? R$ " );
			leia(saldo)
			escreva("\n")
			limpa()

			se(saldo < limite){
				limite -= saldo
				totalGasto += saldo

				escreva("CPF: ",cpf, "\nNúmero da conta: ", numeroConta)
				escreva("\nSeu limite atual é de: R$ ",limite, ", e total gasto é de: R$ ",totalGasto)
				escreva("\n", "\n")
			}
		}	senao se(saldo > limite){
			}

	}
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 230; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */