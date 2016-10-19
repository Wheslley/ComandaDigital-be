package comandaDigital.controller.menu;

import comandaDigital.view.cliente.MenuCliente;
import comandaDigital.view.funcionario.MenuFuncionario;

/**
 * 
 * @author whesl
 *
 */

public class ValidaMenuUsuarioMaster {

	private static ValidaMenuUsuarioMaster instance;

    private static ValidaMenuUsuarioMaster getIntance() {
        return instance;
    }

    private static void setInstance(ValidaMenuUsuarioMaster aInstance) {
        instance = aInstance;
    }

    public static ValidaMenuUsuarioMaster getInstance() {

        if (getIntance() == null) {
            setInstance(new ValidaMenuUsuarioMaster());
        }

        return getIntance();

    }
    
    public void opcaoMenuUsarioMaster(int opcaoMenu){
    	
    	switch (opcaoMenu) {

			case 1: {
	
				MenuCliente.getInstance().getMenuCliente();
				break;
	
			}
			
			case 2: {
				
				MenuFuncionario.getInstance().getMenuFuncionario();
				break;
	
			}
	
			default: {
	
				break;
	
			}

    	}
    	
    }
    
}
