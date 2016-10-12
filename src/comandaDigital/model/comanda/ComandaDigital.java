package comandaDigital.model.comanda;

import java.util.List;

/**
 * 
 * @author whesl
 *
 */
public class ComandaDigital {

	private int idComandaDigital;
	private List<ItemComandaDigital> listItemComandaDigital;

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
