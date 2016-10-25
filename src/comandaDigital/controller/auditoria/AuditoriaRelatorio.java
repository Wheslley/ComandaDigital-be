package comandaDigital.controller.auditoria;

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
