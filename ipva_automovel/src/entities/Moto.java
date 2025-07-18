package entities;

public class Moto extends Veiculo {
	protected int cilindradas;
	
	
	public Moto (String modelo, int ano, double valor, int cilindradas) {
		super(modelo, ano, valor);
		this.cilindradas = cilindradas;
	}
	
	@Override
	public double calcularIpva() {
		return super.valor * 0.02;
	}
	
	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.print("\tCilindradas: " + cilindradas);
	}
	
}
