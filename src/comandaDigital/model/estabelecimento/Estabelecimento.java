package comandaDigital.model.estabelecimento;

import java.util.List;

import comandaDigital.model.pessoas.ClienteJuridico;

/**
 * 
 * Classe Estabelecimento ser� respons�vel em criar um objeto do tipo ComandaDigital e armazenar todas
 * as mesas dispon�veis no estabelicimento.
 * 
 * @author whesl
 *
 */

public class Estabelecimento {
	
	private ClienteJuridico estabelecimento;
	private List<Mesa> mesas;

	/**
	 * 
	 * M�todo construtor contendo todos os atributos da classe Estabelecimento
	 * 
	 * @param estabelecimento
	 * @param mesas
	 */
	public Estabelecimento(ClienteJuridico estabelecimento, List<Mesa> mesas) {
		this.estabelecimento = estabelecimento;
		this.mesas = mesas;
	}
	
	/**
	 * M�todo construtor padr�o da classe Estabelecimento
	 */
	public Estabelecimento(){
		
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo estabelecimento
	 * 
	 * @return
	 */
	public ClienteJuridico getEstabelecimento() {
		return estabelecimento;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo estabelecimento
	 * 
	 * @param estabelecimento
	 */
	public void setEstabelecimento(ClienteJuridico estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo mesas
	 * 
	 * @return
	 */
	public List<Mesa> getMesas() {
		return mesas;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo mesas
	 * 
	 * @param mesas
	 */
	public void setMesas(List<Mesa> mesas) {
		this.mesas = mesas;
	}
	
}
