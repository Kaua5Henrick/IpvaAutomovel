package entities;

public class Carro extends Veiculo{
	protected int numeroPortas;
	
	public Carro(String modelo, int ano, double valor, int numeroPortas) {
		super(modelo, ano, valor);
		this.numeroPortas = numeroPortas;
	}
	
	@Override
	public double calcularIpva() {
		return super.calcularIpva();
	}
	
	@Override
	public void exibirInformacoes() {
		super.exibirInformacoes();
		System.out.println("\tNumero de portas: " + numeroPortas);
	}
	
	
}