package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import entidade.ConversorDolar;

public class CompraDolar extends ConversorDolar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o preço do Dolar: ");
		double precoDolar = sc.nextDouble();
		
		System.out.print("Quantos dolares serão comprados: ");
		double qntdolar = sc.nextDouble();
		
		double resultado = ConversorDolar.dollarParaReal(qntdolar, precoDolar);
		
		System.out.printf("Valor a ser pago em reais: R$ %.2f%n", resultado);
		
		sc.close();

	}

}
