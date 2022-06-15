package secao9.exercicios.ex1;

public class ContaBancaria {

	private int numero;
	private String nomeTitular;
	private double saldo;

	public ContaBancaria(int numero, String nomeTitular, double saldo) {
		this.numero = numero;
		this.nomeTitular = nomeTitular;
		this.saldo = saldo;
	}

	public ContaBancaria(int numero, String nomeTitular) {
		this.numero = numero;
		this.nomeTitular = nomeTitular;
	}

	private int getNumero() {
		return numero;
	}

	private void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void sacar(double valorsaque) {
		this.saldo -= valorsaque + 5.00;
	}

	public void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}

	public void mostrarDados() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return String.format("\nDados da Conta: " + "\nNúmero: %d | Titular: %s |  Saldo: R$ %.2f%n", numero,
				nomeTitular, saldo);
	}

}
