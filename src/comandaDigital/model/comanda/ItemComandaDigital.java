package comandaDigital.model.comanda;

import comandaDigital.model.produto.Produto;

/**
 * 
 * Classe responsável por preparar um determinado produto para ser inserido na Comanda Digital
 * 
 * @author whesl
 *
 */
public class ItemComandaDigital {

	private int idItemComandaDigital;
	private Produto produto;
	private int quantidadeProduto;
	private Double valorTodosProutos;

	/**
	 * Início dos métodos getters e setters dos atributos da classe
	 */
	public int getIdItemComandaDigital() {
		return idItemComandaDigital;
	}

	public void setIdItemComandaDigital(int idItemComandaDigital) {
		this.idItemComandaDigital = idItemComandaDigital;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	public Double getValorTodosProutos() {
		return valorTodosProutos;
	}

	public void setValorTodosProutos(Double valorTodosProutos) {
		this.valorTodosProutos = valorTodosProutos;
	}

}
