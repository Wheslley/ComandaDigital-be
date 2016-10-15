package Sistema;

import comandaDigital.view.menu.MenuLogin;

/**
 * 
 * @author whesl
 *
 */

public class Principal {

	public static void main(String[] args) {
		
		boolean login = MenuLogin.getInstance().getMenuLogin();
		
		if(login){
			System.out.println("Bem vindo ao SITEMA COMANDA DIGITAL - WHEENY SOLUTION TECNOLOGY");
		}
		
	}

}
