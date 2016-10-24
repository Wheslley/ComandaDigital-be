package comandaDigital.model.pessoas;

/**
 * 
 * Classe Pessoa ser� utilizada como base para as classes Cliente, Funcionario e Usuario
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
	 * M�todo construtor contendo todos os atributos da classe Pessoa
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
	 * M�todo construtor padr�o da classe Pessoa
	 */
	public Pessoa (){
		
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo id
	 * 
	 * @return
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo id
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo nome
	 * 
	 * @return
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo nome
	 * 
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo telefone
	 * 
	 * @return
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo telefone
	 * 
	 * @param telefone
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo logradouro
	 * 
	 * @return
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo logradouro
	 * 
	 * @param logradouro
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo bairro
	 * 
	 * @return
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo bairro
	 * 
	 * @param bairro
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo cidade
	 * 
	 * @return
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo cidade
	 * 
	 * @param cidade
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo uf
	 * 
	 * @return
	 */
	public String getUf() {
		return uf;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo uf
	 * 
	 * @param uf
	 */
	public void setUf(String uf) {
		this.uf = uf;
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo cep
	 * 
	 * @return
	 */
	public int getCep() {
		return cep;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo cep
	 * 
	 * @param cep
	 */
	public void setCep(int cep) {
		this.cep = cep;
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo email
	 *  
	 * @return
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo email
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
