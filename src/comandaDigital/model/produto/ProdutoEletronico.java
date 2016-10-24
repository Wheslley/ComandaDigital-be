package comandaDigital.model.produto;

/**
 * 
 * Classe ProdutoEletronico herdará a classe Produto para compor todos seus atributos
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
	 * Método construtor contendo todos os atributos da classe ProdutoEletronico
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
	 * Método construtor padrão da classe ProdutoEletronico
	 */
	public ProdutoEletronico(){
		
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
	public void setIdProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	
	/**
	 * 
	 * Método Getter referente ao atributo potencia
	 * 
	 * @return
	 */
	public double getPotencia() {
		return potencia;
	}
	
	/**
	 * 
	 * Método Setter referente ao atributo potencia
	 * 
	 * @param potencia
	 */
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	
	/**
	 * 
	 * Método Getter referente ao atributo voltagem
	 * 
	 * @return
	 */
	public double getVoltagem() {
		return voltagem;
	}
	
	/**
	 * 
	 * Método Setter referente ao atributo voltagem
	 * 
	 * @param voltagem
	 */
	public void setVoltagem(double voltagem) {
		this.voltagem = voltagem;
	}

}
