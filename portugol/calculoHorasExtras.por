programa
{
	
	funcao inicio()
	{
		cadeia C;
		inteiro N = 0.0, E = 0.0
		real salarioTotal = 0.0, salarioExcedente = 0.0

		const real VALORHORANORMAL = 10.00;
		const real VALORHORAEXCEDENTE = 20.00;
		const inteiro LIMITEHORAS = 50;

		escreva("Digite o seu código de funcionário: ");
		leia(C);

		escreva("Digite a quantidade de horas trabalhadas: ");
		leia(N);
		limpa();

		se(N <= LIMITEHORAS){ //calculo do salario total até 50h
			salarioTotal = (N*VALORHORANORMAL) //calculo da hora normal
		}
		senao{
			E = (N- LIMITEHORAS); //calculo da hora extra
			salarioTotal = (LIMITEHORAS*VALORHORANORMAL) //calculo do salário base
			salarioExcedente = E*VALORHORAEXCEDENTE; //calculo do salário extra
			salarioTotal = salarioTotal + salarioExcedente; //soma dos dois salários
			
		}

		escreva("\nQuantidade de horas trabalhadas: ", N);
		escreva("\nQuantiadade de horas excedentes: ", E);
		escreva("\nSalário excedente: R$ ", salarioExcedente);
		escreva("\nSalário total: R$ ", salarioTotal);

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 735; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */