import java.util.Scanner; //IMPORTAR O IMPORT.JAVA.UTIL.SCANNER PARA LER O TECLADO

public class Tipagem {
	
	public static void main (String[] args) {
		
		//int anoNascimento = 2002;
		//char sexo = 'F';
		//double salario;
		//String nome;
		
		//salario = 1965.60;
		
		//System.out.println("O ano de nascimento � de " + anoNascimento);
		//System.out.println("O sal�rio � de R$ " + salario);
		//SYSOU + CTRL + ESPA�O = SYSTEM.OUT.PRINTLN
		//PRINTLN J� PULA LINHA, J� O PRINT NORMAL, N�O
		
		
		Scanner leia = new Scanner (System.in); //INSTANCIAR/CRIAR UM SCANNER (COMANDO PARA LER DADOS INSERIDOS DO TECLADO DO USU�RIO
		
		//v�riaveis
		String nome;
		int anoNascimento;
		
		System.out.println("Digite o nome do usu�rio: ");
		nome = leia.next(); //USAR M�TODO DO TECLADO PARA LER TEXTO EM STRING
		System.out.println("Digite o ano de nascimento: ");
		anoNascimento = leia.nextInt(); //NEXTINT PARA LER NUMEROS INTEIROS
		System.out.println("Nome: " + nome);
		System.out.println("Idade: "+(2020 - anoNascimento));
		
		leia.close(); //FECHAR/TERMINAR O TECLADO
		
	}
}
