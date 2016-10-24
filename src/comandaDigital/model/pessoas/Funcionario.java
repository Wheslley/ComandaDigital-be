package comandaDigital.model.pessoas;

/**
 * 
 * 
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
	 * Método construtor contendo todos os atributos da classe Funcionario
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
	 * Método construtor padrão da classe Funcionario
	 */
	public Funcionario(){
		
	}
	
	/**
	 * 
	 * Método Getter referente ao atributo numeroFuncionario
	 * 
	 * @return
	 */
	public int getNumeroFuncionario() {
		return numeroFuncionario;
	}

	/**
	 * 
	 * Método Setter referente ao atributo numeroFuncionario
	 * 
	 * @param numeroFuncionario
	 */
	public void setNumeroFuncionario(int numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

	/**
	 * 
	 * Método Getter referente ao atributo salario
	 * 
	 * @return
	 */
	public double getSalario() {
		return salario;
	}
	
	/**
	 * 
	 * Método Setter referente ao atributo salario
	 * 
	 * @param salario
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * 
	 * Método Getter referente ao atributo funcao
	 * 
	 * @return
	 */
	public String getFuncao() {
		return funcao;
	}

	/**
	 * 
	 * Método Setter referente ao atributo funcao
	 * 
	 * @param funcao
	 */
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	/**
	 * 
	 * Método Getter referente ao atributo usuario
	 * 
	 * @return
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * 
	 * Método Setter referente ao atributo usuario
	 * 
	 * @param usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * Método toString da classe Funcionario utilizado para exibir os atributos usuario, funcao e salario
	 * no console da aplicação
	 */
	public String toString () {
		return "Usuario: [" + this.usuario.toString() + "] - " + 
			   "Funcao: [" + this.funcao + "] - " +
			   "Remuneracao: [" + this.salario + "]";
	}
}
