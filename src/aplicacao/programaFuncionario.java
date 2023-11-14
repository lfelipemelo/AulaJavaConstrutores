package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.funcionario;


public class programaFuncionario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		funcionario func = new funcionario();
		
		System.out.print("Nome: ");
		func.nome = sc.nextLine();
		
		System.out.print("Salário Bruto: ");
		func.salarioBruto = sc.nextDouble();
		
		System.out.print("Imposto: ");
		func.imposto = sc.nextDouble();
		
		System.out.printf("Funcionário: %s, R$ %.2f%n", func.nome, func.salarioLiquido());
		System.out.print("Qual a porcentagem para aumentar o salário? ");
		double porcentagem = sc.nextDouble();
		func.aumentoSalario(porcentagem);
		
		System.out.printf("Dados atualizados: %s, R$ %.2f%n", func.nome, func.salarioLiquido());
		
		
		sc.close();

	}

}
