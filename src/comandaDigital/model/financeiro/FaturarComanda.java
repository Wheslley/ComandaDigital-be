package comandaDigital.model.financeiro;

/**
 * 
 * @author w_his
 * 
 */

import java.util.List;

import comandaDigital.model.produto.ProdutoFaturado;

public class FaturarComanda {
	
	private List<ProdutoFaturado> listaProdutoFaturado;
	
	public List<ProdutoFaturado> getListaProdutoFaturado() {
		return listaProdutoFaturado;
	}

	public void setListaProdutoFaturado(List<ProdutoFaturado> listaProdutoFaturado) {
		this.listaProdutoFaturado = listaProdutoFaturado;
	}
	
	public void AtualizarEstoque(int idProduto, int qtdProduto){
		
		//CÓDIGO
		
	}

}
