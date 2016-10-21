package comandaDigital.model.financeiro;

/**
 * 
 * Classe responsável por calcular os impostos de acordo com um determinado faturamento
 * 
 * @author w_his
 * 
 */

import java.util.Date;

public class GerarCalculoImposto {
	
	private int idFaturamento;
	private Date dataFaturamento;
	
	/**
	 * 
	 * Método responsável por calcular os impostos do faturamento
	 * 
	 * @param idFaturamento
	 * @param data
	 */
	public void CalcularImpostos(int idFaturamento, Date data){
		
	}
	
	/**
	 * Início dos métodos getters e setters dos atributos da classe
	 */
	public int getIdFaturamento() {
		return idFaturamento;
	}

	public void setIdFaturamento(int idFaturamento) {
		this.idFaturamento = idFaturamento;
	}

	public Date getDataFaturamento() {
		return dataFaturamento;
	}

	public void setDataFaturamento(Date dataFaturamento) {
		this.dataFaturamento = dataFaturamento;
	}
	
	

}
