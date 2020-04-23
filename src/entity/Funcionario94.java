package entity;

public class Funcionario94 {

	private int id;
	private String nome;
	private Double salario;

	public Funcionario94(int id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void addSalario(int percentual) {
		salario += salario * percentual / 100;
	}

	public String toString() {
		return nome + ", R$ " + String.format("%.2f", salario);
	}

}
