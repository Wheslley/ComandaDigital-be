package comandaDigital.view.menuGeral;

import java.util.Scanner;

import comandaDigital.controller.menu.ValidaMenuUsuarioMaster;

/**
 * 
 * Classe MenuGeralUsuarioMaster será responsável em exibir todas as opções disponíveis para o login de usuário master
 * 
 * @author whesl
 *
 */

public class MenuGeralUsuarioMaster {

	private static MenuGeralUsuarioMaster instance;

	/**
	 * 
	 * Método Getter referente ao atributo instance
	 * 
	 * @return
	 */
	private static MenuGeralUsuarioMaster getIntance() {
		return instance;
	}

	/**
	 * 
	 * Método Setter referente ao atributo instance
	 * 
	 * @param aInstance
	 */
	private static void setInstance(MenuGeralUsuarioMaster aInstance) {
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
	public static MenuGeralUsuarioMaster getInstance() {

		if (getIntance() == null) {
			setInstance(new MenuGeralUsuarioMaster());
		}

		return getIntance();

	}

	/**
	 * Menu completo contendo todas as opções do MenuGeralUsuarioMaster
	 */
	public void getMenuUsuarioMaster() {

		Scanner scan = new Scanner(System.in);
		int opcaoMenuUsuarioMaster = 0;
		boolean flagMenuUsuarioMaster = true;

		while (flagMenuUsuarioMaster) {

			boolean flagMenu = true;

			System.out.println("************************************");
			System.out.println("*	 Menu Usuário Master   *");
			System.out.println("************************************");
			System.out.println("*  1) Clientes            *");
			System.out.println("*  2) Funcionários        *");
			System.out.println("*  3) Usuárioas           *");
			System.out.println("*  4) Mesa                *");
			System.out.println("*  5) Relatórios          *");
			System.out.println("*  6) Produto             *");
			System.out.println("*  7) Estoque             *");
			System.out.println("*  0) Sair                *");
			System.out.println("************************************\n\n");

			while (flagMenu) {

				System.out.println("Digite a opção desejada ou digite [0] para sair: ");
				opcaoMenuUsuarioMaster = scan.nextInt();

				if (opcaoMenuUsuarioMaster > 0 && opcaoMenuUsuarioMaster < 8) {

					ValidaMenuUsuarioMaster.getInstance().opcaoMenuUsarioMaster(opcaoMenuUsuarioMaster);
					flagMenu = false;

				} else if (opcaoMenuUsuarioMaster == 0) {

					flagMenu = false;
					flagMenuUsuarioMaster = false;

				} else {

					flagMenu = true;

				}

			}

		}
		
	}

}
