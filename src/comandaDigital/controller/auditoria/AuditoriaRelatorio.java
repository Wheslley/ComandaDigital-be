package comandaDigital.controller.auditoria;

import java.io.IOException;

import comandaDigital.view.relatorio.MenuRelatorio;
import interfaces.padroes.IMenuCrudPadr�o;

/**
 * 
 * @author whesl
 *
 */

public class AuditoriaRelatorio implements IMenuCrudPadr�o{
	
	private static AuditoriaRelatorio instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance.
	 * 
	 * @return
	 */
	private static AuditoriaRelatorio getIntance() {
		return instance;
	}

    /**
     * 
     * M�todo Setter referente ao atributo instance.
     * 
     * @param aInstance
     */
	private static void setInstance(AuditoriaRelatorio aInstance) {
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
	public static AuditoriaRelatorio getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaRelatorio());
		}

		return getIntance();

	}

	/**
	 * 
	 * M�todo auditaObjeto fica como respons�vel em instanciar o menu solicitado pelo
	 * usu�rio, podendo este menu ser o MenuRelatorioProduto, MenuRelatorioEstoque, 
	 * MenuRelatorioVendas ou MenuRelatorioTodos.
	 * 
	 * @param opcaoMenu
	 * 
	 */
	@Override
	public void auditaObjeto(int opcaoMenu) {

		switch (opcaoMenu) {

			case 1: {
	
				try {
					MenuRelatorio.getInstance().getMenuRelatorioProduto();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
	
			}
	
			case 2: {
	
				try {
					MenuRelatorio.getInstance().getMenuRelatorioEstoque();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
	
			}
			
			case 3: {
				
				try {
					MenuRelatorio.getInstance().getMenuRelatorioMesasFechadas();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alteraObjeto(Object object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObjeto(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listarObjeto() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getObject(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
