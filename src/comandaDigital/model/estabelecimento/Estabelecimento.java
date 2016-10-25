package comandaDigital.model.estabelecimento;

import java.util.List;

import comandaDigital.model.pessoas.ClienteJuridico;

/**
 * 
 * @author whesl
 *
 */

public class Estabelecimento {
	
	private ClienteJuridico estabelecimento;
	private List<Mesa> mesas;

	public Estabelecimento(ClienteJuridico estabelecimento, List<Mesa> mesas) {
		this.estabelecimento = estabelecimento;
		this.mesas = mesas;
	}
	
	public Estabelecimento(){
		
	}

	public ClienteJuridico getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(ClienteJuridico estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public List<Mesa> getMesas() {
		return mesas;
	}

	public void setMesas(List<Mesa> mesas) {
		this.mesas = mesas;
	}
	
}
