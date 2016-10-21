package comandaDigital.view.comandaDigital;

import java.util.Scanner;

public class MenuComandaDigital {
	
	private static MenuComandaDigital instance;
	private Scanner scan = new Scanner(System.in);

    private static MenuComandaDigital getIntance() {
        return instance;
    }

    private static void setInstance(MenuComandaDigital aInstance) {
        instance = aInstance;
    }

    public static MenuComandaDigital getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuComandaDigital());
        }

        return getIntance();

    }
    
}
