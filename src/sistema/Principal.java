package sistema;

import comandaDigital.view.login.MenuLogin;
import localStorage.Artefatos;
import net.sf.jasperreports.engine.JRException;

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
	public static void main(String[] args) throws JRException {
		
		/**
		 * Mensagem de boas vindas.
		 */
		
		System.out.println("Bem vindo ao SITEMA COMANDA DIGITAL - WHEENY SOLUTION TECNOLOGY");
		
		/**
		 * Listas padrões de clientes, funcionarios e usuários. 
		 */
		
		// Inicia lista de usuários padrões.
		Artefatos.getInstance().initUsuarios();
		
		// Inicia lista de clientes padrões.
		Artefatos.getInstance().initClientes();
		
		// Inicia lista de funcionarios padrões.
		Artefatos.getInstance().initFuncionarios();
		
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
