package comandaDigital.view.comandaDigital;

/**
 * 
 * Classe MenuComandaDigital ser� respons�vel em exibir todas as op��es dispon�veis para a op��o comanda digital
 * 
 * @author w_his
 *
 */
public class MenuComandaDigital {
	
	private static MenuComandaDigital instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance
	 * 
	 * @return
	 */
    private static MenuComandaDigital getIntance() {
        return instance;
    }

    /**
     * 
     * M�todo Setter referente ao atributo instance
     * 
     * @param aInstance
     */
    private static void setInstance(MenuComandaDigital aInstance) {
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
    public static MenuComandaDigital getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuComandaDigital());
        }

        return getIntance();

    }
    
}
