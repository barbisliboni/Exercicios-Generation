package poo.collections;

public class EstoqueLoja {

		private String nome;
		private double preco;
		
		
		public EstoqueLoja(String nome, double preco) {
			this.nome = nome;
			this.preco = preco;
		}
		
		public EstoqueLoja(String nome) {
			this.nome = nome;
		}
		
		


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public double getPreço() {
			return preco;
		}


		public void setPreço(double preço) {
			this.preco = preço;
		}
		
		
}
