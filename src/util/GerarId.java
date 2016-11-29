package util;

import localStorage.Artefatos;

/**
 * 
 * Classe GerarId será responsável em gerar ID's para as classes Pessoa, Cliente, Funcionario
 * e Produto
 * 
 * @author whesl
 *
 */

public class GerarId {
	
	private static GerarId instance;

	/**
	 * 
	 * Método Getter referente ao atributo instance
	 * 
	 * @return
	 */
	private static GerarId getIntance() {
		return instance;
	}

	/**
	 * 
	 * Método Setter referente ao atributo instance
	 * 
	 * @param aInstance
	 */
	private static void setInstance(GerarId aInstance) {
		instance = aInstance;
	}

	/**
	 * 
	 * Caso a variavel instance não estiver referência de nenhum ponto da
	 * memória, associamos a ela um endereço e instanciamos a própria classe,
	 * transformando-a em uma classe assincrôna.
	 * 
	 * @return
	 */
	public static GerarId getInstance() {

		if (getIntance() == null) {
			setInstance(new GerarId());
		}

		return getIntance();

	}
	
	/**
	 * 
	 * Método para gerar ID para Pessoa
	 * 
	 * @return
	 */
	public int geraIdPessoa() {

		int id = 0;

		if (Artefatos.clientes.size() == 0 && Artefatos.funcionarios.size() == 0 && Artefatos.usuarios.size() == 0) {
			return 1;
		} else {

			return leituraId(id);
		}
	}
	
	/**
	 * 
	 * Método leituraId
	 * 
	 * @param id
	 * @return
	 */
	public int leituraId(int id){
		id = leituraIdClientes(id);
		id = leituraIdUsuarios(id);
		return ++id;
	}
	
	/**
	 * 
	 * Método para realizar a leitura de um determinado ID em Cliente
	 * 
	 * @param id
	 * @return
	 */
	public int leituraIdClientes(int id){
		
		for (int i = 0; i < Artefatos.clientes.size(); i++) {

			if (id < Artefatos.clientes.get(i).getId()) {

				id = Artefatos.clientes.get(i).getId();

			}

		}
		
		return id;
	}
	
	/**
	 * 
	 * Método para realizar a leitura de um determinado ID em Usuario
	 * 
	 * @param id
	 * @return
	 */
	public int leituraIdUsuarios(int id){
		
		for (int i = 0; i < Artefatos.usuarios.size(); i++) {

			if (id < Artefatos.usuarios.get(i).getId()) {

				id = Artefatos.usuarios.get(i).getId();

			}

		}
		
		return id;
	}

	/**
	 * 
	 * Método para gerar ID para Cliente
	 * 
	 * @return
	 */
	public int geraIdCliente() {

		int numeroCliente = 0;

		if (Artefatos.clientes.size() == 0) {
			return 1000;
		} else {
			for (int i = 0; i < Artefatos.clientes.size(); i++) {

				if (numeroCliente < Artefatos.clientes.get(i).getNumeroCliente()) {

					numeroCliente = Artefatos.clientes.get(i).getNumeroCliente();

				}

			}

			return ++numeroCliente;
		}

	}
	
	/**
	 * 
	 * Método para gerar ID para Funcionario
	 * 
	 * @return
	 */
	public int geraIdFuncionario() {

		int numeroFuncionario = 0;

		if (Artefatos.funcionarios.size() == 0) {
			return 10;
		} else {
			for (int i = 0; i < Artefatos.funcionarios.size(); i++) {

				if (numeroFuncionario < Artefatos.funcionarios.get(i).getNumeroFuncionario()) {

					numeroFuncionario = Artefatos.funcionarios.get(i).getNumeroFuncionario();

				}

			}

			return ++numeroFuncionario;
		}

	}
	
	/**
	 * 
	 * Método para gerar ID para Produto
	 * 
	 * @return
	 */
	public int gerarIdProduto(){
		
		int numeroProduto = 0;
		
		if (Artefatos.produtos.size() == 0) {
			return 1;
		} else {
			for (int i = 0; i < Artefatos.produtos.size(); i++) {

				if (numeroProduto < Artefatos.produtos.get(i).getIdProduto()) {

					numeroProduto = Artefatos.produtos.get(i).getIdProduto();

				}

			}

			return ++numeroProduto;
		}
		
	}
	
}
