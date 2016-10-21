package comandaDigital.model.pessoas;

/**
 * 
 * Classe com atributos base para as classes Usuário e Cliente
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
	 * Construtor contendo todos os atributos da classe Pessoa
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
	 * Construtor padrão da classe Pessoa
	 */
	public Pessoa (){
		
	}

	/**
	 * Início dos métodos getters e setters dos atributos da classe
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
