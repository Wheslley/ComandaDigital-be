package interfaces.padroes;

import java.util.List;

/**
 * 
 * Interface IMenuCrudPadrão será responsável em fornecer os métodos para as classes
 * que necessitar inserir, alterar e remover algum objeto.
 * 
 * @author whesl
 *
 */

public interface IMenuCrudPadrão {
	
	public void validaMenu (int opcaoMenu);
	public void insereObjeto (Object object);
	public void alteraObjeto (Object object);
	public void removeObjeto (int id);
	public List<Object> getTodosObjetos ();
	public Object getObject (int id);
	
	
}
