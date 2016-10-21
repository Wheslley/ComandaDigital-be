package comandaDigital.model.relatorio;

/**
 * 
 * Classe respons�vel pelo hist�rico da comanda.
 * 
 * @author w_his
 * 
 */

import java.util.Date;

public class Historico {
	
	private int idHistorico;
	private int idComanda;
	private Date data;
	
	/**
	 * In�cio dos getters e setters dos atributos
	 */
	public int getIdHistorico() {
		return idHistorico;
	}

	public void setIdHistorico(int idHistorico) {
		this.idHistorico = idHistorico;
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

	public void setIdComanda(Date data) {
		this.data = data;
	}

}
