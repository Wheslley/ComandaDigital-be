package comandaDigital.model.produto;

/**
 * 
 * Classe ProdutoAlimentrar herdará a classe Produto
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
	 * Construtor com todos os atributos da classe ProdutoAlimentar
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
	 * Construtor vazio da classe ProdutoAlimentar
	 */
	public ProdutoAlimentar(){
		
	}
	
	/**
	 * Início dos métodos getters e setters dos atributos
	 */
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
