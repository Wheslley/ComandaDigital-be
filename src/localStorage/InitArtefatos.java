package localStorage;

/**
 * 
 * Classe ser� respons�vel em inicializar todas as listas do sistema.
 * 
 * @author w_his
 * 
 */

import interfaces.mensagens.IMensagemGeral;

public class InitArtefatos {

	private static InitArtefatos instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance
	 * 
	 * @return
	 */
	private static InitArtefatos getIntance() {
		return instance;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo instance
	 * 
	 * @param aInstance
	 */
	private static void setInstance(InitArtefatos aInstance) {
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
	public static InitArtefatos getInstance() {

		if (getIntance() == null) {
			setInstance(new InitArtefatos());
		}

		return getIntance();

	}

	/**
	 * M�todo que realizar� a inicializa��o de todas as listas respons�veis em armazenar
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
