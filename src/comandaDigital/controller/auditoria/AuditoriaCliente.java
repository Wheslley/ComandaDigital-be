package comandaDigital.controller.auditoria;

import java.util.List;

import comandaDigital.model.pessoas.Cliente;
import comandaDigital.view.cliente.MenuCliente;
import interfaces.mensagens.IMensagemGeral;
import interfaces.padroes.IMenuCrudPadr�o;
import localStorage.Artefatos;
import util.GerarId;

/**
 * 
 * 
 * 
 * @author whesl
 *
 */

public class AuditoriaCliente implements IMenuCrudPadr�o {

	private static AuditoriaCliente instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance.
	 * 
	 * @return
	 */
	private static AuditoriaCliente getIntance() {
		return instance;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo instance.
	 * 
	 * @param aInstance
	 */
	private static void setInstance(AuditoriaCliente aInstance) {
		instance = aInstance;
	}

	/**
	 * 
	 * Caso a variavel instance n�o estiver refer�ncia de nenhum ponto da
	 * mem�ria, associamos a ela um endere�o e instanciamos a pr�pria classe,
	 * transformando-a em uma classe assincr�na.
	 * 
	 * @return
	 */
	public static AuditoriaCliente getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaCliente());
		}

		return getIntance();

	}

	/**
	 * 
	 * M�todo auditaObjeto fica como respons�vel em instanciar o menu solicitado pelo
	 * usu�rio, podendo este menu ser o MenuInsereCliente, MenuDeletaCliente ou 
	 * MenuAlteracaoCliente.
	 * 
	 * @param opcaoMenu
	 * 
	 */
	@Override
	public void validaMenu(int opcaoMenu) {

		switch (opcaoMenu) {

			case 1: {
	
				MenuCliente.getInstance().getMenuInsereCliente();
				break;
	
			}
	
			case 2: {
	
				MenuCliente.getInstance().getMenuDeletaCliente();
				break;
	
			}
			
			case 3: {
				
				MenuCliente.getInstance().getMenuAlteracaoCliente();
				break;
	
			}
	
			default: {
	
				getTodosObjetos();
				break;
	
			}

		}
		
	}

	/**
	 * 
	 * M�todo insereObjeto realizar� a inclus�o de um novo Cliente na lista clientes.
	 * 
	 * @param object
	 * 
	 */
	@Override
	public void insereObjeto(Object object) {

		Cliente cliente = (Cliente) object;
		
		cliente.setId(GerarId.getInstance().geraIdPessoa());
		cliente.setNumeroCliente(GerarId.getInstance().geraIdCliente());

		Artefatos.clientes.add(cliente);

		//System.out.println(IMensagemGeral.CLIENTE_INSERIDO_SUCESSO);
		
	}

	/**
	 * 
	 * M�todo alteraObjeto ser� respons�vel em alterar um cliente cujo ID j� exista na 
	 * base de Clientes.
	 * 
	 * @param object
	 * 
	 */
	@Override
	public void alteraObjeto(Object object) {
		
		Cliente cliente = (Cliente) object;
		
		for (int i = 0; i < Artefatos.clientes.size(); i++) {

			if (cliente.getId() == Artefatos.clientes.get(i).getId()) {

				Artefatos.clientes.get(i).setBairro(cliente.getBairro());
				Artefatos.clientes.get(i).setCep(cliente.getCep());
				Artefatos.clientes.get(i).setCidade(cliente.getCidade());
				Artefatos.clientes.get(i).setEmail(cliente.getEmail());
				Artefatos.clientes.get(i).setLogradouro(cliente.getLogradouro());
				Artefatos.clientes.get(i).setNome(cliente.getNome());
				Artefatos.clientes.get(i).setTelefone(cliente.getTelefone());
				Artefatos.clientes.get(i).setUf(cliente.getUf());

			}
		}

		System.out.println(IMensagemGeral.CLIENTE_ALTERADO_SUCESSO);
	}

	/**
	 * 
	 * M�todo removeObjeto ser� respons�vel em remover um determinado cliente cujo ID j�
	 * exista na base de Clientes.
	 * 
	 * @param id
	 * 
	 */
	@Override
	public void removeObjeto(int id) {
		
		for (int i = 0; i < Artefatos.clientes.size(); i++) {

			if (Artefatos.clientes.get(i).getId() == id) {

				Artefatos.clientes.remove(i);

			}
		}

		System.out.println(IMensagemGeral.CLIENTE_DELETADO_SUCESSO);
	}
	
	/**
	 * M�todo listarObjeto ser� respons�vel em listar todos os Clientes que estejam 
	 * na lista clientes.
	 */
	@Override
	public List<Object> getTodosObjetos() {
		
		for(Cliente cliente : Artefatos.clientes){
			System.out.println(cliente.toString());
		}
		
		return null;
	}

	/**
	 * 
	 * M�todo getObject ser� respons�vel em retornar um cliente cujo ID exista na 
	 * base Clientes. 
	 * 
	 * @param id
	 * 
	 */
	@Override
	public Object getObject(int id) {

		Cliente cliente = new Cliente();

		for (int i = 0; i < Artefatos.clientes.size(); i++) {

			if (id == Artefatos.clientes.get(i).getId()) {

				cliente = Artefatos.clientes.get(i);

			}

		}

		return cliente;
		
	}

}
