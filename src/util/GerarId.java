package util;

import localStorage.Artefatos;

/**
 * 
 * @author whesl
 *
 */

public class GerarId {
	
	private static GerarId instance;

	private static GerarId getIntance() {
		return instance;
	}

	private static void setInstance(GerarId aInstance) {
		instance = aInstance;
	}

	public static GerarId getInstance() {

		if (getIntance() == null) {
			setInstance(new GerarId());
		}

		return getIntance();

	}
	
	public int geraIdPessoa() {

		int id = 0;

		if (Artefatos.clientes.size() == 0 && Artefatos.funcionarios.size() == 0 && Artefatos.usuarios.size() == 0) {
			return 1;
		} else {

			return leituraId(id);
		}
	}
	
	public int leituraId(int id){
		id = leituraIdClientes(id);
		id = leituraIdUsuarios(id);
		return ++id;
	}
	
	public int leituraIdClientes(int id){
		
		for (int i = 0; i < Artefatos.clientes.size(); i++) {

			if (id < Artefatos.clientes.get(i).getId()) {

				id = Artefatos.clientes.get(i).getId();

			}

		}
		
		return id;
	}
	
	public int leituraIdUsuarios(int id){
		
		for (int i = 0; i < Artefatos.usuarios.size(); i++) {

			if (id < Artefatos.usuarios.get(i).getId()) {

				id = Artefatos.usuarios.get(i).getId();

			}

		}
		
		return id;
	}

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
