package comandaDigital.model.pessoas;

/**
 * 
 * Classe ClienteJuridico herdará a classe Cliente para compor todos seus atributos
 * 
 * @author whesl
 *
 */
public class ClienteJuridico extends Cliente {

	private int cnpj;
	private String razaoSocial;
	
	/**
	 * 
	 * Método construtor contendo todos os atributos da classe ClienteJuridico
	 * 
	 * @param id
	 * @param nome
	 * @param telefone
	 * @param logradouro
	 * @param bairro
	 * @param cidade
	 * @param uf
	 * @param cep
	 * @param email
	 * @param numeroCliente
	 * @param cnpj
	 * @param razaoSocial
	 */
	public ClienteJuridico(int id, String nome, String telefone, String logradouro, String bairro, String cidade, String uf, int cep, String email, int numeroCliente, int cnpj, String razaoSocial){
		super(id, nome, telefone, logradouro, bairro, cidade, uf, cep, email, numeroCliente);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	
	/**
	 * Método construtor padrão da classe ClienteJuridico
	 */
	public ClienteJuridico(){
		
	}

	/**
	 * 
	 * Método Getter referente ao atributo cnpj
	 * 
	 * @return
	 */
	public int getCnpj() {
		return cnpj;
	}

	/**
	 * 
	 * Método Setter referente ao atributo cnpj
	 * 
	 * @param cnpj
	 */
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * 
	 * Método Getter referente ao atributo razaoSocial
	 * 
	 * @return
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}
	
	/**
	 * 
	 * Método Setter referente ao atributo razaoSocial
	 * 
	 * @param razaoSocial
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

}
