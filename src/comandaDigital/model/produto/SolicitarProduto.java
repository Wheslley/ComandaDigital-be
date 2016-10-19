package comandaDigital.model.produto;

/**
 * 
 * @author w_his
 * 
 */

import java.util.List;

public class SolicitarProduto {
	
	private int idSolicitarProduto;
	List<Produto> listProduto;
	
	public int getIdSolicitarProduto() {
		return idSolicitarProduto;
	}

	public void setIdSolicitarProduto(int idSolicitarProduto) {
		this.idSolicitarProduto = idSolicitarProduto;
	}

	public List<Produto> getListProduto() {
		return listProduto;
	}

	public void setListProduto(List<Produto> listProduto) {
		this.listProduto = listProduto;
	}

}
