package poo.modeloDeClasses;

public class TesteSalario {

	public static void main(String[] args) {
		
		Funcionario fun1 = new Funcionario("B�rbara", 5, 15);
		Terceiro fun2 = new Terceiro("Thiago", 5, 15, 10.25);
		
		System.out.println("Sal�rio da funcion�ria " + fun1.getNome() + ": R$ " + fun1.pagamentoSalario(5));
		System.out.println("Sal�rio do funcion�rio " + fun2.getNome() + ": R$ " + fun2.pagamentoSalario(5));
		
	}

}
