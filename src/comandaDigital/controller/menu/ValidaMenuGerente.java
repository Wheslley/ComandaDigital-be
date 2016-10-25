package comandaDigital.controller.menu;

import comandaDigital.view.cliente.MenuCliente;
import comandaDigital.view.comandaDigital.MenuMesa;
import comandaDigital.view.estoque.MenuEstoque;
import comandaDigital.view.funcionario.MenuFuncionario;
import comandaDigital.view.produto.MenuProduto;

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
			
			case 2: {
				
				MenuFuncionario.getInstance().getMenuFuncionario();
				break;
	
			}
			
			case 3: {	
				
				MenuMesa.getInstance().getMenuMesa();
				break;
	
			}

			case 5: {	
				
				MenuProduto.getInstance().getMenuProduto();
				break;
	
			}
			
			case 6: {	
				
				MenuEstoque.getInstance().getMenuEstoque();
				break;
	
			}

			default: {
	
				break;
	
			}

    	}
    	
    }
    
}
