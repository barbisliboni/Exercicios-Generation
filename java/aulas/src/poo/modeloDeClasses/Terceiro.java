package poo.modeloDeClasses;

public class Terceiro extends Funcionario {

		private double valorTerceiro;

		public double getValorTerceiro() {
			return valorTerceiro;
		}

		public void setValorTerceiro(double valorTerceiro) {
			this.valorTerceiro = valorTerceiro;
		}
		
		public Terceiro(String nome, int horasMensais, double valorHora, double valorTerceiro) {
			super(nome, horasMensais, valorHora);
			this.valorTerceiro = valorTerceiro;
		}
		
		@Override
		public double pagamentoSalario(double horasMensais) {
			double salario = horasMensais * getValorHora() + valorTerceiro;
			return salario;
		}
}
