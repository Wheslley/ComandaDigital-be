package comandaDigital.model.pessoas;

/**
 * 
 * @author whesl
 *
 */
public class ClienteFisico extends Cliente{

	private int cpf;
	
	public ClienteFisico(int id, String nome, String telefone, String logradouro, String bairro, String cidade, String uf, int cep, String email, int numeroCliente, int cpf){
		super(id, nome, telefone, logradouro, bairro, cidade, uf, cep, email, numeroCliente);
		this.cpf = cpf;
	}
	
	public ClienteFisico(){
		
	}
	
	public void SolicitaProduto(int idProduto){
		
	}
	
	public void RealizarPagamento(){
		
	}
	
	public void ConsultarValoresComanda(int idComanda){
		
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

}
