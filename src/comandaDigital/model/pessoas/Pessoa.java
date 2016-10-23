package comandaDigital.model.pessoas;

/**
 * 
 * Classe Pessoa será utilizada como base para as classes Cliente, Funcionario e Usuario
 * 
 * @author whesl
 *
 */
public class Pessoa {
	
	private int id;
	private String nome;
	private String telefone;
	private String logradouro;
	private String bairro;
	private String cidade;
	private String uf;
	private int cep;
	private String email;
	
	/**
	 * 
	 * Método construtor contendo todos os atributos da classe Pessoa
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
	 */
	public Pessoa(int id, String nome, String telefone, String logradouro, String bairro, String cidade, String uf, int cep, String email) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cidade = cidade;
		this.uf = uf;
		this.cep = cep;
		this.email = email;
	}
	
	/**
	 * Método construtor padrão da classe Pessoa
	 */
	public Pessoa (){
		
	}

	/**
	 * 
	 * Método Getter referente ao atributo id
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * Método Setter referente ao atributo id
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * Método Getter referente ao atributo nome
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * Método Setter referente ao atributo nome
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * 
	 * Método Getter referente ao atributo telefone
	 * 
	 * @return
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * 
	 * Método Setter referente ao atributo telefone
	 * 
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * 
	 * Método Getter referente ao atributo logradouro
	 * 
	 * @return
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * 
	 * Método Setter referente ao atributo logradouro
	 * 
	 * @param logradouro
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * 
	 * Método Getter referente ao atributo bairro
	 * 
	 * @return
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * 
	 * Método Setter referente ao atributo bairro
	 * 
	 * @param bairro
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * 
	 * Método Getter referente ao atributo cidade
	 * 
	 * @return
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * 
	 * Método Setter referente ao atributo cidade
	 * 
	 * @param cidade
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * 
	 * Método Getter referente ao atributo uf
	 * 
	 * @return
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * 
	 * Método Setter referente ao atributo uf
	 * 
	 * @param uf
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

	/**
	 * 
	 * Método Getter referente ao atributo cep
	 * 
	 * @return
	 */
	public int getCep() {
		return cep;
	}

	/**
	 * 
	 * Método Setter referente ao atributo cep
	 * 
	 * @param cep
	 */
	public void setCep(int cep) {
		this.cep = cep;
	}

	/**
	 * 
	 * Método Getter referente ao atributo email
	 *  
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * Método Setter referente ao atributo email
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
