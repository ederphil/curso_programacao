package entities;

import entities.enums.Cor;

public class Circulo_131 extends Forma_131 {

	Double raio;

	public Circulo_131(Cor cor, Double radio) {
		super(cor);
		this.raio = radio;
	}

	public Double getRadio() {
		return raio;
	}

	public void setRadio(Double radio) {
		this.raio = radio;
	}

	@Override
	public Double area() {
		return Math.PI * raio * raio;
	}
	
}
