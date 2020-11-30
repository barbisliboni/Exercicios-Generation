programa
{
	
	funcao inicio()
	{
		inteiro idade, infantilA, infantilB, juvenilA, juvenilB, adultos

		escreva("Insira sua idade: ");
		leia(idade);

		se(idade >= 5 e idade <= 7){
			escreva("Você está na categoria Infantil A!");
		}
		senao se(idade >= 8 e idade <= 11){
			escreva("Você está na categoria Infantil B!");
		}
		senao se(idade >= 12 e idade <= 13){
			escreva("Você está na categoria Juvenil A!");
		}
		senao se(idade >=14 e idade <= 17){
			escreva("Você está na categoria Juvenil B!");
		}
		senao  se(idade  >= 0 e idade  <= 4){
			escreva  ("Valor inválido e/ou você ainda não pode fazer natação!")	
		}
		senao{
			escreva("Você está na categoria de Adultos!");
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 693; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */