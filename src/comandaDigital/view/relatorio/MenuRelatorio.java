package comandaDigital.view.relatorio;

import java.util.Scanner;

public class MenuRelatorio {
	
	private static MenuRelatorio instance;
	private Scanner scan = new Scanner(System.in);

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
