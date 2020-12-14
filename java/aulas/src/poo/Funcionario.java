package poo;

public class Funcionario {
	
	public String nome;
	public int codigo;
	public double cpf;
	public int anoNascimento;
	public String cargoFuncao;
	public char estadoCivil;
	public char genero;
	
	public Funcionario(String nome, int codigo, double cpf, int anoNascimento, String cargoFuncao, char estadoCivil) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
		this.cargoFuncao = cargoFuncao;
		this.estadoCivil = estadoCivil;
	}
	
	public Funcionario() {
		
	}
	
	//M�TODO ESTADO CIVIL
	public String estado (char estadoCivil) {
		
		String seuEstado = null;
		
		if(estadoCivil == 'D' && genero == 'M') {
			seuEstado = "Divorciado";
			return seuEstado;
		}
		else if(estadoCivil == 'D' && genero == 'F') {
			seuEstado = "Divorciada";
			return seuEstado;
		}
		else if(estadoCivil == 'S' && genero == 'M') {
			seuEstado = "Solteiro";
			return seuEstado;
		}
		else if(estadoCivil == 'S' && genero == 'F') {
			seuEstado = "Solteira";
			return seuEstado;
		}
		else if(estadoCivil == 'V' && genero == 'M') {
			seuEstado = "Vi�vo";
			return seuEstado;
		}
		else if(estadoCivil == 'V' && genero == 'F') {
			seuEstado = "Vi�va";
			return seuEstado;
		}
		else if(estadoCivil == 'C' && genero == 'M') {
			seuEstado = "Casado";
			return seuEstado;
		}
		else if(estadoCivil == 'C' && genero == 'F') {
			seuEstado = "Casada";
			return seuEstado;
		}
		else {
			System.out.println("Valor inv�lido!");
		}
		return seuEstado;
	}
	//FIM M�TODO ESTADO CIVIL
	
	//M�TODO IDADE
	public int suaIdade (int anoNascimento) {
		int idade = 0;
		
		idade = 2020 - anoNascimento;
		return idade;
	}
	//FIM M�TODO IDADE
	
}
