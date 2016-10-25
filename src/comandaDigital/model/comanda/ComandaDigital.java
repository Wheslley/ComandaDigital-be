package comandaDigital.model.comanda;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Classe ComandaDigital será responsável em criar um objeto do tipo ComandaDigital e armazenar todos
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
	 * Método construtor contendo todos os atributos da classe ComandaDigital
	 * 
	 * @param idComandaDigital
	 * @param listItemComandaDigital
	 */
	public ComandaDigital(int idComandaDigital, List<ItemComandaDigital> listItemComandaDigital){
		this.idComandaDigital = idComandaDigital;
		this.listItemComandaDigital = listItemComandaDigital;
	}
	
	/**
	 * Método construtor padrão da classe ComandaDigital
	 */
	public ComandaDigital(){
		this.listItemComandaDigital = new ArrayList<>();
	}
	
	/**
	 * 
	 * Método Getter referente ao atributo idComandaDigital
	 * 
	 * @return
	 */
	public int getIdComandaDigital() {
		return idComandaDigital;
	}

	/**
	 * 
	 * Método Setter referente ao atributo idComandaDigital
	 * 
	 * @param idComandaDigital
	 */
	public void setIdComandaDigital(int idComandaDigital) {
		this.idComandaDigital = idComandaDigital;
	}

	/**
	 * 
	 * Método Getter referente ao atributo listItemComandaDigital
	 * 
	 * @return
	 */
	public List<ItemComandaDigital> getListItemComandaDigital() {
		return listItemComandaDigital;
	}

	/**
	 * 
	 * Método Setter referente ao atributo listItemComandaDigital
	 * 
	 * @param listItemComandaDigital
	 */
	public void setListItemComandaDigital(List<ItemComandaDigital> listItemComandaDigital) {
		this.listItemComandaDigital = listItemComandaDigital;
	}
	
	/**
	 * 
	 * Método que adiciona um itemComandaDigital na listItemComandaDigital.
	 * 
	 * @param itemComandaDigital
	 */
	public void setAddListItemComandaDigital(ItemComandaDigital itemComandaDigital){
		this.listItemComandaDigital.add(itemComandaDigital);
	}

}
