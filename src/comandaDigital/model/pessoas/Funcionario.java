package comandaDigital.model.pessoas;

/**
 * 
 * @author whesl
 *
 */
public class Funcionario {

	private int numeroFuncionario;
	private double salario;
	private String funcao;
	private Usuario usuario;

	public Funcionario(int numeroFuncionario, double salario, String funcao, Usuario usuario) {
		this.numeroFuncionario = numeroFuncionario;
		this.salario = salario;
		this.funcao = funcao;
		this.usuario = usuario;
	}

	public Funcionario(){
		
	}
	
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

	public String toString () {
		return "Usuario: [" + this.usuario.toString() + "] - " + 
			   "Funcao: [" + this.funcao + "] - " +
			   "Remuneracao: [" + this.salario + "]";
	}
}
