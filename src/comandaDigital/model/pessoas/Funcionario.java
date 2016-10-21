package comandaDigital.model.pessoas;

/**
 * 
 * Classe respons�vel em gerar um objeto do tipo Funcion�rio
 * 
 * @author whesl
 *
 */
public class Funcionario {

	private int numeroFuncionario;
	private double salario;
	private String funcao;
	private Usuario usuario;

	/**
	 * 
	 * Construtor contendo todos os atributos da classe Funcion�rio
	 * 
	 * @param numeroFuncionario
	 * @param salario
	 * @param funcao
	 * @param usuario
	 */
	public Funcionario(int numeroFuncionario, double salario, String funcao, Usuario usuario) {
		this.numeroFuncionario = numeroFuncionario;
		this.salario = salario;
		this.funcao = funcao;
		this.usuario = usuario;
	}
	
	/**
	 * Construtor padr�o da classe Funcion�rio
	 */
	public Funcionario(){
		
	}
	
	/**
	 * In�cio dos m�todos getters e setters dos atributos da classe
	 */
	public int getNumeroFuncionario() {
		return numeroFuncionario;
	}

	public void setNumeroFuncionario(int numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	/**
	 * M�todo toString utilizado para exibir o usu�rio, sua fun��o e sua remunera��o no console
	 */
	public String toString () {
		return "Usuario: [" + this.usuario.toString() + "] - " + 
			   "Funcao: [" + this.funcao + "] - " +
			   "Remuneracao: [" + this.salario + "]";
	}
}
