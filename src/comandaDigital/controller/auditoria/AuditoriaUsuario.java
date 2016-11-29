package comandaDigital.controller.auditoria;

import java.util.ArrayList;
import java.util.List;

import comandaDigital.model.pessoas.Usuario;
import comandaDigital.model.produto.Produto;
import comandaDigital.view.usuarios.MenuUsuario;
import interfaces.hibernate.IMensagemPadraoHibernate;
import interfaces.mensagens.IMensagemErro;
import interfaces.mensagens.IMensagemGeral;
import interfaces.padroes.IMenuCrudPadr�o;
import localStorage.Artefatos;
import util.GerarId;

/**
 * 
 * @author whesl
 *
 */

public class AuditoriaUsuario extends FactoryConnections implements IMenuCrudPadr�o{
	
	private static AuditoriaUsuario instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance.
	 * 
	 * @return
	 */
	private static AuditoriaUsuario getIntance() {
		return instance;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo instance.
	 * 
	 * @param aInstance
	 */
	private static void setInstance(AuditoriaUsuario aInstance) {
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
	public static AuditoriaUsuario getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaUsuario());
		}

		return getIntance();

	}
	
	/**
	 * 
	 * M�todo auditaObjeto fica como respons�vel em instanciar o menu solicitado pelo
	 * usu�rio, podendo este menu ser o MenuInsereUsuario, MenuDeletaUsuario ou 
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
	 * M�todo insereObjeto realizar� a inclus�o de um novo Usu�rio na lista usuarios.
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
	 * M�todo alteraObjeto ser� respons�vel em alterar um usuario cujo ID j� exista na 
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
	 * M�todo removeObjeto ser� respons�vel em remover um determinado usuario cujo ID j�
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
	 * M�todo listarObjeto ser� respons�vel em listar todos os Usu�rios que estejam 
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
	 * M�todo getObject ser� respons�vel em retornar um usuario cujo ID exista na 
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
