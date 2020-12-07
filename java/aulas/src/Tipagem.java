import java.util.Scanner; //IMPORTAR O IMPORT.JAVA.UTIL.SCANNER PARA LER O TECLADO

public class Tipagem {
	
	public static void main (String[] args) {
		
		//int anoNascimento = 2002;
		//char sexo = 'F';
		//double salario;
		//String nome;
		
		//salario = 1965.60;
		
		//System.out.println("O ano de nascimento é de " + anoNascimento);
		//System.out.println("O salário é de R$ " + salario);
		//SYSOU + CTRL + ESPAÇO = SYSTEM.OUT.PRINTLN
		//PRINTLN JÁ PULA LINHA, JÁ O PRINT NORMAL, NÃO
		
		
		Scanner leia = new Scanner (System.in); //INSTANCIAR/CRIAR UM SCANNER (COMANDO PARA LER DADOS INSERIDOS DO TECLADO DO USUÁRIO
		
		//váriaveis
		String nome;
		int anoNascimento;
		
		System.out.println("Digite o nome do usuário: ");
		nome = leia.next(); //USAR MÉTODO DO TECLADO PARA LER TEXTO EM STRING
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt(); //NEXTINT PARA LER NUMEROS INTEIROS
		System.out.println("Nome: " + nome);
		System.out.println("Idade: "+(2020 - anoNascimento));
		
		leia.close(); //FECHAR/TERMINAR O TECLADO
		
	}
}
