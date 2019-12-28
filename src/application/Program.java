package application;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Dados;
import entities.PessoaFisica;
import entities.PessoaJuridica;


public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos usuários serão cadastrados?  ");
		int pessoaCadastrada = sc.nextInt();
		
		List<Dados> list = new ArrayList<>();
		
		for (int i = 1; i <= pessoaCadastrada; i++) {
			System.out.print("Nome : ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			System.out.println("Pessoa Física ou Jurísica  (1 - Física / 2 - Jurídica )? ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("Gasto com saúde : ");
				double gastoComSaude = sc.nextDouble();
				Dados usuario1 = new PessoaFisica(nome, rendaAnual, gastoComSaude);
				list.add(usuario1);
			}
			else {
				System.out.println("Quantos funcionários : ");
				int numeroFuncionarios = sc.nextInt();
				Dados usuario1 = new PessoaJuridica(nome, rendaAnual, numeroFuncionarios);
				list.add(usuario1);
			}
			
			System.out.println("============================================================");
			
			
		}

		double sum = 0.0;
		for (Dados usuario1 : list) {
			System.out.println("Nome : " + usuario1.getNome());
			System.out.println("Renda anual : R$ " + String.format("%.2f", usuario1.getRendaAnual()));
			System.out.println("Imposto devido : R$ " + String.format("%.2f", usuario1.imposto()));
			System.out.println("============================================================");
			sum += usuario1.imposto();

		}
		
		
		System.out.println("============================================================");
		System.out.println("Total de imposto recolhido pela União : R$ " + String.format("%.2f", sum));
	}
}
