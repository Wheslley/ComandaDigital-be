package comandaDigital.controller.menu;

import comandaDigital.view.cliente.MenuCliente;
import comandaDigital.view.estabelecimento.MenuMesa;
import comandaDigital.view.estoque.MenuEstoque;
import comandaDigital.view.funcionario.MenuFuncionario;
import comandaDigital.view.produto.MenuProduto;
import comandaDigital.view.usuarios.MenuUsuario;

/**
 * 
 * Classe ValidaMenuUsuarioMaster será responsável em instanciar o menu solicitado no
 * console pelo Usuario Master.
 * 
 * @author whesl
 *
 */

public class ValidaMenuUsuarioMaster {

	private static ValidaMenuUsuarioMaster instance;

	/**
	 * 
	 * Método Getter referente ao atributo instance.
	 * 
	 * @return
	 */
    private static ValidaMenuUsuarioMaster getIntance() {
        return instance;
    }

    /**
     * 
     * Método Setter referente ao atributo instance.
     * 
     * @param aInstance
     */
    private static void setInstance(ValidaMenuUsuarioMaster aInstance) {
        instance = aInstance;
    }

    /**
     * 
     * Caso a variavel instance não estiver referência de nenhum ponto da
	 * memória, associamos a ela um endereço e instanciamos a própria classe,
	 * transformando-a em uma classe assincrôna.
     * 
     * @return
     */
    public static ValidaMenuUsuarioMaster getInstance() {

        if (getIntance() == null) {
            setInstance(new ValidaMenuUsuarioMaster());
        }

        return getIntance();

    }
    
    /**
     * 
     * Método opcaoMenuUsarioMaster será responsável em verificar a opção que foi inserida
     * no console da aplicação e instanciar o menu solicitado pelo usuário.
     * 
     * @param opcaoMenu
     */
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
