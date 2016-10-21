package comandaDigital.controller.auditoria;

import interfaces.padroes.IMenuCrudPadrão;

/**
 * 
 * @author whesl
 *
 */

public class AuditoriaComandaDigital implements IMenuCrudPadrão{
	
	private static AuditoriaComandaDigital instance;

	private static AuditoriaComandaDigital getIntance() {
		return instance;
	}

	private static void setInstance(AuditoriaComandaDigital aInstance) {
		instance = aInstance;
	}

	public static AuditoriaComandaDigital getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaComandaDigital());
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
