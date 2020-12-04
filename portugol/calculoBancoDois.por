
programa
{

    funcao inicio()
    {

        //variaveis
        const inteiro TAMANHO = 10
        real vetor[TAMANHO], emprestimoEmpresa=1000.00, credito=0.0, debito=0.0
        real total=0.0, totalGasto = 0.0
        inteiro = x
        caracter acesso, simNao

            linha()
            escreva("\n  SEJA BEM VINDO AO BANCO G8\n")
            linha()
            escreva("\nO número da conta é: 01")
            escreva("\nSeu saldo atual: 0.00 R$")
            escreva("\nO seu CPF é: 444555666-88" )
            escreva("\nO emprestimo da empresa é de: ",emprestimoEmpresa)
            escreva("\n")
            

            para(x=0;x<TAMANHO;x++){
            	escreva("\nDeseja continuar?")
            	escreva("\nDigite [S] para SIM")
            	escreva("\nDigite [N] para NÃO")
            	escreva("\nDigite a letra desejada: ")
            	leia(acesso)

            	se(acesso == 'S' ou acesso == 's'){
            		escreva("\nDigite o credito do dia ",x+1,": ")
            		leia(credito)
            		escreva("Digite o débito do dia ",x+1,": ")
            		leia(debito)
            		total = credito + debito 
            		emprestimoEmpresa -= total
            		escreva("O total do dia ",x+1," foi: R$ ", total, "\nSeu limite é de R$ ",emprestimoEmpresa)
            		escreva("\n")

            		se(emprestimoEmpresa < 0){
            			escreva("Deseja usar seu limite? [S] [N] ");
            			leia(simNao)
            			se(simNao == 'S' ou simNao == 's'){
            				emprestimoEmpresa -= total
            				escreva("Você está utilizando um limite de R$1000")
            				pare 
            			}
            			senao se(simNao == 'N' ou simNao == 'n'){
            				escreva("Volte sempre!")
            				pare
            			}
            		}
            	}
            	senao se(acesso == 'N' ou acesso == 'n'){
            		escreva("\nMuito obrigada e volte sempre!")
            		pare
            	}
            }
    }

    funcao linha()
    {
        escreva("===============================")
    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2011; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */