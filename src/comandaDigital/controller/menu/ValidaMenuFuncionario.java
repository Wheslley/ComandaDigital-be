package comandaDigital.controller.menu;

import comandaDigital.view.cliente.MenuCliente;
import comandaDigital.view.estabelecimento.MenuMesa;
import comandaDigital.view.funcionario.MenuFuncionario;

/**
 * 
 * Classe ValidaMenuFuncionario ser� respons�vel em instanciar o menu solicitado no
 * console pelo Funcion�rio.
 * 
 * @author whesl
 *
 */

public class ValidaMenuFuncionario {

	private static ValidaMenuFuncionario instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance.
	 * 
	 * @return
	 */
	private static ValidaMenuFuncionario getIntance() {
		return instance;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo instance.
	 * 
	 * @param aInstance
	 */
	private static void setInstance(ValidaMenuFuncionario aInstance) {
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
	public static ValidaMenuFuncionario getInstance() {

		if (getIntance() == null) {
			setInstance(new ValidaMenuFuncionario());
		}

		return getIntance();

	}
	
	/**
	 * 
	 * M�todo opcaoMenuFuncionario ser� respons�vel em verificar a op��o que foi inserida
     * no console da aplica��o e instanciar o menu solicitado pelo funcion�rio.
	 * 
	 * @param opcaoMenu
	 */
	public void opcaoMenuFuncionario(int opcaoMenu){
    	
    	switch (opcaoMenu) {

			case 1: {
	
				MenuCliente.getInstance().getMenuCliente();
				break;
	
			}
			
			case 2: {
				
				MenuMesa.getInstance().getMenuMesa();
				break;
	
			}
	
			default: {
	
				break;
	
			}

    	}
    	
    }

}
