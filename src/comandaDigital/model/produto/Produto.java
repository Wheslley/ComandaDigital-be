package comandaDigital.model.produto;

/**
 * 
 * Classe base para ProdutoAlimentar, ProdutoEletronico e ProdutoLiterario
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
	 * Construtor com todos os argumentos da classe Produto
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
	 * Construtor vazio da classe Produto
	 */
	public Produto(){
		
	}

	/**
	 * Início dos métodos getters e setters dos atributos
	 */
	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValorBase() {
		return valorBase;
	}

	public void setValorBase(Double valorBase) {
		this.valorBase = valorBase;
	}

	public Double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(Double valorVenda) {
		this.valorVenda = valorVenda;
	}

}
