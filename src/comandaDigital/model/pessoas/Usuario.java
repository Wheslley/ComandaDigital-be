package comandaDigital.model.pessoas;

/**
 * 
 * Classe Usuário herdará a classe Pessoa para compor o objeto do tipo Usuário
 * 
 * @author whesl
 *
 */
public class Usuario extends Pessoa {

	private String login;
	private String senha;

	/**
	 * 
	 * Método construtor contendo todos os atributos da classe Usuário extendido com os atributos da classe Pessoa
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
	 * Método contrutor padrão da classe Usuário
	 */
	public Usuario() {
		
	}
	
	/**
	 * Início dos métodos getters e setters dos atributos da classe Usuário
	 */
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
	
	/**
	 * Método toString utilizado para exibir o Nome e o Login do usuário no console
	 */
	public String toString(){
		return "Nome: [" + this.getNome() + "] - " + 
			   "Login: [" + this.login + "]";
	}

}
