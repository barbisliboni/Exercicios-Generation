programa
{
	
	funcao inicio()
	{
		inteiro peso = 0
		real altura, imc = 0.0

		escreva("Insira seu peso: ");
		leia(peso)
		escreva("\nInsira sua altura (utilize ponto em vez de virgula: ");
		leia(altura)
		limpa()

		imc = peso / (altura * altura)
		
		se(imc < 18.5){
		    escreva("Você está abaixo do peso!")
		}
		senao se(imc >= 18.5 e imc <= 24.9){
		    escreva("Você está no seu peso ideal!")
		}
		senao se(imc >= 25 e imc <= 29.9){
		    escreva("Você está sobrepeso!")
		}
		senao se(imc >= 30 e imc <= 34.9){
		    escreva("Você está com obesidade grau I")
		}
		senao se(imc >= 35 e imc <= 39.9){
		    escreva("Você está com obesidade grau II")
		}
		senao{
		    escreva("Você está com obesidade mórbida")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 318; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */