package comandaDigital.controller.menu;

import comandaDigital.model.pessoas.Usuario;
import comandaDigital.view.menuGeral.MenuGeralFuncionario;
import comandaDigital.view.menuGeral.MenuGeralGerente;
import comandaDigital.view.menuGeral.MenuGeralUsuarioMaster;
import interfaces.mensagens.IMensagemMenu;
import interfaces.mensagens.IMensagemParametro;

/**
 * 
 * Classe ValidaMenuLogin será responsável em validar o login, o tipo de usuário e o
 * tipo de funcionário que logar no sistema.
 * 
 * @author whesl
 *
 */

public class ValidaMenuLogin {
    
	private static ValidaMenuLogin instance;

	/**
	 * 
	 * Método Getter referente ao atributo instance
	 * 
	 * @return
	 */
    private static ValidaMenuLogin getIntance() {
        return instance;
    }

    /**
     * 
     * Método Setter referente ao atributo instance
     * 
     * @param aInstance
     */
    private static void setInstance(ValidaMenuLogin aInstance) {
        instance = aInstance;
    }

    /**
     * 
     * Caso a variavel instance não estiver referência de nenhum ponto da
	 * memória, associamos a ela um endereço e instanciamos a própria classe,
	 * transformando-a em uma classe assincrôna.
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
     * Método validaMenuLogin será responsável em validar o login e senha do usuário, com os dados
     * já cadastrados.
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
	 * Método validaTipoDeFuncionario irá validar se o usuário que realizar o login no sistema
	 * é do tipo USUARIO_MASTER, GERENTE ou FUNCIONARIO.
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
	 * Método forwardMenuLogin irá verificar qual usuário realizou o login no sistema,
	 * e de acordo com o seu tipo retornará a instancia do MenuGeralUsuarioMaster,
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
