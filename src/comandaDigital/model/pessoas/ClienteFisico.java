package comandaDigital.model.pessoas;

/**
 * 
 * Classe ClienteFisico herdará a classe Cliente para compor todos seus atributos
 * 
 * @author whesl
 *
 */
public class ClienteFisico extends Cliente{

	private int cpf;
	
	/**
	 * 
	 * Método construtor contendo todos os atributos da classe ClienteFisico
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
	 * @param cpf
	 */
	public ClienteFisico(int id, String nome, String telefone, String logradouro, String bairro, String cidade, String uf, int cep, String email, int numeroCliente, int cpf){
		super(id, nome, telefone, logradouro, bairro, cidade, uf, cep, email, numeroCliente);
		this.cpf = cpf;
	}
	
	/**
	 * Método construtor padrão da classe ClienteFisico
	 */
	public ClienteFisico(){
		
	}

	/**
	 * 
	 * Método Getter referente ao atributo cpf
	 * 
	 * @return
	 */
	public int getCpf() {
		return cpf;
	}

	/**
	 * 
	 * Método Setter referente ao atributo cpf
	 * 
	 * @param cpf
	 */
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

}
