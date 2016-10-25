package localStorage;

/**
 * 
 * Classe será responsável em inicializar todas as listas do sistema.
 * 
 * @author w_his
 * 
 */

import interfaces.mensagens.IMensagemGeral;

public class InitArtefatos {

	private static InitArtefatos instance;

	/**
	 * 
	 * Método Getter referente ao atributo instance
	 * 
	 * @return
	 */
	private static InitArtefatos getIntance() {
		return instance;
	}

	/**
	 * 
	 * Método Setter referente ao atributo instance
	 * 
	 * @param aInstance
	 */
	private static void setInstance(InitArtefatos aInstance) {
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
	public static InitArtefatos getInstance() {

		if (getIntance() == null) {
			setInstance(new InitArtefatos());
		}

		return getIntance();

	}

	/**
	 * Método que realizará a inicialização de todas as listas responsáveis em armazenar
	 * os objetos criados no decorrer do programa
	 */
	public void init() {

		if (Artefatos.getInstance().initProdutos() && Artefatos.getInstance().initEstoque()
				&& Artefatos.getInstance().initUsuarios() && Artefatos.getInstance().initClientes()
				&& Artefatos.getInstance().initFuncionarios() && Artefatos.getInstance().initMesas()) {
			System.out.println(IMensagemGeral.LISTAS_INICIALIZADAS);
		} else {
			System.out.println(IMensagemGeral.LISTAS_NAO_INICIALIZADAS);
		}

	}

}
