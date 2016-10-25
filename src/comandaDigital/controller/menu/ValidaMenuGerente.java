package comandaDigital.controller.menu;

import comandaDigital.view.cliente.MenuCliente;
import comandaDigital.view.estoque.MenuEstoque;
import comandaDigital.view.funcionario.MenuFuncionario;
import comandaDigital.view.produto.MenuProduto;

/**
 * 
 * Classe ValidaMenuGerente ser� respons�vel em instanciar o menu solicitado no
 * console pelo Gerente.
 * 
 * @author whesl
 *
 */

public class ValidaMenuGerente {
	
	private static ValidaMenuGerente instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance.
	 * 
	 * @return
	 */
    private static ValidaMenuGerente getIntance() {
        return instance;
    }

    /**
     * 
     * M�todo Setter referente ao atributo instance.
     * 
     * @param aInstance
     */
    private static void setInstance(ValidaMenuGerente aInstance) {
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
    public static ValidaMenuGerente getInstance() {

        if (getIntance() == null) {
            setInstance(new ValidaMenuGerente());
        }

        return getIntance();

    }
    
    /**
     * 
     * M�todo opcaoMenuGerente ser� respons�vel em verificar a op��o que foi inserida
     * no console da aplica��o e instanciar o menu solicitado pelo gerente.
     * 
     * @param opcaoMenu
     */
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
