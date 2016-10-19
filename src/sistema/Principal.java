package sistema;

import comandaDigital.view.login.MenuLogin;
import localStorage.Artefatos;

/**
 * Classe com o objetivo de chamar a view responsável pela lógica do Sitema
 * Digital - Pronpt Comando (terminal)
 * 
 * @author whesl
 */

public class Principal {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("Bem vindo ao SITEMA COMANDA DIGITAL - WHEENY SOLUTION TECNOLOGY");
		
		// Inicia lista de clientes padrão
		Artefatos.getInstance().initClientes();
		
		// Inici lista de funcionarios padrão
		Artefatos.getInstance().initFuncionarios();
		
		// Chamada para o sistema Comanda Digital - Prompt Comando (terminal)
		MenuLogin.getInstance().getMenuLogin();

		System.out.println("Obrigado por usufluir do SITEMA COMANDA DIGITAL - WHEENY SOLUTION TECNOLOGY");

	}

}
