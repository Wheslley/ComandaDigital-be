package comandaDigital.controller.auditoria;

import comandaDigital.model.pessoas.Cliente;
import comandaDigital.view.cliente.MenuCliente;
import interfaces.mensagens.IMensagemGeral;
import interfaces.padroes.IMenuCrudPadrão;
import localStorage.Artefatos;
import util.GerarId;

/**
 * 
 * @author whesl
 *
 */

public class AuditoriaCliente implements IMenuCrudPadrão {

	private static AuditoriaCliente instance;

	private static AuditoriaCliente getIntance() {
		return instance;
	}

	private static void setInstance(AuditoriaCliente aInstance) {
		instance = aInstance;
	}

	public static AuditoriaCliente getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaCliente());
		}

		return getIntance();

	}

	@Override
	public void auditaObjeto(int opcaoMenu) {

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
	
				listarObjeto();
				break;
	
			}

		}
		
	}

	@Override
	public void insereObjeto(Object object) {

		Cliente cliente = (Cliente) object;
		
		cliente.setId(GerarId.getInstance().geraId());
		cliente.setNumeroCliente(GerarId.getInstance().geraIdCliente());

		Artefatos.clientes.add(cliente);

		System.out.println(IMensagemGeral.CLIENTE_INSERIDO_SUCESSO);
		
	}

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

	@Override
	public void removeObjeto(int id) {
		
		for (int i = 0; i < Artefatos.clientes.size(); i++) {

			if (Artefatos.clientes.get(i).getId() == id) {

				Artefatos.clientes.remove(i);

			}
		}

		System.out.println(IMensagemGeral.CLIENTE_DELETADO_SUCESSO);
	}
	
	@Override
	public void listarObjeto() {
		
		for(Cliente cliente : Artefatos.clientes){
			System.out.println(cliente.toString());
		}
		
	}

	@Override
	public Object getObject(int id) {

		Cliente cliente = new Cliente();

		for (int i = 0; i < Artefatos.clientes.size(); i++) {

			if (id == Artefatos.clientes.get(i).getId()) {

				System.out.println(Artefatos.clientes.get(i).getNome());
				cliente = Artefatos.clientes.get(i);

			}

		}

		return cliente;
		
	}

}
