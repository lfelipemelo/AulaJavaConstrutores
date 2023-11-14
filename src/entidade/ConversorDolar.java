package entidade;

public class ConversorDolar {

	
	public static double dollarParaReal(double qntdolar, double precoDolar) {
		return qntdolar * precoDolar * (1.06); 
	}
}
