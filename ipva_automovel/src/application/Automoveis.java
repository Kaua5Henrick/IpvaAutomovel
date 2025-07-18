package application;


import entities.Carro;
import entities.Moto;

public class Automoveis {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("Cobalt", 2025, 55000.0, 4);
		Moto m1 = new Moto("XRE", 2025, 30000.0, 300);
		
		c1.exibirInformacoes();
		System.out.printf("\tIPVA: R$ %.2f%n", c1.calcularIpva());
		
		m1.exibirInformacoes();
		System.out.printf("\tIPVA: R$ %.2f%n", m1.calcularIpva());
		
	}

}
