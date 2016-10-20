package comandaDigital.model.pessoas;

/**
 * 
 * @author whesl
 *
 */
public class Cliente extends Pessoa {
	
	private int numeroCliente;
	
	public Cliente(int id, String nome, String telefone, String logradouro, String bairro, String cidade, String uf, int cep, String email, int numeroCliente){
		super(id, nome, telefone, logradouro, bairro, cidade, uf, cep, email);
		this.numeroCliente = numeroCliente;
	}
	
	public Cliente(){
		
	}

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
		this.numeroCliente = numeroCliente;
	}
	
	public String toString (){
		
		return "Nome: [" + super.getNome() + "] - " + 
			   "IdPessoa: [" + super.getId()  + "] - " +
			   "NumeroCliente: [" + this.getNumeroCliente() + "]";
		
	}

}
