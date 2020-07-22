package entities;

public class Produto_129 {

	private String nome;
	private Double preco;

	public Produto_129(String nome, Double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}

	public Produto_129() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String etiquetaPreco() {
		return nome + " R$ " + String.format("%.2f", preco);
	}

}
