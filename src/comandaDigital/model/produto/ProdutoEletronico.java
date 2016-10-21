package comandaDigital.model.produto;

/**
 * 
 * Classe ProdutoEletronico herdará a classe Produto
 * 
 * @author w_his
 *
 */

public class ProdutoEletronico extends Produto{
	
	private String codigoProduto;
	private double potencia;
	private double voltagem;
	
	/**
	 * 
	 * Construtor com todos os atributos da classe ProdutoEletronico
	 * 
	 * @param idProduto
	 * @param nome
	 * @param descricao
	 * @param valorBase
	 * @param valorVenda
	 * @param codigoProduto
	 * @param potencia
	 * @param voltagem
	 */
	public ProdutoEletronico(int idProduto, String nome, String descricao, double valorBase, double valorVenda, String codigoProduto, double potencia, double voltagem){
		super(idProduto, nome, descricao, valorBase, valorVenda);
		this.codigoProduto = codigoProduto;
		this.potencia = potencia;
		this.voltagem = voltagem;
	}
	
	/**
	 * Construtor padrão da classe ProdutoEletronico
	 */
	public ProdutoEletronico(){
		
	}
	
	/**
	 * Início dos metodos getters e setters dos atributos
	 */
	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setIdProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	
	public double getPotencia() {
		return potencia;
	}

	public void setIdProduto(double potencia) {
		this.potencia = potencia;
	}
	
	public double getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(double voltagem) {
		this.voltagem = voltagem;
	}

}
