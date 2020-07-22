package entities;

public class ProdutoImportado_129 extends Produto_129 {

	private Double custosImportacao;

	public ProdutoImportado_129() {
		super();
	}

	public ProdutoImportado_129(String nome, Double preco, Double custosImportacao) {
		super(nome, preco);
		this.custosImportacao = custosImportacao;
	}

	public Double precoTotal() {
		return super.getPreco() + custosImportacao;
	}

	@Override
	public String etiquetaPreco() {
		Double precoTotal = super.getPreco() + custosImportacao;
		return super.getNome() + " R$ " + precoTotal + " (Custos importacao: " + String.format("%.2f", custosImportacao)
				+ ")";
	}

}
