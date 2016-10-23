package comandaDigital.view.estoque;

/**
 * 
 * Classe MenuEstoque ser� respons�vel em exibir todas as op��es dispon�veis para a op��o estoque
 * 
 * @author whesl
 *
 */
public class MenuEstoque {
	
	private static MenuEstoque instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance
	 * 
	 * @return
	 */
    private static MenuEstoque getIntance() {
        return instance;
    }

    /**
     * 
     * M�todo Setter referente ao atributo instance
     * 
     * @param aInstance
     */
    private static void setInstance(MenuEstoque aInstance) {
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
    public static MenuEstoque getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuEstoque());
        }

        return getIntance();

    }
    
}
