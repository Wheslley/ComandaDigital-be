package comandaDigital.model.financeiro;

import java.util.Date;

/**
 * 
 * 
 * 
 * @author w_his
 *
 */

public class Faturamento {
	
	private int idFaturamento;
	private int idComanda;
	private Date data;
	private String usuario;
	
	/**
	 * Método responsável por informar ao cliente o seu faturamento por todos os produtos da comanda digital
	 */
	public void FaturarCliente(){
		
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
	
	public int getIdComanda() {
		return idComanda;
	}

	public void setIdComanda(int idComanda) {
		this.idComanda = idComanda;
	}
	
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
	
	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
}
