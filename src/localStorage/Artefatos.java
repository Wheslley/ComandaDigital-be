package localStorage;

/**
 * 
 * Classe Artefatos será responsável em incluir objetos em todas as Lists do sistema.
 * 
 * @author whesl
 *
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import comandaDigital.controller.auditoria.AuditoriaCliente;
import comandaDigital.controller.auditoria.AuditoriaFuncionario;
import comandaDigital.controller.auditoria.AuditoriaProduto;
import comandaDigital.controller.auditoria.AuditoriaUsuario;
import comandaDigital.model.estabelecimento.Estabelecimento;
import comandaDigital.model.estabelecimento.Mesa;
import comandaDigital.model.pessoas.Cliente;
import comandaDigital.model.pessoas.Funcionario;
import comandaDigital.model.pessoas.Usuario;
import comandaDigital.model.produto.Produto;
import interfaces.mensagens.IMensagemGeral;

public class Artefatos {

	private static Artefatos instance;

	/**
	 * 
	 * Método Getter referente ao atributo instance
	 * 
	 * @return
	 */
	private static Artefatos getIntance() {
		return instance;
	}

	/**
	 * 
	 * Método Setter referente ao atributo instance
	 * 
	 * @param aInstance
	 */
	private static void setInstance(Artefatos aInstance) {
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
	public static Artefatos getInstance() {

		if (getIntance() == null) {
			setInstance(new Artefatos());
		}

		return getIntance();

	}

	public static List<Produto> produtos = new ArrayList<>();

	public static Map<Integer, Integer> estoque = new HashMap<>();
	
	public static List<Usuario> usuarios = new ArrayList<>();

	public static List<Cliente> clientes = new ArrayList<>();

	public static List<Funcionario> funcionarios = new ArrayList<>();

	public static Estabelecimento estabelecimento = new Estabelecimento();
	
	public static List<Mesa> mesas = new ArrayList<>();
	
	public static List<Mesa> mesasFechadas = new ArrayList<>();
	
	/**
	 * 
	 * Método initProdutos realizará a inclusão de 02 produtos no sistema
	 * 
	 * @return
	 */
	@SuppressWarnings("finally")
	public boolean initProdutos() {

		try {

			Produto produto = new Produto();

			produto.setNome("Coca-Cola");
			produto.setDescricao("Refrigerante sabor Cola");
			produto.setValorBase(2.60);
			produto.setValorVenda(4.50);

			AuditoriaProduto.getInstance().insereObjeto(produto);

			produto = new Produto();
			produto.setNome("Pão com Catupiry");
			produto.setDescricao("Pão Frances recheado com Catupiry");
			produto.setValorBase(1.90);
			produto.setValorVenda(3.90);

			AuditoriaProduto.getInstance().insereObjeto(produto);
			
			produto = new Produto();
			produto.setNome("Leite");
			produto.setDescricao("Leite");
			produto.setValorBase(1.00);
			produto.setValorVenda(2.90);

			AuditoriaProduto.getInstance().insereObjeto(produto);
			
			produto = new Produto();
			produto.setNome("Água sem gás");
			produto.setDescricao("Água sem gás");
			produto.setValorBase(0.90);
			produto.setValorVenda(2.90);

			AuditoriaProduto.getInstance().insereObjeto(produto);
			
			produto = new Produto();
			produto.setNome("Água com gás");
			produto.setDescricao("Água com gás");
			produto.setValorBase(1.40);
			produto.setValorVenda(3.90);

			AuditoriaProduto.getInstance().insereObjeto(produto);
			
		} catch (Exception e) {

			return false;

		} finally {

			return true;

		}

	}
	
	/**
	 * 
	 * Método que realizará o inserção dos objeto que foram armazenados na lista produtos
	 * no estoque
	 * 
	 * @return
	 */
	@SuppressWarnings("finally")
	public boolean initEstoque() {

		try {

			for (Produto produto : produtos) {
				estoque.put(produto.getIdProduto(), 10);
				System.out.println(IMensagemGeral.ESTOQUE_INSERIDO_SUCESSO);
			}

		} catch (Exception e) {

			return false;

		} finally {

			return true;

		}

	}

	/**
	 * 
	 * Método initUsuarios realizará a inclusão de 04 usuários no sistema
	 * 
	 * @return
	 */
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

		} catch (Exception e) {

			return false;

		} finally {

			return true;
		}

	}
	
	/**
	 * 
	 * Método initClientes realizará a inclusão de 03 clientes no sistema
	 * 
	 * @return
	 */
	@SuppressWarnings("finally")
	public boolean initClientes() {

		try {

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

		} catch (Exception e) {

			return false;

		} finally {

			return true;

		}

	}

	/**
	 * 
	 * Método initFuncionarios realizará a inclusão de 03 funcionarios no sistema
	 * 
	 * @return
	 */
	@SuppressWarnings("finally")
	public boolean initFuncionarios() {

		try {

			Funcionario funcionario = new Funcionario();

			funcionario.setFuncao("Gerente");
			funcionario.setSalario(5136.00);

			for (Usuario usuario : usuarios) {
				if (usuario.getId() == 2) {
					Usuario usuarioAux = usuario;
					funcionario.setUsuario(usuarioAux);
				}
			}

			AuditoriaFuncionario.getInstance().insereObjeto(funcionario);

			funcionario = new Funcionario();
			funcionario.setFuncao("Caixa");
			funcionario.setSalario(3136.00);

			for (Usuario usuario : usuarios) {
				if (usuario.getId() == 3) {
					Usuario usuarioAux = usuario;
					funcionario.setUsuario(usuarioAux);
				}
			}

			AuditoriaFuncionario.getInstance().insereObjeto(funcionario);

			funcionario = new Funcionario();
			funcionario.setFuncao("Atendente");
			funcionario.setSalario(2136.00);

			for (Usuario usuario : usuarios) {
				if (usuario.getId() == 4) {
					Usuario usuarioAux = usuario;
					funcionario.setUsuario(usuarioAux);
				}
			}

			AuditoriaFuncionario.getInstance().insereObjeto(funcionario);

		} catch (Exception e) {

			return false;

		} finally {

			return true;

		}

	}
	
	/**
	 * 
	 * Método initMesas realizará a inclusão das mesas no sistema
	 * 
	 * @return
	 */
	@SuppressWarnings("finally")
	public boolean initMesas() {

		try {
			
			Mesa mesa;
			
			for(int x = 0; x < IMensagemGeral.LIMITE_MESAS_ESTABELECIMENTO; x++){
				
				mesa = new Mesa();
				mesa.setNumeroMesa(x + 1);
				mesa.setStatusMesa(IMensagemGeral.FECHADA);
				
				Artefatos.mesas.add(mesa);
				System.out.println(IMensagemGeral.MESA_INSERIDA_SUCESSO);
			}

		} catch (Exception e) {

			return false;

		} finally {

			return true;

		}

	}

}
