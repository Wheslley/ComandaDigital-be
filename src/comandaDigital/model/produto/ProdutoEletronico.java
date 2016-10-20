package comandaDigital.model.produto;

/**
 * 
 * @author w_his
 *
 */

public class ProdutoEletronico extends Produto{
	
	private String codigoProduto;
	private double potencia;
	private double voltagem;
	
	public ProdutoEletronico(int idProduto, String nome, String descricao, double valorBase, double valorVenda, String codigoProduto, double potencia, double voltagem){
		super(idProduto, nome, descricao, valorBase, valorVenda);
		this.codigoProduto = codigoProduto;
		this.potencia = potencia;
		this.voltagem = voltagem;
	}
	
	public ProdutoEletronico(){
		
	}
	
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
