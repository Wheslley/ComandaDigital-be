package comandaDigital.model.estabelecimento;

import java.util.List;

import comandaDigital.model.pessoas.ClienteJuridico;

/**
 * 
 * Classe Estabelecimento será responsável em criar um objeto do tipo ComandaDigital e armazenar todas
 * as mesas disponíveis no estabelicimento.
 * 
 * @author whesl
 *
 */

public class Estabelecimento {
	
	private ClienteJuridico estabelecimento;
	private List<Mesa> mesas;

	/**
	 * 
	 * Método construtor contendo todos os atributos da classe Estabelecimento
	 * 
	 * @param estabelecimento
	 * @param mesas
	 */
	public Estabelecimento(ClienteJuridico estabelecimento, List<Mesa> mesas) {
		this.estabelecimento = estabelecimento;
		this.mesas = mesas;
	}
	
	/**
	 * Método construtor padrão da classe Estabelecimento
	 */
	public Estabelecimento(){
		
	}

	/**
	 * 
	 * Método Getter referente ao atributo estabelecimento
	 * 
	 * @return
	 */
	public ClienteJuridico getEstabelecimento() {
		return estabelecimento;
	}

	/**
	 * 
	 * Método Setter referente ao atributo estabelecimento
	 * 
	 * @param estabelecimento
	 */
	public void setEstabelecimento(ClienteJuridico estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	/**
	 * 
	 * Método Getter referente ao atributo mesas
	 * 
	 * @return
	 */
	public List<Mesa> getMesas() {
		return mesas;
	}

	/**
	 * 
	 * Método Setter referente ao atributo mesas
	 * 
	 * @param mesas
	 */
	public void setMesas(List<Mesa> mesas) {
		this.mesas = mesas;
	}
	
}
