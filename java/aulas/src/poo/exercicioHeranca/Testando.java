package poo.exercicioHeranca;

public class Testando {

	public static void main(String[] args) {
		
		Fornecedor barbara = new Fornecedor("Bárbara", "Rua Alfenas", 12345678, 111, 150);
		Empregado glauber = new Empregado("Glauber", "Rua Alfenas", 123456785, 222, 5000, 10);
		Operario thiago = new Operario ("Thiago", "Rua Dalmácia", 12345697, 3000, 500);
		Administrador giovanni = new Administrador ("Giovanni", "Rua Dalmácia", 12345654, 600);
		Vendedor arthur = new Vendedor("Arthur", "Rua Alameda", 12345696, 2500, 500);
		
		barbara.setNome("Bárbara");
		barbara.setValorCredito(500);
		barbara.setValorDivida(350);
		
		System.out.println(barbara.getNome() + " R$ " + barbara.obterSaldo(barbara.getValorCredito()));
		
		glauber.setNome("Glauber");
		glauber.setSalarioBase(5000);
		glauber.setImposto(10);
		
		System.out.println(glauber.getNome() + " R$ " + glauber.calcularSalario(glauber.getSalarioBase()));
		
		thiago.setNome("Thiago");
		thiago.setValorProducao(3500);
		thiago.setComissao(6000);
		
		System.out.println(thiago.getNome() + " R$ " + thiago.getValorProducao() + " R$ " + thiago.getComissao()) ;
		
		giovanni.setNome("Giovanni");
		giovanni.setAjudaDeCusto(250);
		
		System.out.println(giovanni.getNome() + " R$ " + giovanni.getAjudaDeCusto());
		
		arthur.setNome("Arthur");
		arthur.setValorVendas(6500);
		arthur.setAtributoComissao(200);
		
		System.out.println(arthur.getNome() + " R$ " + arthur.getValorVendas() + " R$ " + arthur.getAtributoComissao());

	}

}
