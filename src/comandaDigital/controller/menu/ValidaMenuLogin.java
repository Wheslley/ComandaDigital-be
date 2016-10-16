package comandaDigital.controller.menu;

import comandaDigital.model.iMensagens.IMensagemMenu;
import comandaDigital.model.iMensagens.IMensagemParametro;
import comandaDigital.model.pessoas.Usuario;
import comandaDigital.view.menu.MenuFuncionario;
import comandaDigital.view.menu.MenuGerente;
import comandaDigital.view.menu.MenuUsuarioMaster;

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
    
	public String validaMenuLogin(Usuario usuario) {

		if (usuario.getLogin().toUpperCase().equals(IMensagemMenu.USUARIO_MASTER_VALIDO) && usuario.getSenha().equals(IMensagemMenu.SENHA_MASTER_VALIDA)) {
			return IMensagemParametro.USUARIO_MASTER;
		} else if (usuario.getLogin().toUpperCase().equals(IMensagemMenu.USUARIO_GERENTE_VALIDO) && usuario.getSenha().equals(IMensagemMenu.SENHA_GERENTE_VALIDA)) {
			return IMensagemParametro.GERENTE;
		} else if ((usuario.getLogin().toUpperCase().equals(IMensagemMenu.USUARIO_FUNCIONARIO_03_VALIDO) && usuario.getSenha().equals(IMensagemMenu.SENHA_FUNCIONARIO_03_VALIDA)) ||
				   (usuario.getLogin().toUpperCase().equals(IMensagemMenu.USUARIO_FUNCIONARIO_04_VALIDO) && usuario.getSenha().equals(IMensagemMenu.SENHA_FUNCIONARIO_04_VALIDA)) ||
				   (usuario.getLogin().toUpperCase().equals(IMensagemMenu.USUARIO_FUNCIONARIO_05_VALIDO) && usuario.getSenha().equals(IMensagemMenu.SENHA_FUNCIONARIO_05_VALIDA))) {
			return IMensagemParametro.FUNCIONARIO;
		} 
		
		return IMensagemParametro.USUARIO_NAO_IDENTIFICADO;
	}
	
	public boolean validaTipoDeFuncionario (String tipoFuncionario){
    	
    	if(tipoFuncionario.equals(IMensagemParametro.USUARIO_MASTER) || tipoFuncionario.equals(IMensagemParametro.GERENTE) || tipoFuncionario.equals(IMensagemParametro.FUNCIONARIO)){
    		return true;
    	}
    	
    	return false;
    	
    }
	
	public void forwardMenuLogin (String tipoFuncionario){
		
		switch (tipoFuncionario) {
			
			case IMensagemParametro.USUARIO_MASTER:{
				MenuUsuarioMaster.getInstance().getMenuUsuarioMaster();
				break;
			}
			
			case IMensagemParametro.GERENTE:{
				MenuGerente.getInstance().getMenuGerente();
				break;
			}
			
			case IMensagemParametro.FUNCIONARIO:{
				MenuFuncionario.getInstance().getMenuFuncionario();
				break;
			}
			
		}
		
	}
	
}
