package comandaDigital.model.pessoas;

/**
 * 
 * @author whesl
 *
 */
public class ClienteJuridico extends Cliente {

	private int cnpj;
	private String razaoSocial;
	
	public ClienteJuridico(int id, String nome, String telefone, String logradouro, String bairro, String cidade, String uf, int cep, String email, int numeroCliente, int cnpj, String razaoSocial){
		super(id, nome, telefone, logradouro, bairro, cidade, uf, cep, email, numeroCliente);
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}
	
	public ClienteJuridico(){
		
	}
	
	public void SolicitaProduto(int idProduto){
		
	}
	
	public void RealizarPagamento(){
		
	}
	
	public void ConsultarValoresComanda(int idComanda){
		
	}

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
