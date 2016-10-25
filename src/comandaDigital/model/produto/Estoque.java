package comandaDigital.model.produto;

/**
 * 
 * Classe estoque será utilizada para 
 * 
 * @author whesl
 *
 */

public class Estoque {
	
	private Integer idProduto;
	private Integer quantidadeProduto;
	
	/**
	 * 
	 * Método construtor contendo todos os atributos da classe Estoque
	 * 
	 * @param idProduto
	 * @param quantidadeProduto
	 */
	public Estoque(Integer idProduto, Integer quantidadeProduto) {
		this.idProduto = idProduto;
		this.quantidadeProduto = quantidadeProduto;
	}
	
	/**
	 * Método construtor padrão da classe Estoque
	 */
	public Estoque(){
		
	}

	/**
	 * 
	 * Método Getter referente ao atributo idProduto
	 * 
	 * @return
	 */
	public Integer getIdProduto() {
		return idProduto;
	}
	
	/**
	 * 
	 * Método Setter referente ao atributo idProduto
	 * 
	 * @param idProduto
	 */
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	
	/**
	 * 
	 * Método Getter referente ao atributo quantidadeProduto
	 * 
	 * @return
	 */
	public Integer getQuantidadeProduto() {
		return quantidadeProduto;
	}
	
	/**
	 * 
	 * Método Setter referente ao atributo quantidadeProduto
	 * 
	 * @param quantidadeProduto
	 */
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
}
