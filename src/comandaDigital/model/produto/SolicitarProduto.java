package comandaDigital.model.produto;

/**
 * 
 * Classe reponsável por armazenar todos os produtos solicitados pelo cliente
 * 
 * @author w_his
 * 
 */

import java.util.List;

public class SolicitarProduto {
	
	private List<Produto> listProduto;
	
	/**
	 * 
	 * Metodo que irá receber o ID do Produto solicitado e armazenará na Lista de produtos
	 * 
	 * @param idProduto
	 */
	public void SolicitarProdutos(int idProduto){
		
	}
	
	/**
	 * Metodo getter e setter da listProduto
	 */
	public List<Produto> getListProduto() {
		return listProduto;
	}

	public void setListProduto(List<Produto> listProduto) {
		this.listProduto = listProduto;
	}

}
