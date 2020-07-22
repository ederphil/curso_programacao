package entities;

import entities.enums.Cor;

public class Retangulo_131 extends Forma_131 {

	private Double altura;
	private Double largura;

	public Retangulo_131(Cor cor, Double altura, Double largura) {
		super(cor);
		this.altura = altura;
		this.largura = largura;
	}

	@Override
	public Double area() {
		return altura * largura;
	}

}
