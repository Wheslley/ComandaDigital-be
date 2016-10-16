package comandaDigital.view.menu;

import java.util.Scanner;

import comandaDigital.controller.menu.ValidaMenuLogin;
import comandaDigital.model.iMensagens.IMensagemGeral;
import comandaDigital.model.iMensagens.IMensagemParametro;
import comandaDigital.model.pessoas.Usuario;

public class MenuLogin {

	private static MenuLogin instance;

	private static MenuLogin getIntance() {
		return instance;
	}

	private static void setInstance(MenuLogin aInstance) {
		instance = aInstance;
	}

	public static MenuLogin getInstance() {

		if (getIntance() == null) {
			setInstance(new MenuLogin());
		}

		return getIntance();

	}

	public boolean getMenuLogin() {

		Usuario usuario = new Usuario();
		Scanner scan = new Scanner(System.in);
		boolean flagLogin = true;

		while (flagLogin) {

			System.out.println("************************************");
			System.out.println("*	         LOGIN	           *");
			System.out.println("************************************");

			System.out.print("Usuário: ");
			usuario.setLogin(scan.next());

			System.out.print("Senha: ");
			usuario.setSenha(scan.next());

			System.out.println("*    		                   *");
			System.out.println("************************************\n\n");

			switch (ValidaMenuLogin.getInstance().validaMenuLogin(usuario)) {

				case IMensagemParametro.USUARIO_MASTER : {
					flagLogin = false;
					System.out.println("(" + IMensagemParametro.USUARIO_MASTER + ") - " + IMensagemGeral.ACESSO_LIBERADO + "\n\n");
					break;
				}
	
				case IMensagemParametro.GERENTE : {
					flagLogin = false;
					System.out.println("(" + IMensagemParametro.GERENTE + ") - " + IMensagemGeral.ACESSO_LIBERADO + "\n\n");
					break;
				}
	
				case IMensagemParametro.FUNCIONARIO : {
					flagLogin = false;
					System.out.println("(" + IMensagemParametro.FUNCIONARIO + ") - " + IMensagemGeral.ACESSO_LIBERADO + "\n\n");
					break;
				}
	
				default: {
					System.out.println(IMensagemGeral.ACESSO_NEGADO + "\n\n");
					break;
				}

			}

		}

		return true;

	}

}
