package Sistema;

import java.util.ArrayList;
import java.util.List;

import comandaDigital.model.pessoas.Cliente;

public class Artefatos {
	
	private static Artefatos instance;

    private static Artefatos getIntance() {
        return instance;
    }

    private static void setInstance(Artefatos aInstance) {
        instance = aInstance;
    }

    public static Artefatos getInstance() {

        if (getIntance() == null) {
            setInstance(new Artefatos());
        }

        return getIntance();

    }
    
	public static List<Cliente> clientes = new ArrayList<>();
	
}
