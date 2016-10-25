package comandaDigital.view.menuGeral;

import java.util.Scanner;

import comandaDigital.controller.menu.ValidaMenuFuncionario;

/**
 * 
 * Classe MenuGeralFuncionario será responsável em exibir todas as opções disponíveis para o login de funcionário
 * 
 * @author whesl
 *
 */

public class MenuGeralFuncionario {
	
	private static MenuGeralFuncionario instance;

	/**
	 * 
	 * Método Getter referente ao atributo instance
	 * 
	 * @return
	 */
    private static MenuGeralFuncionario getIntance() {
        return instance;
    }

    /**
     * 
     * Método Setter referente ao atributo instance
     * 
     * @param aInstance
     */
    private static void setInstance(MenuGeralFuncionario aInstance) {
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
    public static MenuGeralFuncionario getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuGeralFuncionario());
        }

        return getIntance();

    }
    
    /**
     * Menu completo contendo todas as opções do MenuGeralFuncionario
     */
    public void getMenuFuncionario() {

		Scanner scan = new Scanner(System.in);
		int opcaoMenuFuncionário = 0;
		boolean flagMenuFuncionario = true;

		while (flagMenuFuncionario) {

			boolean flagMenu = true;
			
			System.out.println("************************************");
			System.out.println("*	     Menu Funcionario	       *");
			System.out.println("************************************");
			System.out.println("*  1) Clientes            *");
			System.out.println("*  2) Mesa                *");
			System.out.println("*  3) Relatórios          *");
			System.out.println("*  0) Sair                *");
			System.out.println("************************************\n\n");
			
			while (flagMenu) {

				System.out.println("Digite a opção desejada ou digite [0] para sair: ");
				opcaoMenuFuncionário = scan.nextInt();
				
				if (opcaoMenuFuncionário > 0 && opcaoMenuFuncionário < 4) {
					
					ValidaMenuFuncionario.getInstance().opcaoMenuFuncionario(opcaoMenuFuncionário);
					flagMenu = false;
					
				} else if (opcaoMenuFuncionário == 0) {
					
					flagMenu = false;
					flagMenuFuncionario = false;
					
				} else {
					
					flagMenu = true;
					
				}
				
			}

		}
		
	}
    
}
