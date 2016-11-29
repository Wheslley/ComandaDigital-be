package comandaDigital.model.pessoas;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * 
 * 
 * 
 * @author whesl
 *
 */
@Entity
@SequenceGenerator(name = "SEQ_FUNCIONARIOS", sequenceName = "SEQ_FUNCIONARIOS", initialValue = 1)
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_FUNCIONARIOS")
	private int id;
	private double salario;
	private String funcao;

	/**
	 * 
	 * Método construtor contendo todos os atributos da classe Funcionario
	 * 
	 * @param numeroFuncionario
	 * @param salario
	 * @param funcao
	 * @param usuario
	 */
	public Funcionario(int numeroFuncionario, double salario, String funcao) {
		this.id = numeroFuncionario;
		this.salario = salario;
		this.funcao = funcao;
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
		return id;
	}

	/**
	 * 
	 * Método Setter referente ao atributo numeroFuncionario
	 * 
	 * @param numeroFuncionario
	 */
	public void setNumeroFuncionario(int numeroFuncionario) {
		this.id = numeroFuncionario;
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
	 * Método toString da classe Funcionario utilizado para exibir os atributos usuario, funcao e salario
	 * no console da aplicação
	 */
	public String toString () {
		return "Funcao: [" + this.funcao + "] - " +
			   "Remuneracao: [" + this.salario + "]";
	}
}
