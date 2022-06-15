package secao8_IntroducaoPoo.exercicios.ex1;

public class Tringulo {

	private double ladoA;
	private double ladoB;
	private double ladoC;
	
	public Tringulo(double ladoA, double ladoB, double ladoC) {
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}
	
	public double calcArea() {
		double p = (this.ladoA + this.ladoB + this.ladoC) / 2;
		double area = Math.sqrt(p * (p - this.ladoA) * (p - this.ladoB) * (p - this.ladoC));
		return area;
	}
	
	public void imprimirCalArea() {
		System.out.printf("%.2fcm³", calcArea());
	}
	
}
