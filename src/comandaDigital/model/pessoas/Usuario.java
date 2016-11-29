package comandaDigital.model.pessoas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * 
 * Classe Usuario herdar� a classe Pessoa para compor todos seus atributos
 * 
 * @author whesl
 *
 */
@Entity
@SequenceGenerator(name = "SEQ_USUARIOS", sequenceName = "SEQ_USUARIOS", initialValue = 1)
public class Usuario extends Pessoa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_USUARIOS")
	private Integer id_usuario;
	private String senha;
	private String tipo;
	
	/**
	 * 
	 * M�todo construtor contendo todos os atributos da classe Usuario
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
	public Usuario(int id, String nome, String telefone, String logradouro, String bairro, String cidade, String uf, int cep, String email, Integer id_usuario, String senha) {
		super(id, nome, telefone, logradouro, bairro, cidade, uf, cep, email);
		this.id_usuario = id_usuario;
		this.senha = senha;
	}
	
	/**
	 * M�todo construtor padr�o da classe Usuario
	 */
	public Usuario() {
		
	}
	
	/**
	 * 
	 * M�todo Getter referente ao atributo login
	 * 
	 * @return
	 */
	public Integer getLogin() {
		return id_usuario;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo login
	 * 
	 * @param login
	 */
	public void setLogin(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo senha
	 * 
	 * @return
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo senha
	 * 
	 * @param senha
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	/**
	 * M�todo toString da classe Usuario utilizado para exibir os atributos nome e login
	 * no console da aplica��o
	 */
	public String toString(){
		return "Login: [" + this.id_usuario + "]" +
				"Senha: [" + this.senha + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
