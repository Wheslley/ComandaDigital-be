package comandaDigital.view.menu;

import java.util.Scanner;

import comandaDigital.controller.menu.ValidaMenuFuncionario;

/**
 * 
 * @author whesl
 *
 */

public class MenuFuncionario {
	
	private static MenuFuncionario instance;

    private static MenuFuncionario getIntance() {
        return instance;
    }

    private static void setInstance(MenuFuncionario aInstance) {
        instance = aInstance;
    }

    public static MenuFuncionario getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuFuncionario());
        }

        return getIntance();

    }
    
    public void getMenuFuncionario() {

		Scanner scan = new Scanner(System.in);
		int opcaoMenuFuncion�rio = 0;
		boolean flagMenuFuncionario = true;
		boolean flagMenu = true;

		while (flagMenuFuncionario) {

			System.out.println("************************************");
			System.out.println("*	     Menu Funcionario	       *");
			System.out.println("************************************");
			System.out.println("*  1) Clientes            *");
			System.out.println("*  2) Comanda Digital     *");
			System.out.println("*  3) Relat�rios          *");
			System.out.println("*  4) Estoque             *");
			System.out.println("*  0) Sair                *");
			System.out.println("************************************\n\n");
			
			while (flagMenu) {
				
				System.out.println("Digite a op��o desejada ou digite [0] para sair: ");
				opcaoMenuFuncion�rio = scan.nextInt();
				
				if (opcaoMenuFuncion�rio > 0 && opcaoMenuFuncion�rio < 5) {
					
					flagMenu = false;
					flagMenuFuncionario = false;
					
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
