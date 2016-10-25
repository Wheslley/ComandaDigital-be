package localStorage;

import interfaces.mensagens.IMensagemGeral;

public class InitArtefatos {

	private static InitArtefatos instance;

	private static InitArtefatos getIntance() {
		return instance;
	}

	private static void setInstance(InitArtefatos aInstance) {
		instance = aInstance;
	}

	public static InitArtefatos getInstance() {

		if (getIntance() == null) {
			setInstance(new InitArtefatos());
		}

		return getIntance();

	}

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
