package localStorage;

/**
 * 
 * @author whesl
 *
 */

import java.util.ArrayList;
import java.util.List;

import comandaDigital.controller.auditoria.AuditoriaCliente;
import comandaDigital.controller.auditoria.AuditoriaFuncionario;
import comandaDigital.model.pessoas.Cliente;
import comandaDigital.model.pessoas.Funcionario;
import comandaDigital.model.pessoas.Usuario;
import interfaces.mensagens.IMensagemGeral;

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
	
	public void initClientes (){
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Wheslley Nycolas");
		cliente.setEmail("wheslleyny@gmail.com");
		cliente.setTelefone("988359000");
		cliente.setLogradouro("Francisco Cassiano Lopes");
		cliente.setBairro("Vila Brasilia");
		cliente.setCep(13566606);
		cliente.setCidade("São Carlos");
		cliente.setUf("SP");
		
		AuditoriaCliente.getInstance().insereObjeto(cliente);
		
		cliente = new Cliente();
		cliente.setNome("Whislley Willian");
		cliente.setEmail("whislleywilian@gmail.com");
		cliente.setTelefone("988186018");
		cliente.setLogradouro("Francisco Cassiano Lopes");
		cliente.setBairro("Vila Brasilia");
		cliente.setCep(13566606);
		cliente.setCidade("São Carlos");
		cliente.setUf("SP");
		
		AuditoriaCliente.getInstance().insereObjeto(cliente);
		
		cliente = new Cliente();
		cliente.setNome("Jady Domingues");
		cliente.setEmail("jady_bd@gmail.com");
		cliente.setTelefone("988248856");
		cliente.setLogradouro("Achile Aderico Bazone");
		cliente.setBairro("Jardim Uirapuru");
		cliente.setCep(1480400);
		cliente.setCidade("Araraquara");
		cliente.setUf("SP");
		
		AuditoriaCliente.getInstance().insereObjeto(cliente);
		
		System.out.println(IMensagemGeral.CLIENTE_INICIALIZADO);
	}
	
	public static List<Funcionario> funcionarios = new ArrayList<>();
	
	public void initFuncionarios (){
		
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome("Mario");
		funcionario.setEmail("mario@gmail.com");
		funcionario.setTelefone("988123400");
		funcionario.setLogradouro("Cassiano Lopes");
		funcionario.setBairro("Vila Brasilia");
		funcionario.setCep(13566606);
		funcionario.setCidade("São Carlos");
		funcionario.setUf("SP");
		funcionario.setFuncao("Gerente");
		funcionario.setSalario(5136.00);
		
		AuditoriaFuncionario.getInstance().insereObjeto(funcionario);
		
		System.out.println(IMensagemGeral.FUNCIONARIO_INICIALIZADO);
	}
}
