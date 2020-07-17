package entities;

public class Funcionario_128_terceiro extends Funcionario_128 {

	private Double adicional;

	public Funcionario_128_terceiro(String nome, Integer horas, Double valorHora, Double adicional) {
		super(nome, horas, valorHora);
		this.setAdicional(adicional);
	}

	public Funcionario_128_terceiro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Double getAdicional() {
		return adicional;
	}

	public void setAdicional(Double adicional) {
		this.adicional = adicional;
	}
	
	@Override
	public Double pagamento() {
		return super.pagamento() + adicional * 1.1;
	}
	
}
