package comandaDigital.controller.menu;

import comandaDigital.view.cliente.MenuCliente;
import comandaDigital.view.comandaDigital.MenuMesa;
import comandaDigital.view.estoque.MenuEstoque;
import comandaDigital.view.funcionario.MenuFuncionario;
import comandaDigital.view.produto.MenuProduto;
import comandaDigital.view.usuarios.MenuUsuario;

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
			
			case 3: {	
				
				MenuUsuario.getInstance().getMenuUsuario();
				break;
	
			}
			
			case 4: {	
				
				MenuMesa.getInstance().getMenuMesa();
				break;
	
			}
			
			case 6: {	
				
				MenuProduto.getInstance().getMenuProduto();
				break;
	
			}
			
			case 7: {	
				
				MenuEstoque.getInstance().getMenuEstoque();
				break;
	
			}
	
			default: {
	
				break;
	
			}

    	}
    	
    }
    
}
