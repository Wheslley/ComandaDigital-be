package comandaDigital.model.produto;

/**
 * 
 * Classe estoque ser� utilizada para 
 * 
 * @author whesl
 *
 */

public class Estoque {
	
	private Integer idProduto;
	private Integer quantidadeProduto;
	
	/**
	 * 
	 * M�todo construtor contendo todos os atributos da classe Estoque
	 * 
	 * @param idProduto
	 * @param quantidadeProduto
	 */
	public Estoque(Integer idProduto, Integer quantidadeProduto) {
		this.idProduto = idProduto;
		this.quantidadeProduto = quantidadeProduto;
	}
	
	/**
	 * M�todo construtor padr�o da classe Estoque
	 */
	public Estoque(){
		
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo idProduto
	 * 
	 * @return
	 */
	public Integer getIdProduto() {
		return idProduto;
	}
	
	/**
	 * 
	 * M�todo Setter referente ao atributo idProduto
	 * 
	 * @param idProduto
	 */
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	
	/**
	 * 
	 * M�todo Getter referente ao atributo quantidadeProduto
	 * 
	 * @return
	 */
	public Integer getQuantidadeProduto() {
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
	
}
