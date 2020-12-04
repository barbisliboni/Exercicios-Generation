programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real precoProduto, aVistaDinheiro, aVistaCartao, aVistaCartao2, duasVezes, tresVezes, tresVezes2, tresVezesParcelas
		cadeia metodoPagamento

		escreva("Insira o preço do produto: R$ ")
		leia(precoProduto)

		escreva("\nDinheiro ou cheque: Recebe 20% de desconto")
		escreva("\nÀ vista no cartão de crédito: Recebe 15% de desconto")
		escreva("\nEm duas vezes no cartão: Preço normal sem juros")
		escreva("\nEm três vezes no cartão: Preço normal mais 10% de juros")
		escreva("\n[DINHEIRO], [CHEQUE], [A VISTA], [DUAS VEZES], [TRES VEZES]")
		escreva("\nQual opção de pagamento deseja? (Responda do jeito escrito acima) ")
		leia(metodoPagamento)
		limpa()

		se(metodoPagamento == "dinheiro" ou metodoPagamento == "DINHEIRO" ou metodoPagamento == "cheque" ou metodoPagamento == "CHEQUE"){
			aVistaDinheiro = precoProduto / 5
			escreva("Seu produto ficou de R$ ",precoProduto, " por R$ ",aVistaDinheiro)
		}
		senao se(metodoPagamento == "a vista" ou metodoPagamento == "A VISTA" ou metodoPagamento == "avista" ou metodoPagamento == "AVISTA"){
			aVistaCartao = precoProduto * 0.15 
			aVistaCartao2 = precoProduto - aVistaCartao
			escreva("Seu produto ficou de R$ ",precoProduto, " por R$ ",aVistaCartao2)
		}
		senao se(metodoPagamento == "duas vezes" ou metodoPagamento == "DUAS VEZES" ou metodoPagamento == "duasvezes" ou metodoPagamento == "DUASVEZES"){
			duasVezes = precoProduto / 2
			escreva("Você pagará seu produto em duas parcelas de R$ ",duasVezes)
		}
		senao se(metodoPagamento == "tres vezes" ou metodoPagamento == "TRES VEZES" ou metodoPagamento == "tresvezes" ou metodoPagamento == "TRESVEZES"){
			tresVezes = (10 * precoProduto)/100
			tresVezes2 = precoProduto + tresVezes
			tresVezesParcelas = tresVezes2 / 3
			escreva("Seu item ficou de R$ ",precoProduto, " por R$ ",tresVezes2, ", e você pagará em parcelas de R$ ", Matematica.arredondar(tresVezesParcelas, 2))
		}
		senao{
			escreva("Valor inválido! Tente novamente")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1764; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */