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
