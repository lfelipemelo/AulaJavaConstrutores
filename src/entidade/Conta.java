package entidade;

public class Conta {
	
	private int numero;
	private String proprietario;
	private double saldo;
	
	public Conta(int numero, String proprietario) {
		this.numero = numero;
		this.proprietario = proprietario;
	}

	public Conta(int numero, String proprietario, double saldo) {
		this.numero = numero;
		this.proprietario = proprietario;
		this.saldo = saldo;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposito(double valor) {
		saldo += valor;
	}
	
	public void saque(double valor) {
		saldo -= (valor + 5.0);
	}
	
	public String toString() {
		return "Conta: " + numero + ", Proprietário: " + proprietario + ", Saldo: R$ " + String.format("%.2f", saldo);
	}
	

}
