package comandaDigital.controller.menu;

import comandaDigital.model.iMensagens.IMensagemMenu;
import comandaDigital.model.pessoas.Usuario;

/**
 * 
 * @author whesl
 *
 */

public class ValidaMenuLogin {
    
	private static ValidaMenuLogin instance;

    private static ValidaMenuLogin getIntance() {
        return instance;
    }

    private static void setInstance(ValidaMenuLogin aInstance) {
        instance = aInstance;
    }

    public static ValidaMenuLogin getInstance() {

        if (getIntance() == null) {
            setInstance(new ValidaMenuLogin());
        }

        return getIntance();

    }
    
	public boolean validaMenuLogin(Usuario usuario) {

		if (usuario.getLogin().toUpperCase().equals(IMensagemMenu.USUARIO_VALIDO) && usuario.getSenha().equals(IMensagemMenu.SENHA_VALIDA)) {
			return true;
		} else {
			return false;
		}

	}
}
