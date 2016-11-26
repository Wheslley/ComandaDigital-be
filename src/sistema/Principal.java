package sistema;

import comandaDigital.view.login.MenuLogin;
import localStorage.InitArtefatos;

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
	 * @throws JRException 
	 */
	public static void main(String[] args) {
		
		/**
		 * Mensagem de boas vindas.
		 */
		
		System.out.println("Bem vindo ao SITEMA COMANDA DIGITAL - WHEENY SOLUTION TECNOLOGY");
		
		/**
		 * Listas padrões de clientes, funcionarios e usuários. 
		 */
		
		// Inicia listas padrões.
		InitArtefatos.getInstance().init();
		
		/**
		 * Chamada do menu de Login.
		 */
		
		// Chamada para o sistema Comanda Digital - Prompt Comando (terminal)
		MenuLogin.getInstance().getMenuLogin();
		
		/**
		 * Mensagem de agradecimento.
		 */
		
		System.out.println("Obrigado por usufluir do SITEMA COMANDA DIGITAL - WHEENY SOLUTION TECNOLOGY");
		

	}

}
