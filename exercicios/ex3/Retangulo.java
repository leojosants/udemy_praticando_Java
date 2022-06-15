package secao8_IntroducaoPoo.exercicios.ex3;

public class Retangulo {

	private double largura;
	private double altura;

	public Retangulo(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}

	private double getLargura() {
		return largura;
	}

	private void setLargura(double largura) {
		this.largura = largura;
	}

	private double getAltura() {
		return altura;
	}

	private void setAltura(double altura) {
		this.altura = altura;
	}

	public double calcularArea() {
		double area = 0.0;
		area = this.altura * this.largura;
		return area;
	}

	public double calcularPerimetro() {
		double perimetro = 0.0;
		perimetro = (this.largura * 2) + (this.altura * 2);
		return perimetro;
	}

	public double calcularDiagonal() {
		double diagonal = 0.0;
		diagonal = Math.sqrt((this.largura * this.largura) + (this.altura * this.altura));
		return diagonal;
	}

}
