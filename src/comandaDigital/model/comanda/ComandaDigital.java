package comandaDigital.model.comanda;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Classe ComandaDigital ser� respons�vel em criar um objeto do tipo ComandaDigital e armazenar todos
 * os itens solicitados pelo cliente em uma List<ItemComandaDigital>
 * 
 * @author whesl
 *
 */
public class ComandaDigital {

	private int idComandaDigital;
	private List<ItemComandaDigital> listItemComandaDigital;

	/**
	 * 
	 * M�todo construtor contendo todos os atributos da classe ComandaDigital
	 * 
	 * @param idComandaDigital
	 * @param listItemComandaDigital
	 */
	public ComandaDigital(int idComandaDigital, List<ItemComandaDigital> listItemComandaDigital){
		this.idComandaDigital = idComandaDigital;
		this.listItemComandaDigital = listItemComandaDigital;
	}
	
	/**
	 * M�todo construtor padr�o da classe ComandaDigital
	 */
	public ComandaDigital(){
		this.listItemComandaDigital = new ArrayList<>();
	}
	
	/**
	 * 
	 * M�todo Getter referente ao atributo idComandaDigital
	 * 
	 * @return
	 */
	public int getIdComandaDigital() {
		return idComandaDigital;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo idComandaDigital
	 * 
	 * @param idComandaDigital
	 */
	public void setIdComandaDigital(int idComandaDigital) {
		this.idComandaDigital = idComandaDigital;
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo listItemComandaDigital
	 * 
	 * @return
	 */
	public List<ItemComandaDigital> getListItemComandaDigital() {
		return listItemComandaDigital;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo listItemComandaDigital
	 * 
	 * @param listItemComandaDigital
	 */
	public void setListItemComandaDigital(List<ItemComandaDigital> listItemComandaDigital) {
		this.listItemComandaDigital = listItemComandaDigital;
	}
	
	/**
	 * 
	 * M�todo que adiciona um itemComandaDigital na listItemComandaDigital.
	 * 
	 * @param itemComandaDigital
	 */
	public void setAddListItemComandaDigital(ItemComandaDigital itemComandaDigital){
		this.listItemComandaDigital.add(itemComandaDigital);
	}

}
