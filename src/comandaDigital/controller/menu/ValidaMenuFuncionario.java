package comandaDigital.controller.menu;

import comandaDigital.view.cliente.MenuCliente;
import comandaDigital.view.estabelecimento.MenuMesa;
import comandaDigital.view.funcionario.MenuFuncionario;

/**
 * 
 * Classe ValidaMenuFuncionario será responsável em instanciar o menu solicitado no
 * console pelo Funcionário.
 * 
 * @author whesl
 *
 */

public class ValidaMenuFuncionario {

	private static ValidaMenuFuncionario instance;

	/**
	 * 
	 * Método Getter referente ao atributo instance.
	 * 
	 * @return
	 */
	private static ValidaMenuFuncionario getIntance() {
		return instance;
	}

	/**
	 * 
	 * Método Setter referente ao atributo instance.
	 * 
	 * @param aInstance
	 */
	private static void setInstance(ValidaMenuFuncionario aInstance) {
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
	public static ValidaMenuFuncionario getInstance() {

		if (getIntance() == null) {
			setInstance(new ValidaMenuFuncionario());
		}

		return getIntance();

	}
	
	/**
	 * 
	 * Método opcaoMenuFuncionario será responsável em verificar a opção que foi inserida
     * no console da aplicação e instanciar o menu solicitado pelo funcionário.
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
