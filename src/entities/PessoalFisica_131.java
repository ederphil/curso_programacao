package entities;

public class PessoalFisica_131 extends Pessoa_132 {

	double gastosSaude;

	public PessoalFisica_131(String nome, double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calculaImposto() {
		double percImp = super.rendaAnual < 20000 ? 15 : 25;
		return (super.rendaAnual * percImp / 100) - (gastosSaude > 0 ? (gastosSaude * 50 / 100) : 0);
	};

}
