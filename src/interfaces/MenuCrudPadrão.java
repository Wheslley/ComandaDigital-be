package interfaces;

/**
 * 
 * @author whesl
 *
 */

public interface MenuCrudPadrão {
	
	public void auditaObjeto (int opcaoMenu);
	public void insereObjeto (Object object);
	public void alteraObjeto (Object object);
	public void removeObjeto (int id);
	public Object getObject (int id);
}
