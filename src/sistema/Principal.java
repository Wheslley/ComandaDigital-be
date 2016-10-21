package sistema;

import comandaDigital.view.login.MenuLogin;
import localStorage.Artefatos;
import net.sf.jasperreports.engine.JRException;

/**
 * Classe com o objetivo de chamar a view respons�vel pela l�gica do Sitema
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
		 * Listas padr�es de clientes, funcionarios e usu�rios. 
		 */
		
		// Inicia lista de usu�rios padr�es.
		Artefatos.getInstance().initUsuarios();
		
		// Inicia lista de clientes padr�es.
		Artefatos.getInstance().initClientes();
		
		// Inicia lista de funcionarios padr�es.
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
