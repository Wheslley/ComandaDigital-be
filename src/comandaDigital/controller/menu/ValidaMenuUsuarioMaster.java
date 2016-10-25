package comandaDigital.controller.menu;

import comandaDigital.view.cliente.MenuCliente;
import comandaDigital.view.estabelecimento.MenuMesa;
import comandaDigital.view.estoque.MenuEstoque;
import comandaDigital.view.funcionario.MenuFuncionario;
import comandaDigital.view.produto.MenuProduto;
import comandaDigital.view.usuarios.MenuUsuario;

/**
 * 
 * Classe ValidaMenuUsuarioMaster ser� respons�vel em instanciar o menu solicitado no
 * console pelo Usuario Master.
 * 
 * @author whesl
 *
 */

public class ValidaMenuUsuarioMaster {

	private static ValidaMenuUsuarioMaster instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance.
	 * 
	 * @return
	 */
    private static ValidaMenuUsuarioMaster getIntance() {
        return instance;
    }

    /**
     * 
     * M�todo Setter referente ao atributo instance.
     * 
     * @param aInstance
     */
    private static void setInstance(ValidaMenuUsuarioMaster aInstance) {
        instance = aInstance;
    }

    /**
     * 
     * Caso a variavel instance n�o estiver refer�ncia de nenhum ponto da
	 * mem�ria, associamos a ela um endere�o e instanciamos a pr�pria classe,
	 * transformando-a em uma classe assincr�na.
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
     * M�todo opcaoMenuUsarioMaster ser� respons�vel em verificar a op��o que foi inserida
     * no console da aplica��o e instanciar o menu solicitado pelo usu�rio.
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
