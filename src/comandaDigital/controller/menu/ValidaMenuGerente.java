package comandaDigital.controller.menu;

import comandaDigital.view.cliente.MenuCliente;

/**
 * 
 * @author whesl
 *
 */

public class ValidaMenuGerente {
	
	private static ValidaMenuGerente instance;

    private static ValidaMenuGerente getIntance() {
        return instance;
    }

    private static void setInstance(ValidaMenuGerente aInstance) {
        instance = aInstance;
    }

    public static ValidaMenuGerente getInstance() {

        if (getIntance() == null) {
            setInstance(new ValidaMenuGerente());
        }

        return getIntance();

    }
    
    public void opcaoMenuGerente(int opcaoMenu){
    	
    	switch (opcaoMenu) {

			case 1: {
	
				MenuCliente.getInstance().getMenuCliente();
				break;
	
			}
	
			default: {
	
				break;
	
			}

    	}
    	
    }
    
}
