package comandaDigital.view.estoque;

/**
 * 
 * Classe MenuEstoque será responsável em exibir todas as opções disponíveis para a opção estoque
 * 
 * @author whesl
 *
 */
public class MenuEstoque {
	
	private static MenuEstoque instance;

	/**
	 * 
	 * Método Getter referente ao atributo instance
	 * 
	 * @return
	 */
    private static MenuEstoque getIntance() {
        return instance;
    }

    /**
     * 
     * Método Setter referente ao atributo instance
     * 
     * @param aInstance
     */
    private static void setInstance(MenuEstoque aInstance) {
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
    public static MenuEstoque getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuEstoque());
        }

        return getIntance();

    }
    
}
