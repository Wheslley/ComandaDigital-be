package comandaDigital.controller.auditoria;

import java.io.IOException;

import comandaDigital.view.relatorio.MenuRelatorio;
import comandaDigital.view.usuarios.MenuUsuario;
import interfaces.padroes.IMenuCrudPadr�o;

/**
 * 
 * @author whesl
 *
 */

public class AuditoriaRelatorio implements IMenuCrudPadr�o{
	
	private static AuditoriaRelatorio instance;

	private static AuditoriaRelatorio getIntance() {
		return instance;
	}

	private static void setInstance(AuditoriaRelatorio aInstance) {
		instance = aInstance;
	}

	public static AuditoriaRelatorio getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaRelatorio());
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
	public void auditaObjeto(int opcaoMenu) {
		
		switch (opcaoMenu) {

			case 1: {
	
				try {
					MenuRelatorio.getInstance().getMenuGeraRelatorio();
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
