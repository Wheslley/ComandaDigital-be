package comandaDigital.view.menu;

import java.util.Scanner;

public class MenuGerente {
	
	private static MenuGerente instance;

    private static MenuGerente getIntance() {
        return instance;
    }

    private static void setInstance(MenuGerente aInstance) {
        instance = aInstance;
    }

    public static MenuGerente getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuGerente());
        }

        return getIntance();

    }
    
    public void getMenuGerente() {

		Scanner scan = new Scanner(System.in);
		int opcaoMenuGerente = 0;
		boolean flagMenuGerente = true;
		boolean flagMenu = true;

		while (flagMenuGerente) {

			System.out.println("************************************");
			System.out.println("*	     Menu Gerente	     *");
			System.out.println("************************************");
			System.out.println("*  1) Clientes            *");
			System.out.println("*  2) Funcionários        *");
			System.out.println("*  3) Comanda Digital     *");
			System.out.println("*  4) Relatórios          *");
			System.out.println("*  5) Estoque             *");
			System.out.println("*  0) Sair                *");
			System.out.println("************************************\n\n");
			
			while (flagMenu) {
				
				System.out.println("Digite a opção desejada ou digite [0] para sair: ");
				opcaoMenuGerente = scan.nextInt();
				
				if (opcaoMenuGerente > 0 && opcaoMenuGerente < 6) {
					
					flagMenu = false;
					flagMenuGerente = false;
					
				} else if (opcaoMenuGerente == 0) {
					
					flagMenu = false;
					flagMenuGerente = false;
					
				} else {
					
					flagMenu = true;
					
				}
				
			}
			
		}

	}
    
}
