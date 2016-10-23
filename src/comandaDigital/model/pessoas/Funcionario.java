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
	 * M�todo construtor contendo todos os atributos da classe Funcionario
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
	 * M�todo construtor padr�o da classe Funcionario
	 */
	public Funcionario(){
		
	}
	
	/**
	 * 
	 * M�todo Getter referente ao atributo numeroFuncionario
	 * 
	 * @return
	 */
	public int getNumeroFuncionario() {
		return numeroFuncionario;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo numeroFuncionario
	 * 
	 * @param numeroFuncionario
	 */
	public void setNumeroFuncionario(int numeroFuncionario) {
		this.numeroFuncionario = numeroFuncionario;
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo salario
	 * 
	 * @return
	 */
	public double getSalario() {
		return salario;
	}
	
	/**
	 * 
	 * M�todo Setter referente ao atributo salario
	 * 
	 * @param salario
	 */
	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo funcao
	 * 
	 * @return
	 */
	public String getFuncao() {
		return funcao;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo funcao
	 * 
	 * @param funcao
	 */
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	/**
	 * 
	 * M�todo Getter referente ao atributo usuario
	 * 
	 * @return
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo usuario
	 * 
	 * @param usuario
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * M�todo toString da classe Funcionario utilizado para exibir os atributos usuario, funcao e salario
	 * no console da aplica��o
	 */
	public String toString () {
		return "Usuario: [" + this.usuario.toString() + "] - " + 
			   "Funcao: [" + this.funcao + "] - " +
			   "Remuneracao: [" + this.salario + "]";
	}
}
