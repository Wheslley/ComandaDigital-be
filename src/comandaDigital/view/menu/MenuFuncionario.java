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
		int opcaoMenuFuncionário = 0;
		boolean flagMenuFuncionario = true;
		boolean flagMenu = true;

		while (flagMenuFuncionario) {

			System.out.println("************************************");
			System.out.println("*	     Menu Funcionario	       *");
			System.out.println("************************************");
			System.out.println("*  1) Clientes            *");
			System.out.println("*  2) Comanda Digital     *");
			System.out.println("*  3) Relatórios          *");
			System.out.println("*  4) Estoque             *");
			System.out.println("*  0) Sair                *");
			System.out.println("************************************\n\n");
			
			while (flagMenu) {
				
				System.out.println("Digite a opção desejada ou digite [0] para sair: ");
				opcaoMenuFuncionário = scan.nextInt();
				
				if (opcaoMenuFuncionário > 0 && opcaoMenuFuncionário < 5) {
					
					flagMenu = false;
					flagMenuFuncionario = false;
					
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
