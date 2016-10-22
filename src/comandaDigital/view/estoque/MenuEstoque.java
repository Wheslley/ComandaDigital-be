package comandaDigital.view.estoque;

/**
 * 
 * @author whesl
 *
 */
public class MenuEstoque {
	
	private static MenuEstoque instance;

    private static MenuEstoque getIntance() {
        return instance;
    }

    private static void setInstance(MenuEstoque aInstance) {
        instance = aInstance;
    }

    public static MenuEstoque getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuEstoque());
        }

        return getIntance();

    }
    
}
