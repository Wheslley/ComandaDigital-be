package comandaDigital.model.produto;

/**
 * 
 * Classe Produto ser� utilizada como base para as classes ProdutoAlimentar, ProdutoEletronico e ProdutoLiterario
 * 
 * @author whesl
 *
 */
public class Produto {

	private int idProduto;
	private String nome;
	private String descricao;
	private Double valorBase;
	private Double valorVenda;
	
	/**
	 * 
	 * M�todo construtor contendo todos os atributos da classe Produto
	 * 
	 * @param idProduto
	 * @param nome
	 * @param descricao
	 * @param valorBase
	 * @param valorVenda
	 */
	public Produto(int idProduto, String nome, String descricao, Double valorBase, Double valorVenda){
		this.idProduto = idProduto;
		this.nome = nome;
		this.descricao = descricao;
		this.valorBase = valorBase;
		this.valorVenda = valorVenda;
	}
	
	/**
	 * M�todo construtor padr�o da classe Produto
	 */
	public Produto(){
		
	}
	
	/**
	 * 
	 * M�todo Getter referente ao atributo idProduto
	 * 
	 * @return
	 */
	public int getIdProduto() {
		return idProduto;
	}
	
	/**
	 * 
	 * M�todo Setter referente ao atributo idProduto
	 * 
	 * @param idProduto
	 */
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	
	/**
	 * 
	 * M�todo Getter referente ao atributo nome
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * 
	 * M�todo Setter referente ao atributo nome
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * 
	 * M�todo Getter referente ao atributo descricao
	 * 
	 * @return
	 */
	public String getDescricao() {
		return descricao;
	}
	
	/**
	 * 
	 * M�todo Setter referente ao atributo descricao
	 * 
	 * @param descricao
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	/**
	 * 
	 * M�todo Getter referente ao atributo valorBase
	 * 
	 * @return
	 */
	public Double getValorBase() {
		return valorBase;
	}
	
	/**
	 * 
	 * M�todo Setter referente ao atributo valorBase
	 * 
	 * @param valorBase
	 */
	public void setValorBase(Double valorBase) {
		this.valorBase = valorBase;
	}
	
	/**
	 * 
	 * M�todo Getter referente ao atributo valorVenda
	 * 
	 * @return
	 */
	public Double getValorVenda() {
		return valorVenda;
	}
	
	/**
	 * 
	 * M�todo Setter referente ao atributo valorVenda
	 * 
	 * @param valorVenda
	 */
	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	/**
	 * M�todo toString da classe Produto utilizado para exibir os atributos idProduto, nome e valorVenda
	 * no console da aplica��o
	 */
	public String toString(){
		
		return "Id Produto: " + this.idProduto +
			   " Nome do Produto: " + this.nome + 
			   " Pre�o Venda: " + this.valorVenda + " $";
		
	}

}
