package entities;

public class Funcionario_128 {

	private String nome;
	private Integer horas;
	private Double valorHora;

	public Funcionario_128() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario_128(String nome, Integer horas, Double valorHora) {
		super();
		this.nome = nome;
		this.horas = horas;
		this.valorHora = valorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorHora() {
		return valorHora;
	}

	public void setValorHora(Double valorHora) {
		this.valorHora = valorHora;
	}

	public Double pagamento() {
		return valorHora * horas;
	}

}
