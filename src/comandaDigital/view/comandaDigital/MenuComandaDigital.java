package comandaDigital.view.comandaDigital;

public class MenuComandaDigital {
	
	private static MenuComandaDigital instance;

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
