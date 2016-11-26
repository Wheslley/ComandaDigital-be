package comandaDigital.controller.auditoria;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import comandaDigital.model.produto.Produto;
import comandaDigital.view.produto.MenuProduto;
import interfaces.padroes.IMenuCrudPadr�o;

/**
 * 
 * @author whesl
 *
 */

public class AuditoriaProduto implements IMenuCrudPadr�o {

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
	 * M�todo auditaObjeto fica como respons�vel em instanciar o menu solicitado pelo
	 * usu�rio, podendo este menu ser o MenuInsereProduto, MenuDeletaProduto ou 
	 * MenuAlteracaoProduto.
	 * 
	 * @param opcaoMenu
	 * 
	 */
	@Override
	public void auditaObjeto(int opcaoMenu) {

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
	
				listarObjeto();
				break;
	
			}

		}

	}

	/**
	 * 
	 * M�todo insereObjeto realizar� a inclus�o de um novo Produto na lista produtos.
	 * 
	 * @param object
	 * 
	 */
	@Override
	public void insereObjeto(Object object) {
		
		Produto produto = (Produto) object;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("comanda-digital");

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.persist(produto);
		
		em.getTransaction().commit();
		em.close();

	}

	/**
	 * 
	 * M�todo alteraObjeto ser� respons�vel em alterar um produto cujo ID j� exista na 
	 * base de produtos.
	 * 
	 * @param object
	 * 
	 */
	@Override
	public void alteraObjeto(Object object) {

		Produto produto = (Produto) object;
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("comanda-digital");

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.merge(produto);
		
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

	/**
	 * 
	 * M�todo removeObjeto ser� respons�vel em remover um determinado produto cujo ID j�
	 * exista na base de Produto.
	 * 
	 * @param id
	 * 
	 */
	@Override
	public void removeObjeto(int id) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("comanda-digital");

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		em.remove(em.getReference(Produto.class, id));
		
		em.getTransaction().commit();
		em.close();
		emf.close();
		
	}

	/**
	 * M�todo listarObjeto ser� respons�vel em listar todos os Produto que estejam 
	 * na lista produtos.
	 */
	@Override
	public void listarObjeto() {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("comanda-digital");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		Query query = em.createQuery("select u from Produto u");
		
		@SuppressWarnings("unchecked")
		List<Produto> produtos = query.getResultList();
		
		for (Produto prod : produtos) {
			System.out.println(prod.toString());
		}
		
		tx.commit();
		
	}
	
	/**
	 * 
	 * M�todo listarProdutoItemComandaDigital ser� respons�vel 
	 * em retornar todos os produtos que esteja inserido na lista produtos  
	 * 
	 */
	public void listarProdutoItemComandaDigital(){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("comanda-digital");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		Query query = em.createQuery("select u from Produto u");
		
		@SuppressWarnings("unchecked")
		List<Produto> produtos = query.getResultList();
		
		for (Produto prod : produtos) {
			System.out.println("PRODUTO: ID: [" + prod.getIdProduto() + "] - NOME: [" + prod.getNome() + "]");
		}
		
		tx.commit();
		
	}

	/**
	 * 
	 * M�todo getObject ser� respons�vel em retornar um produto cujo ID exista na 
	 * base produtos. 
	 * 
	 * @param id
	 * 
	 */
	@Override
	public Object getObject(int id) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("comanda-digital");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		
		Query query = em.createQuery("select u from Produto u where u.idProduto = " + id);
		
		Produto produto = (Produto) query.getSingleResult();
		
		tx.commit();

		return produto;
		
	}

}
