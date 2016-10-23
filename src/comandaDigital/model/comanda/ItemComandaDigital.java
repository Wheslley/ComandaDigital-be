package comandaDigital.model.comanda;

import comandaDigital.model.produto.Produto;

/**
 * 
 * Classe ser� respons�vel em gerar um objeto do tipo ItemComandaDigital com todos os atributos necess�rios
 * para ser inseridos na ComandaDigital
 * 
 * @author whesl
 *
 */
public class ItemComandaDigital {

	private int idItemComandaDigital;
	private Produto produto;
	private int quantidadeProduto;
	private double valorTodosProutos;
	
	/**
	 * 
	 * M�todo construtor contendo todos os atributos da classe ItemComandaDigital
	 * 
	 * @param idItemComandaDigital
	 * @param produto
	 * @param quantidadeProduto
	 * @param valorTodosProutos
	 */
	public ItemComandaDigital(int idItemComandaDigital, Produto produto, int quantidadeProduto, double valorTodosProutos){
		this.idItemComandaDigital = idItemComandaDigital;
		this.produto = produto;
		this.quantidadeProduto = quantidadeProduto;
		this.valorTodosProutos = valorTodosProutos;
	}
	
	/**
	 * M�todo construtor padr�o da classe ItemComandaDigital
	 */
	public ItemComandaDigital(){
		
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo idItemComandaDigital
	 * 
	 * @return
	 */
	public int getIdItemComandaDigital() {
		return idItemComandaDigital;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo idItemComandaDigital
	 * 
	 * @param idItemComandaDigital
	 */
	public void setIdItemComandaDigital(int idItemComandaDigital) {
		this.idItemComandaDigital = idItemComandaDigital;
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo produto
	 * 
	 * @return
	 */
	public Produto getProduto() {
		return produto;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo produto
	 * 
	 * @param produto
	 */
	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo quantidadeProduto
	 * 
	 * @return
	 */
	public int getQuantidadeProduto() {
		return quantidadeProduto;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo quantidadeProduto
	 * 
	 * @param quantidadeProduto
	 */
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo valorTodosProutos
	 * 
	 * @return
	 */
	public double getValorTodosProutos() {
		return valorTodosProutos;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo valorTodosProutos
	 * 
	 * @param valorTodosProutos
	 */
	public void setValorTodosProutos(double valorTodosProutos) {
		this.valorTodosProutos = valorTodosProutos;
	}

}
