package comandaDigital.model.pessoas;

/**
 * 
 * Classe Cliente será utilizada como base para as classes ClienteFisico e ClienteJuridico
 * 
 * @author whesl
 *
 */
public class Cliente extends Pessoa {
	
	private int numeroCliente;
	
	/**
	 * 
	 * Método construtor contendo todos os atributos da classe Cliente
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
	 */
	public Cliente(int id, String nome, String telefone, String logradouro, String bairro, String cidade, String uf, int cep, String email, int numeroCliente){
		super(id, nome, telefone, logradouro, bairro, cidade, uf, cep, email);
		this.numeroCliente = numeroCliente;
	}
	
	/**
	 * Método construtor padrão da classe Cliente
	 */
	public Cliente(){
		
	}
	
	/**
	 * 
	 * Método Getter referente ao atributo numeroCliente
	 * 
	 * @return
	 */
	public int getNumeroCliente() {
		return numeroCliente;
	}
	
	/**
	 * 
	 * Método Setter referente ao atributo numeroCliente
	 * 
	 * @param numeroCliente
	 */
	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	
	/**
	 * Método toString da classe Cliente utilizado para exibir os atributos nome, id e numeroCliente
	 * no console da aplicação
	 */
	public String toString (){
		
		return "Nome: [" + super.getNome() + "] - " + 
			   "IdPessoa: [" + super.getId()  + "] - " +
			   "NumeroCliente: [" + this.getNumeroCliente() + "]";
		
	}

}
