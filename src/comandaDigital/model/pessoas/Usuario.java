package comandaDigital.model.pessoas;

/**
 * 
 * Classe Usuario herdará a classe Pessoa para compor todos seus atributos
 * 
 * @author whesl
 *
 */
public class Usuario extends Pessoa {

	private String login;
	private String senha;

	/**
	 * 
	 * Método construtor contendo todos os atributos da classe Usuario
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
	 * @param login
	 * @param senha
	 */
	public Usuario(int id, String nome, String telefone, String logradouro, String bairro, String cidade, String uf, int cep, String email, String login, String senha) {
		super(id, nome, telefone, logradouro, bairro, cidade, uf, cep, email);
		this.login = login;
		this.senha = senha;
	}
	
	/**
	 * Método construtor padrão da classe Usuario
	 */
	public Usuario() {
		
	}
	
	/**
	 * 
	 * Método Getter referente ao atributo login
	 * 
	 * @return
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * 
	 * Método Setter referente ao atributo login
	 * 
	 * @param login
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * 
	 * Método Getter referente ao atributo senha
	 * 
	 * @return
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * 
	 * Método Setter referente ao atributo senha
	 * 
	 * @param senha
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	/**
	 * Método toString da classe Usuario utilizado para exibir os atributos nome e login
	 * no console da aplicação
	 */
	public String toString(){
		return "Nome: [" + this.getNome() + "] - " + 
			   "Login: [" + this.login + "]";
	}

}
