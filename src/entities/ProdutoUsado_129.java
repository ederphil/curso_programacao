package entities;

import java.util.Date;

public class ProdutoUsado_129 extends Produto_129 {

	
	
	private Date dataManutencao;

	public ProdutoUsado_129() {
		super();
	}

	public ProdutoUsado_129(String nome, Double preco, Date dataManutencao) {
		super(nome, preco);
		this.dataManutencao = dataManutencao;
	}

	public Date getDataManutencao() {
		return dataManutencao;
	}

	public void setDataManutencao(Date dataManutencao) {
		this.dataManutencao = dataManutencao;
	}

	@Override
	public String etiquetaPreco() {
		return super.getNome() + " (usado) R$ " + String.format("%.2f", super.getPreco()) + " (Data da manutenção: "
				+ util.FormataData.padrao().format(dataManutencao) + ")";
	}
}
