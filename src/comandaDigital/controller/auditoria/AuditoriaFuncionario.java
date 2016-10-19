package comandaDigital.controller.auditoria;

import interfaces.padroes.IMenuCrudPadrão;

public class AuditoriaFuncionario implements IMenuCrudPadrão{
	
	private static AuditoriaFuncionario instance;

	private static AuditoriaFuncionario getIntance() {
		return instance;
	}

	private static void setInstance(AuditoriaFuncionario aInstance) {
		instance = aInstance;
	}

	public static AuditoriaFuncionario getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaFuncionario());
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
