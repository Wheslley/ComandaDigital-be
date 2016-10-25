package comandaDigital.controller.menu;

import comandaDigital.view.cliente.MenuCliente;
import comandaDigital.view.estoque.MenuEstoque;
import comandaDigital.view.funcionario.MenuFuncionario;
import comandaDigital.view.produto.MenuProduto;

/**
 * 
 * Classe ValidaMenuGerente será responsável em instanciar o menu solicitado no
 * console pelo Gerente.
 * 
 * @author whesl
 *
 */

public class ValidaMenuGerente {
	
	private static ValidaMenuGerente instance;

	/**
	 * 
	 * Método Getter referente ao atributo instance.
	 * 
	 * @return
	 */
    private static ValidaMenuGerente getIntance() {
        return instance;
    }

    /**
     * 
     * Método Setter referente ao atributo instance.
     * 
     * @param aInstance
     */
    private static void setInstance(ValidaMenuGerente aInstance) {
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
    public static ValidaMenuGerente getInstance() {

        if (getIntance() == null) {
            setInstance(new ValidaMenuGerente());
        }

        return getIntance();

    }
    
    /**
     * 
     * Método opcaoMenuGerente será responsável em verificar a opção que foi inserida
     * no console da aplicação e instanciar o menu solicitado pelo gerente.
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
