package comandaDigital.model.produto;

/**
 * 
 * @author w_his
 * 
 */

import java.sql.Date;

public class ProdutoAlimentar extends Produto{
	
	private String codigoProduto;
	private Date dataValidade;
	
	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setIdProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	
	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

}