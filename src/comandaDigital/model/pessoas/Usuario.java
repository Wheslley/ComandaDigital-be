package comandaDigital.model.pessoas;

/**
 * 
 * @author whesl
 *
 */
public class Usuario extends Pessoa {

	private String login;
	private String senha;

	public Usuario(int id, String nome, String telefone, String logradouro, String bairro, String cidade, String uf, int cep, String email, String login, String senha) {
		super(id, nome, telefone, logradouro, bairro, cidade, uf, cep, email);
		this.login = login;
		this.senha = senha;
	}
	
	public Usuario() {
		
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String toString(){
		return "Nome: [" + this.getNome() + "] - " + 
			   "Login: [" + this.login + "]";
	}

}
