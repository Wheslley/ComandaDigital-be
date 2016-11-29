package comandaDigital.controller.auditoria;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import comandaDigital.model.produto.Produto;
import interfaces.padroes.IHibernateCrudPadrao;

/**
 * 
 * @author whesl
 *
 */
public class FactoryConnections implements IHibernateCrudPadrao {

	public static EntityManagerFactory entityManagerFactory;
	public static EntityManager entityManager;

	public boolean insert(Object object, String strPersistence) {

		try {

			entityManagerFactory = Persistence.createEntityManagerFactory(strPersistence);
			entityManager = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(object);

		} catch (Exception ex) {

			return false;

		} finally {

			entityManager.getTransaction().commit();
			entityManager.close();
			entityManagerFactory.close();

		}

		return true;

	}

	@Override
	public boolean update(Object object, String strPersistence) {

		try {

			entityManagerFactory = Persistence.createEntityManagerFactory(strPersistence);
			entityManager = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			entityManager.merge(object);

		} catch (Exception ex) {

			return false;

		} finally {

			entityManager.getTransaction().commit();
			entityManager.close();
			entityManagerFactory.close();

		}

		return true;
	}

	@Override
	public boolean delete(Integer number, String strPersistence) {

		try {

			entityManagerFactory = Persistence.createEntityManagerFactory(strPersistence);
			entityManager = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			entityManager.remove(entityManager.getReference(Produto.class, number));

		} catch (Exception ex) {

			return false;

		} finally {

			entityManager.getTransaction().commit();
			entityManager.close();
			entityManagerFactory.close();

		}

		return true;
	}

	@Override
	public Object selectObject(String strQuery, String strPersistence) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory(strPersistence);
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();

		Query query = em.createQuery(strQuery);

		Object objeto = query.getSingleResult();

		tx.commit();

		return objeto;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Object> selectObjects(String strQuery, String strPersistence) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory(strPersistence);
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();

		tx.begin();

		Query query = em.createQuery(strQuery);

		List<Object> objetos = query.getResultList();

		tx.commit();

		return objetos;
	}

}
