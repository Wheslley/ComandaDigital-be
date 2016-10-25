package comandaDigital.view.menuGeral;

import java.util.Scanner;

import comandaDigital.controller.menu.ValidaMenuFuncionario;

/**
 * 
 * Classe MenuGeralFuncionario ser� respons�vel em exibir todas as op��es dispon�veis para o login de funcion�rio
 * 
 * @author whesl
 *
 */

public class MenuGeralFuncionario {
	
	private static MenuGeralFuncionario instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance
	 * 
	 * @return
	 */
    private static MenuGeralFuncionario getIntance() {
        return instance;
    }

    /**
     * 
     * M�todo Setter referente ao atributo instance
     * 
     * @param aInstance
     */
    private static void setInstance(MenuGeralFuncionario aInstance) {
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
    public static MenuGeralFuncionario getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuGeralFuncionario());
        }

        return getIntance();

    }
    
    /**
     * Menu completo contendo todas as op��es do MenuGeralFuncionario
     */
    public void getMenuFuncionario() {

		Scanner scan = new Scanner(System.in);
		int opcaoMenuFuncion�rio = 0;
		boolean flagMenuFuncionario = true;

		while (flagMenuFuncionario) {

			boolean flagMenu = true;
			
			System.out.println("************************************");
			System.out.println("*	     Menu Funcionario	       *");
			System.out.println("************************************");
			System.out.println("*  1) Clientes            *");
			System.out.println("*  2) Mesa                *");
			System.out.println("*  3) Relat�rios          *");
			System.out.println("*  0) Sair                *");
			System.out.println("************************************\n\n");
			
			while (flagMenu) {

				System.out.println("Digite a op��o desejada ou digite [0] para sair: ");
				opcaoMenuFuncion�rio = scan.nextInt();
				
				if (opcaoMenuFuncion�rio > 0 && opcaoMenuFuncion�rio < 4) {
					
					ValidaMenuFuncionario.getInstance().opcaoMenuFuncionario(opcaoMenuFuncion�rio);
					flagMenu = false;
					
				} else if (opcaoMenuFuncion�rio == 0) {
					
					flagMenu = false;
					flagMenuFuncionario = false;
					
				} else {
					
					flagMenu = true;
					
				}
				
			}

		}
		
	}
    
}
