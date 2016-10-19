package interfaces.padroes;

/**
 * 
 * @author whesl
 *
 */

public interface IMenuCrudPadrão {
	
	public void auditaObjeto (int opcaoMenu);
	public void insereObjeto (Object object);
	public void alteraObjeto (Object object);
	public void removeObjeto (int id);
	public void listarObjeto ();
	public Object getObject (int id);
}
