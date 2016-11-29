package interfaces.padroes;

import java.util.List;

/**
 * 
 * Interface IMenuCrudPadr�o ser� respons�vel em fornecer os m�todos para as classes
 * que necessitar inserir, alterar e remover algum objeto.
 * 
 * @author whesl
 *
 */

public interface IMenuCrudPadr�o {
	
	public void validaMenu (int opcaoMenu);
	public void insereObjeto (Object object);
	public void alteraObjeto (Object object);
	public void removeObjeto (int id);
	public List<Object> getTodosObjetos ();
	public Object getObject (int id);
	
	
}
