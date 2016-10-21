package comandaDigital.model.comanda;

import java.util.List;

/**
 * 
 * Classe ComandaDigital, reponsável por armazenar em uma lista todos os produtos solicitados 
 * pelo cliente
 * 
 * @author whesl
 *
 */
public class ComandaDigital {

	private int idComandaDigital;
	private List<ItemComandaDigital> listItemComandaDigital;

	/**
	 * Início dos métodos getters e setters dos atributos da classe
	 */
	public int getIdComandaDigital() {
		return idComandaDigital;
	}

	public void setIdComandaDigital(int idComandaDigital) {
		this.idComandaDigital = idComandaDigital;
	}

	public List<ItemComandaDigital> getListItemComandaDigital() {
		return listItemComandaDigital;
	}

	public void setListItemComandaDigital(List<ItemComandaDigital> listItemComandaDigital) {
		this.listItemComandaDigital = listItemComandaDigital;
	}

}
