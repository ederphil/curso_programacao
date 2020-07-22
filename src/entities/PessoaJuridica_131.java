package entities;

public class PessoaJuridica_131 extends Pessoa_132 {

	int nroFunc;

	public PessoaJuridica_131(String nome, double rendaAnual, int nroFunc) {
		super(nome, rendaAnual);
		this.nroFunc = nroFunc;
	}

	public int getNroFunc() {
		return nroFunc;
	}

	public void setNroFunc(int nroFunc) {
		this.nroFunc = nroFunc;
	}

	@Override
	public double calculaImposto() {

		int percImposto = nroFunc > 10 ? 14 : 16;

		return super.rendaAnual * percImposto / 100;
	}

}
