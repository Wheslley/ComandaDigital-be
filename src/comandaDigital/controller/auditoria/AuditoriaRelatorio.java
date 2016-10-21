package comandaDigital.controller.auditoria;

import interfaces.padroes.IMenuCrudPadrão;

/**
 * 
 * @author whesl
 *
 */

public class AuditoriaRelatorio implements IMenuCrudPadrão{
	
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

	@Override
	public void auditaObjeto(int opcaoMenu) {
		// TODO Auto-generated method stub
		
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
