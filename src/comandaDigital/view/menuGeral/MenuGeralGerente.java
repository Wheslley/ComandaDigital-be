package comandaDigital.view.menuGeral;

import java.util.Scanner;

import comandaDigital.controller.menu.ValidaMenuGerente;

/**
 * 
 * Classe MenuGeralGerente ser� respons�vel em exibir todas as op��es dispon�veis para o login de gerente
 * 
 * @author whesl
 *
 */

public class MenuGeralGerente {
	
	private static MenuGeralGerente instance;
	
	/**
	 * 
	 * M�todo Getter referente ao atributo instance
	 * 
	 * @return
	 */
    private static MenuGeralGerente getIntance() {
        return instance;
    }
    
    /**
     * 
     * M�todo Setter referente ao atributo instance
     * 
     * @param aInstance
     */
    private static void setInstance(MenuGeralGerente aInstance) {
        instance = aInstance;
    }
    
    /**
	 * Caso a variavel instance n�o estiver refer�ncia de nenhum ponto da
	 * mem�ria, associamos a ela um endere�o e instanciamos a pr�pria classe,
	 * transformando-a em uma classe assincr�na.
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
     * Menu completo contendo todas as op��es do MenuGeralGerente
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
			System.out.println("*  2) Funcion�rios        *");
			System.out.println("*  3) Mesa			      *");
			System.out.println("*  4) Relat�rios          *");
			System.out.println("*  5) Produto             *");
			System.out.println("*  6) Estoque             *");
			System.out.println("*  0) Sair                *");
			System.out.println("************************************\n\n");
			
			while (flagMenu) {

				System.out.println("Digite a op��o desejada ou digite [0] para sair: ");
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
