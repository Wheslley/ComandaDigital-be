package interfaces.padroes;

import java.util.List;

public interface IHibernateCrudPadrao {
	
	/**
	 * @author whesl
	 * @param Object
	 * @return boolean
	 */
	public boolean insert(Object object, String strPersistence);
	
	/**
	 * @author whesl
	 * @param Object
	 * @return boolean
	 */
	public boolean update(Object object, String strPersistence);
	
	/**
	 * @author whesl
	 * @param Object
	 * @return boolean
	 */
	public boolean delete(Integer number, String strPersistence);
	
	/**
	 * @author whesl
	 * @param number
	 * @return Object
	 */
	public Object selectObject(String strQuery, String strPersistence);
	
	/**
	 * @author whesl
	 * @param Object
	 * @return List<Object>
	 */
	public List<Object> selectObjects(String strQuery, String strPersistence);
	
}
