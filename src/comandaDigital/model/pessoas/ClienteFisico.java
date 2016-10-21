package comandaDigital.model.pessoas;

/**
 * 
 * @author whesl
 *
 */
public class ClienteFisico extends Cliente{

	private int cpf;
	
	/**
	 * 
	 * Método construtor contendo todos os atributos da classe ClienteFísico extendido com todos
	 * os atributos da classe Cliente e Pessoa
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
	 * Método construtor padrão para a classe ClienteFisico
	 */
	public ClienteFisico(){
		
	}
	
	public void SolicitaProduto(int idProduto){
		
	}
	
	public void RealizarPagamento(){
		
	}
	
	public void ConsultarValoresComanda(int idComanda){
		
	}
	
	/**
	 * Método getter e setter do atributo cpf
	 */
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

}
