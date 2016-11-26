package interfaces.padroes;

import java.util.List;

public interface IHibernateCrudPadrao {
	
	/**
	 * @author whesl
	 * @param Object
	 * @return boolean
	 */
	public boolean save(Object object);
	
	/**
	 * @author whesl
	 * @param Object
	 * @return boolean
	 */
	public boolean update(Object object);
	
	/**
	 * @author whesl
	 * @param Object
	 * @return boolean
	 */
	public boolean delete(Object object);
	
	/**
	 * @author whesl
	 * @param Object
	 * @return Object
	 */
	public Object getObject(Object object);
	
	/**
	 * @author whesl
	 * @param number
	 * @return Object
	 */
	public Object getObject(Integer number);
	
	/**
	 * @author whesl
	 * @param string
	 * @return Object
	 */
	public Object getObject(String string);
	
	/**
	 * @author whesl
	 * @param Object
	 * @return List<Object>
	 */
	public List<Object> getObjects(Object object);
	
	/**
	 * @author whesl
	 * @param number
	 * @return List<Object>
	 */
	public List<Object> getObjects(Integer number);
	
	/**
	 * @author whesl
	 * @param string
	 * @return List<Object>
	 */
	public List<Object> getObjects(String string);
	
}
