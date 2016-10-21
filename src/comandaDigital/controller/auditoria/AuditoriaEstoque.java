package comandaDigital.controller.auditoria;

import interfaces.padroes.IMenuCrudPadrão;

/**
 * 
 * @author whesl
 *
 */

public class AuditoriaEstoque implements IMenuCrudPadrão{

	private static AuditoriaEstoque instance;

	private static AuditoriaEstoque getIntance() {
		return instance;
	}

	private static void setInstance(AuditoriaEstoque aInstance) {
		instance = aInstance;
	}

	public static AuditoriaEstoque getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaEstoque());
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
