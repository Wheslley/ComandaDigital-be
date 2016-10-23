package comandaDigital.model.pessoas;

/**
 * 
 * Classe Cliente ser� utilizada como base para as classes ClienteFisico e ClienteJuridico
 * 
 * @author whesl
 *
 */
public class Cliente extends Pessoa {
	
	private int numeroCliente;
	
	/**
	 * 
	 * M�todo construtor contendo todos os atributos da classe Cliente
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
	 * M�todo construtor padr�o da classe Cliente
	 */
	public Cliente(){
		
	}
	
	/**
	 * 
	 * M�todo Getter referente ao atributo numeroCliente
	 * 
	 * @return
	 */
	public int getNumeroCliente() {
		return numeroCliente;
	}
	
	/**
	 * 
	 * M�todo Setter referente ao atributo numeroCliente
	 * 
	 * @param numeroCliente
	 */
	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	
	/**
	 * M�todo toString da classe Cliente utilizado para exibir os atributos nome, id e numeroCliente
	 * no console da aplica��o
	 */
	public String toString (){
		
		return "Nome: [" + super.getNome() + "] - " + 
			   "IdPessoa: [" + super.getId()  + "] - " +
			   "NumeroCliente: [" + this.getNumeroCliente() + "]";
		
	}

}
