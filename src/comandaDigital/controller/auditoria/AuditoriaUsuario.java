package comandaDigital.controller.auditoria;

import java.util.ArrayList;
import java.util.List;

import comandaDigital.model.pessoas.Usuario;
import comandaDigital.model.produto.Produto;
import comandaDigital.view.usuarios.MenuUsuario;
import interfaces.hibernate.IMensagemPadraoHibernate;
import interfaces.mensagens.IMensagemErro;
import interfaces.mensagens.IMensagemGeral;
import interfaces.padroes.IMenuCrudPadrão;
import localStorage.Artefatos;
import util.GerarId;

/**
 * 
 * @author whesl
 *
 */

public class AuditoriaUsuario extends FactoryConnections implements IMenuCrudPadrão{
	
	private static AuditoriaUsuario instance;

	/**
	 * 
	 * Método Getter referente ao atributo instance.
	 * 
	 * @return
	 */
	private static AuditoriaUsuario getIntance() {
		return instance;
	}

	/**
	 * 
	 * Método Setter referente ao atributo instance.
	 * 
	 * @param aInstance
	 */
	private static void setInstance(AuditoriaUsuario aInstance) {
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
	public static AuditoriaUsuario getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaUsuario());
		}

		return getIntance();

	}
	
	/**
	 * 
	 * Método auditaObjeto fica como responsável em instanciar o menu solicitado pelo
	 * usuário, podendo este menu ser o MenuInsereUsuario, MenuDeletaUsuario ou 
	 * MenuAlteracaoUsuario.
	 * 
	 * @param opcaoMenu
	 * 
	 */
	@Override
	public void validaMenu(int opcaoMenu) {
		
		switch (opcaoMenu) {

			case 1: {
	
				MenuUsuario.getInstance().getMenuInsereUsuario();
				break;
	
			}
	
			case 2: {
	
				MenuUsuario.getInstance().getMenuDeletaUsuario();
				break;
	
			}
			
			case 3: {
				
				MenuUsuario.getInstance().getMenuAlteracaoUsuario();
				break;
	
			}
	
			default: {
	
				List<Object> object = getTodosObjetos();
				break;
	
			}
	
		}
			
	}

	/**
	 * 
	 * Método insereObjeto realizará a inclusão de um novo Usuário na lista usuarios.
	 * 
	 * @param object
	 * 
	 */
	@Override
	public void insereObjeto(Object object) {
		
		try {
			this.insert((Produto) object, IMensagemPadraoHibernate.HIBERNATE_PERSISTENCE_INIT_MYSQL);
		} catch (Exception ex) {
			System.err.println(IMensagemErro.ERRO_SALVAR_OBJETO + ex.getMessage());
		}
		
	}

	/**
	 * 
	 * Método alteraObjeto será responsável em alterar um usuario cujo ID já exista na 
	 * base de usuarios.
	 * 
	 * @param object
	 * 
	 */
	@Override
	public void alteraObjeto(Object object) {
		
		try {
			this.update((Produto) object, IMensagemPadraoHibernate.HIBERNATE_PERSISTENCE_INIT_MYSQL);
		} catch (Exception ex) {
			System.err.println(IMensagemErro.ERRO_EDITAR_OBJETO + ex.getMessage());
		}
		
	}

	/**
	 * 
	 * Método removeObjeto será responsável em remover um determinado usuario cujo ID já
	 * exista na base de Usuario.
	 * 
	 * @param id
	 * 
	 */
	@Override
	public void removeObjeto(int id) {
		
		try {
			this.delete(id, IMensagemPadraoHibernate.HIBERNATE_PERSISTENCE_INIT_MYSQL);
		} catch (Exception ex) {
			System.err.println(IMensagemErro.ERRO_EDITAR_OBJETO + ex.getMessage());
		}
		
	}

	/**
	 * Método listarObjeto será responsável em listar todos os Usuários que estejam 
	 * na lista usuarios.
	 */
	@Override
	public List<Object> getTodosObjetos() {
		
		List<Object> listaObjetos = new ArrayList<>();
		String strQuery = "select u from Usuario u";
		
		try {
			listaObjetos = this.selectObjects(strQuery, IMensagemPadraoHibernate.HIBERNATE_PERSISTENCE_INIT_MYSQL);
		} catch (Exception ex) {
			System.err.println(IMensagemErro.ERRO_SELECIONAR_TODOS_OBJETO + ex.getMessage());
		}
		
		return listaObjetos;
	}

	/**
	 * 
	 * Método getObject será responsável em retornar um usuario cujo ID exista na 
	 * base usuarios. 
	 * 
	 * @param id
	 * 
	 */
	@Override
	public Object getObject(int id) {

		Object object = null;
		String strQuery = "select u.tipo from Usuario u where u.id_usuario = " + id;
		
		try {
			object = this.selectObject(strQuery, IMensagemPadraoHibernate.HIBERNATE_PERSISTENCE_INIT_MYSQL);	
		} catch (Exception ex) {
			System.err.println(IMensagemErro.ERRO_SELECIONAR_OBJETO + ex.getMessage());
			return null;
		}
		
		return object;
		
	}
	
	public Object getObject(Usuario user) {

		Object object = null;
		String strQuery = "select u.tipo from Usuario u where u.id_usuario = " + user.getLogin() + " and u.senha = " + user.getSenha();
		System.out.println(strQuery);
		try {
			object = this.selectObject(strQuery, IMensagemPadraoHibernate.HIBERNATE_PERSISTENCE_INIT_MYSQL);	
		} catch (Exception ex) {
			System.err.println(IMensagemErro.ERRO_SELECIONAR_OBJETO + ex.getMessage());
			return null;
		}
		
		return object;
		
	}

}
