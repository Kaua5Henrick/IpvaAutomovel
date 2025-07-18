package entities;

public class Veiculo {
	protected String modelo;
	protected int ano;
	protected double valor;
	
	public Veiculo (String modelo, int ano, double valor) {
		this.modelo = modelo;
		this.ano = ano;
		this.valor = valor;
		
	}
	
	public double calcularIpva() {
		return valor * 0.04;
	}
	
	public void exibirInformacoes() {
		System.out.print("Modelo:  " + modelo);
		System.out.printf("\tAno: " + ano);
		System.out.printf("\tValor R$: %.2f ", valor );
	}
}
