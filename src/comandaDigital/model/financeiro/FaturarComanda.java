package comandaDigital.model.financeiro;

/**
 * 
 * Classe respons�vel em armazenar todos os produtos faturados e o faturamento total da comanda digital
 * 
 * @author w_his
 * 
 */

import java.util.List;

import comandaDigital.model.produto.ProdutoFaturado;

public class FaturarComanda {
	
	private List<ProdutoFaturado> listaProdutoFaturado;
	
	/**
	 * 
	 * M�todo respons�vel em atualizar o estoque pelo id do produto com a sua respectiva quantidade vendida
	 * 
	 * @param idProduto
	 * @param qtdProduto
	 */
	public void AtualizarEstoque(int idProduto, int qtdProduto){
		
		//C�DIGO
		
	}
	
	/**
	 * M�todo getter e setter da listaProdutoFaturado
	 */
	public List<ProdutoFaturado> getListaProdutoFaturado() {
		return listaProdutoFaturado;
	}

	public void setListaProdutoFaturado(List<ProdutoFaturado> listaProdutoFaturado) {
		this.listaProdutoFaturado = listaProdutoFaturado;
	}
}
