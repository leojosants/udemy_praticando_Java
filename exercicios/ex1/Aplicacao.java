package secao8_IntroducaoPoo.exercicios.ex1;

import java.util.Locale;
import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);

		System.out.println("\nEntre com os medidas dos Triângulos");
		System.out.println("Triângulo 'X'");

		System.out.print("Lado A: ");
		double xA = leitor.nextDouble();

		System.out.print("Lado B: ");
		double xB = leitor.nextDouble();

		System.out.print("Lado C: ");
		double xC = leitor.nextDouble();

		Tringulo x = new Tringulo(xA, xB, xC);

		System.out.println("\nTriângulo 'Y'");

		System.out.print("Lado A: ");
		double yA = leitor.nextDouble();

		System.out.print("Lado B: ");
		double yB = leitor.nextDouble();

		System.out.print("Lado C: ");
		double yC = leitor.nextDouble();

		Tringulo y = new Tringulo(yA, yB, yC);

		double areaX = x.calcArea();
		double areaY = x.calcArea();
		
		System.out.print("\nÁrea do Triângulo X: ");
		x.imprimirCalArea();
		
		System.out.print("\nÁrea do Triângulo Y: ");
		y.imprimirCalArea();
		
		maiorArea(areaX, areaY);
		
		leitor.close();

	}
	// - fim main
	
	public static void maiorArea(double areaX, double areaY) {		
		if (areaX > areaY) {
			System.out.println("\nA maior Área é X");
		}
		else {
			System.out.println("\nA maior Área é Y");
		}
	}
	
}
