package comandaDigital.view.menuGeral;

import java.util.Scanner;

import comandaDigital.controller.menu.ValidaMenuGerente;

/**
 * 
 * Classe MenuGeralGerente será responsável em exibir todas as opções disponíveis para o login de gerente
 * 
 * @author whesl
 *
 */

public class MenuGeralGerente {
	
	private static MenuGeralGerente instance;
	
	/**
	 * 
	 * Método Getter referente ao atributo instance
	 * 
	 * @return
	 */
    private static MenuGeralGerente getIntance() {
        return instance;
    }
    
    /**
     * 
     * Método Setter referente ao atributo instance
     * 
     * @param aInstance
     */
    private static void setInstance(MenuGeralGerente aInstance) {
        instance = aInstance;
    }
    
    /**
	 * Caso a variavel instance não estiver referência de nenhum ponto da
	 * memória, associamos a ela um endereço e instanciamos a própria classe,
	 * transformando-a em uma classe assincrôna.
	 * 
	 * @author whesl
	 *
	 */
    public static MenuGeralGerente getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuGeralGerente());
        }

        return getIntance();

    }
    
    /**
     * Menu completo contendo todas as opções do MenuGeralGerente
     */
    public void getMenuGerente() {

		Scanner scan = new Scanner(System.in);
		int opcaoMenuGerente = 0;
		boolean flagMenuGerente = true;

		while (flagMenuGerente) {

			boolean flagMenu = true;
			
			System.out.println("************************************");
			System.out.println("*	     Menu Gerente	     *");
			System.out.println("************************************");
			System.out.println("*  1) Clientes            *");
			System.out.println("*  2) Funcionários        *");
			System.out.println("*  3) Mesa			      *");
			System.out.println("*  4) Relatórios          *");
			System.out.println("*  5) Produto             *");
			System.out.println("*  6) Estoque             *");
			System.out.println("*  0) Sair                *");
			System.out.println("************************************\n\n");
			
			while (flagMenu) {

				System.out.println("Digite a opção desejada ou digite [0] para sair: ");
				opcaoMenuGerente = scan.nextInt();
				
				if (opcaoMenuGerente > 0 && opcaoMenuGerente < 7) {
					
					ValidaMenuGerente.getInstance().opcaoMenuGerente(opcaoMenuGerente);
					flagMenu = false;
					
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
