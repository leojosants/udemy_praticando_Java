package secao13_Enumeracoes_composicao.Composicao.Exercicio1.Aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import secao13_Enumeracoes_composicao.Composicao.Exercicio1.Entidades.ContratoPorHora;
import secao13_Enumeracoes_composicao.Composicao.Exercicio1.Entidades.Departamento;
import secao13_Enumeracoes_composicao.Composicao.Exercicio1.Entidades.Trabalhador;
import secao13_Enumeracoes_composicao.Composicao.Exercicio1.Entidades.Enum.NivelDoTrabalhador;

public class App {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner leitor = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("\nEntre com o nome do Departamento: ");
		String nomeDoDepartamento = leitor.next();
				
		System.out.println("\nEntre com os dados do Trabalhador:");
		
		System.out.print("Nome: ");
		leitor.next();
		String nomeDoTrabalhador = leitor.nextLine();
		
		System.out.print("Nível: ");
		String nivel = leitor.nextLine();
		
		System.out.print("Salário Base: R$ ");
		double salarioBase = leitor.nextDouble();
				
		Trabalhador trabalhador = new Trabalhador(nomeDoTrabalhador, NivelDoTrabalhador.valueOf(nivel), salarioBase, new Departamento(nomeDoDepartamento));

		System.out.print("Quantos contratos terá esse Trabalhador? ");
		int numeroDeContratos = leitor.nextInt();
		System.out.println();
		
		for (int i = 0; i < numeroDeContratos; i++) {
			System.out.printf("Entre com os dados do # %dº contrato: %n", (i + 1));
			
			System.out.print("Data: (DD/MM/YYYY): ");
			Date data = sdf.parse(leitor.next());
			
			System.out.print("Valor por hora: R$ ");
			double valorPorHora = leitor.nextDouble();
			
			System.out.print("Duração por horas: ");
			int horas = leitor.nextInt();
			
			ContratoPorHora cph = new ContratoPorHora(data, valorPorHora, horas);
			
			trabalhador.adicionarContrato(cph);
			System.out.println();
			
		}
		
		System.out.print("Entre com o mes e ano para calcular o salário (MM/YYYY): ");
		String mesEAno = leitor.next();
		
		int mes = Integer.parseInt(mesEAno.substring(0, 2));
		int ano = Integer.parseInt(mesEAno.substring(3));
		
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Renda para " + mesEAno + String.format("R$: %.2f%n", trabalhador.renda(ano, mes)));
		
		
		leitor.close();
		
	}

}
