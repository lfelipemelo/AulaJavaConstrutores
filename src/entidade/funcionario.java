package entidade;

public class funcionario {

	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentoSalario(double porcentagem) {
		salarioBruto += salarioBruto * porcentagem/100;
	}
}
