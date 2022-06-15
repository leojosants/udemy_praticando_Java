package secao8_IntroducaoPoo.exercicios.ex4;

public class Empregado {

	private String nome;
	private double SalarioBruto;
	private double imposto;

	public Empregado(String nome, double salarioBruto, double imposto) {
		this.nome = nome;
		SalarioBruto = salarioBruto;
		this.imposto = imposto;
	}

	public String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return SalarioBruto;
	}

	private void setSalarioBruto(double salarioBruto) {
		SalarioBruto = salarioBruto;
	}

	private double getImposto() {
		return imposto;
	}

	private void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public void aumentarSalario(double percentual) {
		this.SalarioBruto += (this.SalarioBruto / 100 * percentual) - this.imposto;
	}

	public double calcularSalarioLiquido() {
		double salarioLiquido = 0.0;
		salarioLiquido = this.SalarioBruto - this.imposto;
		return salarioLiquido;
	}

}
