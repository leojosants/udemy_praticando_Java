package secao10.exercicios.ex2;

public class Pensionato {

	private String nome;
	private String email;

	public Pensionato(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return String.format("%s %s", nome, email);
	}

}
