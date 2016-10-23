package comandaDigital.model.produto;

/**
 * 
 * Classe Produto será utilizada como base para as classes ProdutoAlimentar, ProdutoEletronico e ProdutoLiterario
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
	 * Método construtor contendo todos os atributos da classe Produto
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
	 * Método construtor padrão da classe Produto
	 */
	public Produto(){
		
	}
	
	/**
	 * 
	 * Método Getter referente ao atributo idProduto
	 * 
	 * @return
	 */
	public int getIdProduto() {
		return idProduto;
	}
	
	/**
	 * 
	 * Método Setter referente ao atributo idProduto
	 * 
	 * @param idProduto
	 */
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	
	/**
	 * 
	 * Método Getter referente ao atributo nome
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * 
	 * Método Setter referente ao atributo nome
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * 
	 * Método Getter referente ao atributo descricao
	 * 
	 * @return
	 */
	public String getDescricao() {
		return descricao;
	}
	
	/**
	 * 
	 * Método Setter referente ao atributo descricao
	 * 
	 * @param descricao
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	/**
	 * 
	 * Método Getter referente ao atributo valorBase
	 * 
	 * @return
	 */
	public Double getValorBase() {
		return valorBase;
	}
	
	/**
	 * 
	 * Método Setter referente ao atributo valorBase
	 * 
	 * @param valorBase
	 */
	public void setValorBase(Double valorBase) {
		this.valorBase = valorBase;
	}
	
	/**
	 * 
	 * Método Getter referente ao atributo valorVenda
	 * 
	 * @return
	 */
	public Double getValorVenda() {
		return valorVenda;
	}
	
	/**
	 * 
	 * Método Setter referente ao atributo valorVenda
	 * 
	 * @param valorVenda
	 */
	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}
	
	/**
	 * Método toString da classe Produto utilizado para exibir os atributos idProduto, nome e valorVenda
	 * no console da aplicação
	 */
	public String toString(){
		
		return "Id Produto: " + this.idProduto +
			   " Nome do Produto: " + this.nome + 
			   " Preço Venda: " + this.valorVenda + " $";
		
	}

}
