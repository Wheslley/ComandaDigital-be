package comandaDigital.model.pessoas;

/**
 * 
 * @author whesl
 *
 */
public class ClienteJuridico extends Cliente {

	private int cnpj;
	private String razaoSocial;

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

}
