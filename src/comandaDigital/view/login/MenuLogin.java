package comandaDigital.view.login;

import java.util.Scanner;

import comandaDigital.controller.auditoria.AuditoriaUsuario;
import comandaDigital.controller.menu.ValidaMenuLogin;
import comandaDigital.model.pessoas.Usuario;
import interfaces.mensagens.IMensagemGeral;
import interfaces.mensagens.IMensagemParametro;

/**
 * 
 * Classe MenuLogin ser� respons�vel em exibir todos os campos dispon�veis para realizar o login no sistema
 * 
 * @author whesl
 *
 */

public class MenuLogin {

	private static MenuLogin instance;

	/**
	 * 
	 * @author whesl
	 *
	 */

	private static MenuLogin getIntance() {
		return instance;
	}

	/**
	 * 
	 * @param aInstance
	 */
	private static void setInstance(MenuLogin aInstance) {
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

	public static MenuLogin getInstance() {

		if (getIntance() == null) {
			setInstance(new MenuLogin());
		}

		return getIntance();

	}

	/**
	 * 
	 * @author whesl
	 *
	 */
	@SuppressWarnings("unused")
	public void getMenuLogin() {
		
		Scanner scan = new Scanner(System.in);
		Usuario usuario = new Usuario();
		int flagOpcaoSairPrograma = 0;
		boolean flagSairPrograma = true;
		boolean flagLogin = true;

		/**
		 * Enquanto n�o for digitado o valor correto do usu�rio com sua
		 * respectiva senha, o programa ir� acusar acesso negado e repitir a
		 * opera��o.
		 */
		while (flagLogin) {

			System.out.println("************************************");
			System.out.println("*	         LOGIN	          *");
			System.out.println("************************************");

			System.out.print("Usu�rio: ");
			usuario.setLogin(scan.nextInt());

			System.out.print("Senha: ");
			usuario.setSenha(scan.next());

			System.out.println("*    		                   *");
			System.out.println("************************************\n\n");
			
			String tipoUsuario = (String) AuditoriaUsuario.getInstance().getObject(usuario);

			if (tipoUsuario != null){	
				flagLogin = false;
				System.out.println(IMensagemGeral.ACESSO_LIBERADO + "\n\n");
				ValidaMenuLogin.getInstance().forwardMenuLogin(tipoUsuario);
				break;
				
			} else {
				
				System.out.println(IMensagemGeral.ACESSO_NEGADO + "\n\n");
				
				while (flagSairPrograma) {
					
					System.out.print("Digite [1] para tentar novamente ou digite [0] para sair: ");
					flagOpcaoSairPrograma = scan.nextInt();

					if (flagOpcaoSairPrograma == 1) {
						
						flagSairPrograma = false;
						
					} else if (flagOpcaoSairPrograma == 0) {
						
						flagSairPrograma = false;
						flagLogin = false;
						
					} else {
						
						flagSairPrograma = true;
						
					}
					
				}

			}

		}
		
	}

}
