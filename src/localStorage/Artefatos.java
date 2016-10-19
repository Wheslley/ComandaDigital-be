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
import comandaDigital.controller.auditoria.AuditoriaUsuario;
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

	@SuppressWarnings("finally")
	public boolean initClientes() {
		
		try{
			
			Cliente cliente = new Cliente();

			cliente.setNome("Mario Diniz");
			cliente.setEmail("marioDnz@gmail.com");
			cliente.setTelefone("988359000");
			cliente.setLogradouro("Francisco Cassiano Lopes");
			cliente.setBairro("Vila Brasilia");
			cliente.setCep(13566606);
			cliente.setCidade("São Carlos");
			cliente.setUf("SP");

			AuditoriaCliente.getInstance().insereObjeto(cliente);

			cliente = new Cliente();
			cliente.setNome("Marina Leite");
			cliente.setEmail("mah_leite@gmail.com");
			cliente.setTelefone("988186018");
			cliente.setLogradouro("Francisco Cassiano Lopes");
			cliente.setBairro("Vila Brasilia");
			cliente.setCep(13566606);
			cliente.setCidade("São Carlos");
			cliente.setUf("SP");

			AuditoriaCliente.getInstance().insereObjeto(cliente);

			cliente = new Cliente();
			cliente.setNome("Antonio Domingues");
			cliente.setEmail("tonho_bd@gmail.com");
			cliente.setTelefone("988248856");
			cliente.setLogradouro("Achile Aderico Bazone");
			cliente.setBairro("Jardim Uirapuru");
			cliente.setCep(1480400);
			cliente.setCidade("Araraquara");
			cliente.setUf("SP");

			AuditoriaCliente.getInstance().insereObjeto(cliente);

			System.out.println(IMensagemGeral.CLIENTE_INICIALIZADO);
			
		}catch (Exception e){
			
			return false;
			
		} finally{
			
			return true;
			
		}
		
	}
	
	public static List<Usuario> usuarios = new ArrayList<>();

	@SuppressWarnings("finally")
	public boolean initUsuarios() {

		try {
			Usuario usuario = new Usuario();

			usuario.setNome("Wheslley Nycolas");
			usuario.setEmail("wheslleyny@gmail.com");
			usuario.setTelefone("988359000");
			usuario.setLogradouro("Francisco Cassiano Lopes");
			usuario.setBairro("Vila Brasilia");
			usuario.setCep(13566606);
			usuario.setCidade("São Carlos");
			usuario.setUf("SP");
			usuario.setSenha("123");

			AuditoriaUsuario.getInstance().insereObjeto(usuario);

			usuario = new Usuario();
			usuario.setNome("Jady Domingues");
			usuario.setEmail("jady_bd@gmail.com");
			usuario.setTelefone("988248856");
			usuario.setLogradouro("Achile Aderico Bazone");
			usuario.setBairro("Jardim Uirapuru");
			usuario.setCep(1480400);
			usuario.setCidade("Araraquara");
			usuario.setUf("SP");
			usuario.setSenha("123");

			AuditoriaUsuario.getInstance().insereObjeto(usuario);

			usuario = new Usuario();
			usuario.setNome("Whislley Willian");
			usuario.setEmail("whislleywilian@gmail.com");
			usuario.setTelefone("988186018");
			usuario.setLogradouro("Francisco Cassiano Lopes");
			usuario.setBairro("Vila Brasilia");
			usuario.setCep(13566606);
			usuario.setCidade("São Carlos");
			usuario.setUf("SP");
			usuario.setSenha("123");

			AuditoriaUsuario.getInstance().insereObjeto(usuario);
			
			usuario = new Usuario();
			usuario.setNome("Elisete Moro");
			usuario.setEmail("Ellis_moro@gmail.com");
			usuario.setTelefone("988676414");
			usuario.setLogradouro("Francisco Cassiano Lopes");
			usuario.setBairro("Vila Brasilia");
			usuario.setCep(13566606);
			usuario.setCidade("São Carlos");
			usuario.setUf("SP");
			usuario.setSenha("123");

			AuditoriaUsuario.getInstance().insereObjeto(usuario);

			System.out.println(IMensagemGeral.USUARIO_INICIALIZADO);
			
		} catch (Exception e) {
			
			return false;
			
		} finally{
			
			return true;
		}

	}
	
	public static List<Funcionario> funcionarios = new ArrayList<>();

	@SuppressWarnings("finally")
	public boolean initFuncionarios() {
		
		try{
			
			Funcionario funcionario = new Funcionario();
			
			funcionario.setFuncao("Gerente");
			funcionario.setSalario(5136.00);
			
			for(Usuario usuario : usuarios){
				if(usuario.getId() == 2){
					Usuario usuarioAux = usuario;
					funcionario.setUsuario(usuarioAux);
				}
			}

			AuditoriaFuncionario.getInstance().insereObjeto(funcionario);
			
			funcionario = new Funcionario();
			funcionario.setFuncao("Caixa");
			funcionario.setSalario(3136.00);
			
			for(Usuario usuario : usuarios){
				if(usuario.getId() == 3){
					Usuario usuarioAux = usuario;
					funcionario.setUsuario(usuarioAux);
				}
			}

			AuditoriaFuncionario.getInstance().insereObjeto(funcionario);
			
			funcionario = new Funcionario();
			funcionario.setFuncao("Atendente");
			funcionario.setSalario(2136.00);
			
			for(Usuario usuario : usuarios){
				if(usuario.getId() == 4){
					Usuario usuarioAux = usuario;
					funcionario.setUsuario(usuarioAux);
				}
			}

			AuditoriaFuncionario.getInstance().insereObjeto(funcionario);
			
			System.out.println(IMensagemGeral.FUNCIONARIO_INICIALIZADO);
			
		}catch (Exception e){
			
			return false;
			
		} finally {
			
			return true;
			
		}
		
	}

}
