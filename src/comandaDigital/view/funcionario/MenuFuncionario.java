package comandaDigital.view.funcionario;

public class MenuFuncionario {
	
	private static MenuFuncionario instance;

    private static MenuFuncionario getIntance() {
        return instance;
    }

    private static void setInstance(MenuFuncionario aInstance) {
        instance = aInstance;
    }

    public static MenuFuncionario getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuFuncionario());
        }

        return getIntance();

    }
    
}
