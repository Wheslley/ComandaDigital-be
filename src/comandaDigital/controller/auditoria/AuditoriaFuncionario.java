package comandaDigital.controller.auditoria;

import java.util.ArrayList;
import java.util.List;

import comandaDigital.model.pessoas.Funcionario;
import comandaDigital.model.produto.Produto;
import comandaDigital.view.funcionario.MenuFuncionario;
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

public class AuditoriaFuncionario extends FactoryConnections implements IMenuCrudPadr�o{
	
	private static AuditoriaFuncionario instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance.
	 * 
	 * @return
	 */
	private static AuditoriaFuncionario getIntance() {
		return instance;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo instance.
	 * 
	 * @param aInstance
	 */
	private static void setInstance(AuditoriaFuncionario aInstance) {
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
	public static AuditoriaFuncionario getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaFuncionario());
		}

		return getIntance();

	}

	/**
	 * 
	 * M�todo auditaObjeto fica como respons�vel em instanciar o menu solicitado pelo
	 * usu�rio, podendo este menu ser o MenuInsereFuncionario, MenuDeletaFuncionario ou 
	 * MenuAlteracaoFuncionario.
	 * 
	 * @param opcaoMenu
	 * 
	 */
	@Override
	public void validaMenu(int opcaoMenu) {
		
		switch (opcaoMenu) {

			case 1: {
	
				MenuFuncionario.getInstance().getMenuInsereFuncionario();
				break;
	
			}
	
			case 2: {
	
				MenuFuncionario.getInstance().getMenuDeletaFuncionario();
				break;
	
			}
			
			case 3: {
				
				MenuFuncionario.getInstance().getMenuAlteracaoFuncionario();
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
	 * M�todo insereObjeto realizar� a inclus�o de um novo Funcionario na lista funcionarios.
	 * 
	 * @param object
	 * 
	 */
	@Override
	public void insereObjeto(Object object) {

		try {
			this.insert((Funcionario) object, IMensagemPadraoHibernate.HIBERNATE_PERSISTENCE_INIT_MYSQL);
		} catch (Exception ex) {
			System.err.println(IMensagemErro.ERRO_SALVAR_OBJETO + ex.getMessage());
		}
		
	}

	/**
	 * 
	 * M�todo alteraObjeto ser� respons�vel em alterar um funcion�rio cujo ID j� exista na 
	 * base de Funcionarios.
	 * 
	 * @param object
	 * 
	 */
	@Override
	public void alteraObjeto(Object object) {
		
		try {
			this.update((Funcionario) object, IMensagemPadraoHibernate.HIBERNATE_PERSISTENCE_INIT_MYSQL);
		} catch (Exception ex) {
			System.err.println(IMensagemErro.ERRO_EDITAR_OBJETO + ex.getMessage());
		}
		
	}

	/**
	 * 
	 * M�todo removeObjeto ser� respons�vel em remover um determinado funcion�rio cujo ID j�
	 * exista na base de Funcionario.
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
	 * 
	 * M�todo listarObjeto ser� respons�vel em listar todos os Funcionarios que estejam 
	 * na lista funcionarios.
	 * 
	 */
	@Override
	public List<Object> getTodosObjetos() {
		
		List<Object> listaObjetos = new ArrayList<>();
		String strQuery = "select u from Funcionario u";
		
		try {
			listaObjetos = this.selectObjects(strQuery, IMensagemPadraoHibernate.HIBERNATE_PERSISTENCE_INIT_MYSQL);
			for(Object o : listaObjetos){
				Funcionario f = (Funcionario) o;
				System.out.println(f.toString());
			}
		} catch (Exception ex) {
			System.err.println(IMensagemErro.ERRO_SELECIONAR_TODOS_OBJETO + ex.getMessage());
		}
		
		return listaObjetos;
		
	}

	/**
	 * 
	 * M�todo getObject ser� respons�vel em retornar um funcionario cujo ID exista na 
	 * base Funcionarios. 
	 * 
	 * @param id
	 * 
	 */
	@Override
	public Object getObject(int id) {

		Object object = null;
		String strQuery = "select u from Funcionario u where u.id = " + id;
		
		try {
			object = this.selectObjects(strQuery, IMensagemPadraoHibernate.HIBERNATE_PERSISTENCE_INIT_MYSQL);
			Funcionario f = (Funcionario) object;
			System.out.println(f.toString());
		} catch (Exception ex) {
			System.err.println(IMensagemErro.ERRO_SELECIONAR_OBJETO + ex.getMessage());
		}
		
		return object;
		
	}

}
