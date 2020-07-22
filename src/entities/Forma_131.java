package entities;

import entities.enums.Cor;

public abstract class Forma_131 {

	private Cor cor;

	public Forma_131(Cor cor) {
		super();
		this.cor = cor;
	}

	public abstract Double area();

	public Cor getCor() {
		return cor;
	}

	public void setCor(Cor cor) {
		this.cor = cor;
	}

}
