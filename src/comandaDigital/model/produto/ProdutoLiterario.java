package comandaDigital.model.produto;

/**
 * 
 * Classe ProdutoLiterario herdar� a classe Produto para compor todos seus atributos
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
	 * M�todo construtor contendo todos os atributos da classe ProdutoLiterario
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
	 * M�todo construtor padr�o da classe ProdutoLiterario
	 */
	public ProdutoLiterario(){
		
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
	 * M�todo Getter referente ao atributo autor
	 * 
	 * @return
	 */
	public String getAutor() {
		return autor;
	}
	
	/**
	 * 
	 * M�todo Setter referente ao atributo autor
	 * 
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	/**
	 * 
	 * M�todo Getter referente ao atributo edicao
	 * 
	 * @return
	 */
	public int getEdicao() {
		return edicao;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo edicao
	 * 
	 * @param edicao
	 */
	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	/**
	 * 
	 * M�todo Getter referente ao atributo numeroPaginas
	 * 
	 * @return
	 */
	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo numeroPaginas
	 * 
	 * @param numeroPaginas
	 */
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

}
