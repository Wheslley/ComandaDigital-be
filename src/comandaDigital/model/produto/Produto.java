package comandaDigital.model.produto;

/**
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
	
	public Produto(int idProduto, String nome, String descricao, Double valorBase, Double valorVenda){
		this.idProduto = idProduto;
		this.nome = nome;
		this.descricao = descricao;
		this.valorBase = valorBase;
		this.valorVenda = valorVenda;
	}
	
	public Produto(){
		
	}

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
	
	public String toString(){
		
		return "Id Produto: " + this.idProduto +
			   " Nome do Produto: " + this.nome + 
			   " Preço Venda: " + this.valorVenda + " $";
		
	}

}
