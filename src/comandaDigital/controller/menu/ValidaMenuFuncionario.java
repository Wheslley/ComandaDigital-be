package comandaDigital.controller.menu;

import comandaDigital.view.clientes.MenuCliente;

/**
 * 
 * @author whesl
 *
 */

public class ValidaMenuFuncionario {

	private static ValidaMenuFuncionario instance;

	private static ValidaMenuFuncionario getIntance() {
		return instance;
	}

	private static void setInstance(ValidaMenuFuncionario aInstance) {
		instance = aInstance;
	}

	public static ValidaMenuFuncionario getInstance() {

		if (getIntance() == null) {
			setInstance(new ValidaMenuFuncionario());
		}

		return getIntance();

	}
	
	public void opcaoMenuFuncionario(int opcaoMenu){
    	
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
