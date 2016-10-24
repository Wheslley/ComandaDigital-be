package comandaDigital.view.comandaDigital;

/**
 * 
 * Classe MenuComandaDigital será responsável em exibir todas as opções disponíveis para a opção comanda digital
 * 
 * @author w_his
 *
 */
public class MenuComandaDigital {
	
	private static MenuComandaDigital instance;

	/**
	 * 
	 * Método Getter referente ao atributo instance
	 * 
	 * @return
	 */
    private static MenuComandaDigital getIntance() {
        return instance;
    }

    /**
     * 
     * Método Setter referente ao atributo instance
     * 
     * @param aInstance
     */
    private static void setInstance(MenuComandaDigital aInstance) {
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
    public static MenuComandaDigital getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuComandaDigital());
        }

        return getIntance();

    }
    
}
