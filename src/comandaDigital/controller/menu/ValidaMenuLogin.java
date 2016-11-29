package comandaDigital.controller.menu;

import comandaDigital.model.pessoas.Usuario;
import comandaDigital.view.menuGeral.MenuGeralFuncionario;
import comandaDigital.view.menuGeral.MenuGeralGerente;
import comandaDigital.view.menuGeral.MenuGeralUsuarioMaster;
import interfaces.mensagens.IMensagemMenu;
import interfaces.mensagens.IMensagemParametro;

/**
 * 
 * Classe ValidaMenuLogin ser� respons�vel em validar o login, o tipo de usu�rio e o
 * tipo de funcion�rio que logar no sistema.
 * 
 * @author whesl
 *
 */

public class ValidaMenuLogin {
    
	private static ValidaMenuLogin instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance
	 * 
	 * @return
	 */
    private static ValidaMenuLogin getIntance() {
        return instance;
    }

    /**
     * 
     * M�todo Setter referente ao atributo instance
     * 
     * @param aInstance
     */
    private static void setInstance(ValidaMenuLogin aInstance) {
        instance = aInstance;
    }

    /**
     * 
     * Caso a variavel instance n�o estiver refer�ncia de nenhum ponto da
	 * mem�ria, associamos a ela um endere�o e instanciamos a pr�pria classe,
	 * transformando-a em uma classe assincr�na.
     * 
     * @return
     */
    public static ValidaMenuLogin getInstance() {

        if (getIntance() == null) {
            setInstance(new ValidaMenuLogin());
        }

        return getIntance();

    }
    
    /**
     * 
     * M�todo validaMenuLogin ser� respons�vel em validar o login e senha do usu�rio, com os dados
     * j� cadastrados.
     * 
     * @param usuario
     * @return
     */
//	public String validaMenuLogin(Usuario usuario) {
//
//		if (usuario.getLogin().toUpperCase().equals(IMensagemMenu.USUARIO_MASTER_VALIDO) && usuario.getSenha().equals(IMensagemMenu.SENHA_MASTER_VALIDA)) {
//			return IMensagemParametro.USUARIO_MASTER;
//		} else if (usuario.getLogin().toUpperCase().equals(IMensagemMenu.USUARIO_GERENTE_VALIDO) && usuario.getSenha().equals(IMensagemMenu.SENHA_GERENTE_VALIDA)) {
//			return IMensagemParametro.GERENTE;
//		} else if ((usuario.getLogin().toUpperCase().equals(IMensagemMenu.USUARIO_FUNCIONARIO_03_VALIDO) && usuario.getSenha().equals(IMensagemMenu.SENHA_FUNCIONARIO_03_VALIDA)) ||
//				   (usuario.getLogin().toUpperCase().equals(IMensagemMenu.USUARIO_FUNCIONARIO_04_VALIDO) && usuario.getSenha().equals(IMensagemMenu.SENHA_FUNCIONARIO_04_VALIDA))) {
//			return IMensagemParametro.FUNCIONARIO;
//		} 
//		
//		return IMensagemParametro.USUARIO_NAO_IDENTIFICADO;
//	}
	
	/**
	 * 
	 * M�todo validaTipoDeFuncionario ir� validar se o usu�rio que realizar o login no sistema
	 * � do tipo USUARIO_MASTER, GERENTE ou FUNCIONARIO.
	 * 
	 * @param tipoFuncionario
	 * @return
	 */
	public boolean validaTipoDeFuncionario (String tipoFuncionario){
    	
    	if(tipoFuncionario.equals(IMensagemParametro.USUARIO_MASTER) || tipoFuncionario.equals(IMensagemParametro.GERENTE) || tipoFuncionario.equals(IMensagemParametro.FUNCIONARIO)){
    		return true;
    	}
    	
    	return false;
    	
    }
	
	/**
	 * 
	 * M�todo forwardMenuLogin ir� verificar qual usu�rio realizou o login no sistema,
	 * e de acordo com o seu tipo retornar� a instancia do MenuGeralUsuarioMaster,
	 * MenuGeralGerente ou MenuGeralFuncionario.
	 * 
	 * 
	 * @param tipoFuncionario
	 */
	public void forwardMenuLogin (String tipoFuncionario){
		
		switch (tipoFuncionario.toString()) {
			
			case IMensagemParametro.USUARIO_MASTER:{
				MenuGeralUsuarioMaster.getInstance().getMenuUsuarioMaster();
				break;
			}
			
			case IMensagemParametro.GERENTE:{
				MenuGeralGerente.getInstance().getMenuGerente();
				break;
			}
			
			case IMensagemParametro.FUNCIONARIO:{
				MenuGeralFuncionario.getInstance().getMenuFuncionario();
				break;
			}
			
		}
		
	}
	
}
