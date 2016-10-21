package comandaDigital.view.estoque;

import java.util.Scanner;

/**
 * 
 * @author whesl
 *
 */
public class MenuEstoque {
	
	private static MenuEstoque instance;
	private Scanner scan = new Scanner(System.in);

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
