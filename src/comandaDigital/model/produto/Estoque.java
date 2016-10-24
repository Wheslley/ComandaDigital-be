package comandaDigital.model.produto;

/**
 * 
 * @author whesl
 *
 */

public class Estoque {
	
	private Integer idProduto;
	private Integer quantidadeProduto;
	
	public Estoque(Integer idProduto, Integer quantidadeProduto) {
		this.idProduto = idProduto;
		this.quantidadeProduto = quantidadeProduto;
	}
	
	public Estoque(){
		
	}

	public Integer getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public Integer getQuantidadeProduto() {
		return quantidadeProduto;
	}
	public void setQuantidadeProduto(int quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}
	
}
