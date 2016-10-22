package comandaDigital.view.relatorio;

public class MenuRelatorio {
	
	private static MenuRelatorio instance;

	private static MenuRelatorio getIntance() {
		return instance;
	}

	private static void setInstance(MenuRelatorio aInstance) {
		instance = aInstance;
	}

	public static MenuRelatorio getInstance() {

		if (getIntance() == null) {
			setInstance(new MenuRelatorio());
		}

		return getIntance();

	}
	
}
