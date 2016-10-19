package comandaDigital.controller.auditoria;

import comandaDigital.model.iMensagens.IMensagemGeral;
import comandaDigital.model.pessoas.Cliente;
import comandaDigital.view.cliente.MenuCliente;
import interfaces.MenuCrudPadrão;
import localStorage.Artefatos;

public class AuditoriaCliente implements MenuCrudPadrão {

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
	
			default: {
	
				MenuCliente.getInstance().getMenuAlteracaoCliente();
				break;
	
			}

		}
		
	}

	@Override
	public void insereObjeto(Object object) {

		Cliente cliente = (Cliente) object;
		
		cliente.setId(geraId());
		cliente.setNumeroCliente(geraIdCliente());

		Artefatos.clientes.add(cliente);

		System.out.println(IMensagemGeral.CLIENTE_INSERIDO_SUCESSO);
		
	}

	@Override
	public void alteraObjeto(Object object) {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		for (int i = 0; i < Artefatos.clientes.size(); i++) {

			if (Artefatos.clientes.get(i).getId() == id) {

				Artefatos.clientes.remove(i);

			}
		}

		System.out.println(IMensagemGeral.CLIENTE_DELETADO_SUCESSO);
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
	
	public int geraId() {

		int id = 0;

		if (Artefatos.clientes.size() == 0) {
			return 100;
		} else {
			for (int i = 0; i < Artefatos.clientes.size(); i++) {

				if (id < Artefatos.clientes.get(i).getId()) {

					id = Artefatos.clientes.get(i).getId();

				}

			}

			return ++id;
		}
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

}
