package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Conta;

public class ProgramaBanco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Conta conta;
		
		System.out.print("Insira o número da conta: ");
		int numero = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Insira o nome do proprietário: ");
		String nome = sc.nextLine();
		
		System.out.print("Deseja efetuar um depósito inicial (s/n)? ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.print("Insira um valor inicial para depósito: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, depositoInicial);
			
		} else {
			
			conta = new Conta(numero, nome);
			
		}
		
		
		
		System.out.println();
		System.out.println("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Insira um valor para depósito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Insira um valor para saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		
		sc.close();
		

	}

}
