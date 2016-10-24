package comandaDigital.model.produto;

/**
 * 
 * Classe ProdutoAlimentar herdar� a classe Produto para compor todos seus atributos
 * 
 * @author w_his
 * 
 */

import java.sql.Date;

public class ProdutoAlimentar extends Produto{
	
	private String codigoProduto;
	private Date dataValidade;
	
	/**
	 * 
	 * M�todo construtor contendo todos os atributos da classe ProdutoAlimentar
	 * 
	 * @param idProduto
	 * @param nome
	 * @param descricao
	 * @param valorBase
	 * @param valorVenda
	 * @param codigoProduto
	 * @param dataValidade
	 */
	public ProdutoAlimentar(int idProduto, String nome, String descricao, double valorBase, double valorVenda, String codigoProduto, Date dataValidade){
		super(idProduto, nome, descricao, valorBase, valorVenda);
		this.codigoProduto = codigoProduto;
		this.dataValidade = dataValidade;
	}
	
	/**
	 * M�todo construtor padr�o da classe ProdutoAlimentar
	 */
	public ProdutoAlimentar(){
		
	}
	
	/**
	 * 
	 * M�todo Getter referente ao atributo codigoProduto
	 * 
	 * @return
	 */
	public String getCodigoProduto() {
		return codigoProduto;
	}
	
	/**
	 * 
	 * M�todo Setter referente ao atributo codigoProduto
	 * 
	 * @param codigoProduto
	 */
	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	
	/**
	 * 
	 * M�todo Getter referente ao atributo dataValidade
	 * 
	 * @return
	 */
	public Date getDataValidade() {
		return dataValidade;
	}
	
	/**
	 * 
	 * M�todo Setter referente ao atributo dataValidade
	 * 
	 * @param dataValidade
	 */
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

}
