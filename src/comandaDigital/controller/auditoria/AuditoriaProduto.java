package comandaDigital.controller.auditoria;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import comandaDigital.model.produto.Produto;
import comandaDigital.view.produto.MenuProduto;
import interfaces.hibernate.IMensagemPadraoHibernate;
import interfaces.mensagens.IMensagemErro;
import interfaces.padroes.IMenuCrudPadr�o;
import localStorage.Artefatos;
import util.GerarId;

/**
 * 
 * @author whesl
 *
 */

public class AuditoriaProduto extends FactoryConnections implements IMenuCrudPadr�o {

	private static AuditoriaProduto instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance.
	 * 
	 * @return
	 */
	private static AuditoriaProduto getIntance() {
		return instance;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo instance.
	 * 
	 * @param aInstance
	 */
	private static void setInstance(AuditoriaProduto aInstance) {
		instance = aInstance;
	}

	/**
	 * Caso a variavel instance n�o estiver refer�ncia de nenhum ponto da
	 * mem�ria, associamos a ela um endere�o e instanciamos a pr�pria classe,
	 * transformando-a em uma classe assincr�na.
	 * 
	 * @return
	 */
	public static AuditoriaProduto getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaProduto());
		}

		return getIntance();

	}

	/**
	 * 
	 * M�todo auditaObjeto fica como respons�vel em instanciar o menu solicitado
	 * pelo usu�rio, podendo este menu ser o MenuInsereProduto,
	 * MenuDeletaProduto ou MenuAlteracaoProduto.
	 * 
	 * @param opcaoMenu
	 * 
	 */
	@Override
	public void validaMenu(int opcaoMenu) {

		switch (opcaoMenu) {

			case 1: {
	
				MenuProduto.getInstance().getMenuInsereProduto();
				break;
	
			}
	
			case 2: {
	
				MenuProduto.getInstance().getMenuDeletaProduto();
				break;
	
			}
	
			case 3: {
	
				MenuProduto.getInstance().getMenuAlteracaoProduto();
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
	 * M�todo insereObjeto realizar� a inclus�o de um novo Produto na lista
	 * produtos.
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
	 * M�todo alteraObjeto ser� respons�vel em alterar um produto cujo ID j�
	 * exista na base de produtos.
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
	 * M�todo removeObjeto ser� respons�vel em remover um determinado produto
	 * cujo ID j� exista na base de Produto.
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
	 * M�todo listarObjeto ser� respons�vel em listar todos os Produto que
	 * estejam na lista produtos.
	 */
	@Override
	public List<Object> getTodosObjetos() {
		
		List<Object> listaObjetos = new ArrayList<Object>();
		String strQuery = "select u from Produto u";
		
		try {
			listaObjetos = this.selectObjects(strQuery, IMensagemPadraoHibernate.HIBERNATE_PERSISTENCE_INIT_MYSQL);

			for(Object o : listaObjetos){
				Produto p = (Produto) o;
				System.out.println(p.toString());
			}
		} catch (Exception ex) {
			System.err.println(IMensagemErro.ERRO_SELECIONAR_TODOS_OBJETO + ex.getMessage());
		}
		
		return listaObjetos;
	}

	/**
	 * 
	 * M�todo getObject ser� respons�vel em retornar um produto cujo ID exista
	 * na base produtos.
	 * 
	 * @param id
	 * 
	 */
	@Override
	public Object getObject(int id) {
		
		Object object = null;
		String strQuery = "select u from Produto u where u.idProduto = " + id;
		System.out.println(strQuery);
		try {
			object = this.selectObjects(strQuery, IMensagemPadraoHibernate.HIBERNATE_PERSISTENCE_INIT_MYSQL);
		} catch (Exception ex) {
			System.err.println(IMensagemErro.ERRO_SELECIONAR_OBJETO + ex.getMessage());
		}
		
		return object;
	
	}

}
