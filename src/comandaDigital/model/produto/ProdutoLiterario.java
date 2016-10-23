package comandaDigital.model.produto;

/**
 * 
 * Classe ProdutoLiterario herdará a classe Produto para compor todos seus atributos
 * 
 * @author w_his
 *
 */

public class ProdutoLiterario extends Produto{
	
	private String codigoProduto;
	private String autor;
	private int edicao;
	private int numeroPaginas;
	
	/**
	 * 
	 * Método construtor contendo todos os atributos da classe ProdutoLiterario
	 * 
	 * @param idProduto
	 * @param nome
	 * @param descricao
	 * @param valorBase
	 * @param valorVenda
	 * @param codigoProduto
	 * @param autor
	 * @param edicao
	 * @param numeroPaginas
	 */
	public ProdutoLiterario(int idProduto, String nome, String descricao, double valorBase, double valorVenda, String codigoProduto, String autor, int edicao, int numeroPaginas){
		super(idProduto, nome, descricao, valorBase, valorVenda);
		this.codigoProduto = codigoProduto;
		this.autor = autor;
		this.edicao = edicao;
		this.numeroPaginas = numeroPaginas;
	}
	
	/**
	 * Método construtor padrão da classe ProdutoLiterario
	 */
	public ProdutoLiterario(){
		
	}
	
	/**
	 * 
	 * Método Getter referente ao atributo codigoProduto
	 * 
	 * @return
	 */
	public String getCodigoProduto() {
		return codigoProduto;
	}
	
	/**
	 * 
	 * Método Setter referente ao atributo codigoProduto
	 * 
	 * @param codigoProduto
	 */
	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	
	/**
	 * 
	 * Método Getter referente ao atributo autor
	 * 
	 * @return
	 */
	public String getAutor() {
		return autor;
	}
	
	/**
	 * 
	 * Método Setter referente ao atributo autor
	 * 
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	/**
	 * 
	 * Método Getter referente ao atributo edicao
	 * 
	 * @return
	 */
	public int getEdicao() {
		return edicao;
	}

	/**
	 * 
	 * Método Setter referente ao atributo edicao
	 * 
	 * @param edicao
	 */
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	/**
	 * 
	 * Método Getter referente ao atributo numeroPaginas
	 * 
	 * @return
	 */
	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	/**
	 * 
	 * Método Setter referente ao atributo numeroPaginas
	 * 
	 * @param numeroPaginas
	 */
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

}
