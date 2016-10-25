package comandaDigital.controller.auditoria;

import java.io.IOException;

import comandaDigital.view.relatorio.MenuRelatorio;
import interfaces.padroes.IMenuCrudPadrão;

/**
 * 
 * @author whesl
 *
 */

public class AuditoriaRelatorio implements IMenuCrudPadrão{
	
	private static AuditoriaRelatorio instance;

	/**
	 * 
	 * Método Getter referente ao atributo instance.
	 * 
	 * @return
	 */
	private static AuditoriaRelatorio getIntance() {
		return instance;
	}

    /**
     * 
     * Método Setter referente ao atributo instance.
     * 
     * @param aInstance
     */
	private static void setInstance(AuditoriaRelatorio aInstance) {
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
	public static AuditoriaRelatorio getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaRelatorio());
		}

		return getIntance();

	}

	/**
	 * 
	 * Método auditaObjeto fica como responsável em instanciar o menu solicitado pelo
	 * usuário, podendo este menu ser o MenuRelatorioProduto, MenuRelatorioEstoque, 
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
