package comandaDigital.view.menuGeral;

import java.util.Scanner;

import comandaDigital.controller.menu.ValidaMenuFuncionario;

/**
 * 
 * @author whesl
 *
 */

public class MenuGeralFuncionario {
	
	private static MenuGeralFuncionario instance;

    private static MenuGeralFuncionario getIntance() {
        return instance;
    }

    private static void setInstance(MenuGeralFuncionario aInstance) {
        instance = aInstance;
    }

    public static MenuGeralFuncionario getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuGeralFuncionario());
        }

        return getIntance();

    }
    
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
			System.out.println("*  2) Comanda Digital     *");
			System.out.println("*  3) Relatórios          *");
			System.out.println("*  4) Estoque             *");
			System.out.println("*  0) Sair                *");
			System.out.println("************************************\n\n");
			
			while (flagMenu) {
				
				System.out.println("Digite a opção desejada ou digite [0] para sair: ");
				opcaoMenuFuncionário = scan.nextInt();
				
				if (opcaoMenuFuncionário > 0 && opcaoMenuFuncionário < 5) {
					
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
