programa
{
	
	funcao inicio()
	{
		 
		real alturaRetangulo, baseRetangulo, areaRetangulo, areaCirculo, baseTriangulo, raio, areaTriangulo, alturaTriangulo
		caracter tipo 

		escreva("1 - Circulo");
		escreva("\n2 - Triângulo");
		escreva("\n3 - Retângulo");
		escreva("\nEscolha uma das opções acima: ");
		leia(tipo);
		limpa()
		

			escolha(tipo){
				caso '1':
					escreva("Insira o raio do Circulo: ")
					leia(raio)
				
					se(raio > 0){
						escreva("A área do circulo é de ",circuloCalculo(raio))
					}
					senao{
						escreva("Insira um número maior que 0")
					}
					pare
			

				
				caso '2':
					escreva("Insira o a altura do triângulo: ")
					leia(alturaTriangulo)

					escreva("Insira a base do triângulo: ")
					leia(baseTriangulo)
				
					se(baseTriangulo > 0 ou alturaTriangulo > 0){
						escreva("A área do triângulo é de ",trianguloCalculo(alturaTriangulo, baseTriangulo))
					}
					senao{
						escreva("Insira um número maior que 0")
						
					
					}
					pare
					

				caso '3':
					escreva("Insira o a altura do retângulo: ")
					leia(alturaRetangulo)

					escreva("Insira a base do retângulo: ")
					leia(baseRetangulo)
					limpa()

					se(baseRetangulo > 0 ou alturaRetangulo > 0){
						escreva("A área do retângulo é de ",retanguloCalculo(alturaRetangulo, baseRetangulo))
					}
					senao{
						escreva("Insira um número maior que 0")
						
					}	
					pare 
		}
	}

	funcao real retanguloCalculo(real baseRetangulo, real alturaRetangulo){

		real areaRetangulo 
		
		areaRetangulo = baseRetangulo * alturaRetangulo
		retorne areaRetangulo	
		}


	funcao real trianguloCalculo(real baseTriangulo, real alturaTriangulo){

		real areaTriangulo 
		
		areaTriangulo = (baseTriangulo * alturaTriangulo)/2
		retorne areaTriangulo	
		}


	funcao real circuloCalculo(real raio){

		real areaCirculo
		
		areaCirculo =  3.14*(raio*raio)
		retorne areaCirculo	
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 430; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */