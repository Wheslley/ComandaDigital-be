package comandaDigital.controller.auditoria;

import comandaDigital.model.pessoas.Usuario;
import comandaDigital.view.usuarios.MenuUsuario;
import interfaces.mensagens.IMensagemGeral;
import interfaces.padroes.IMenuCrudPadrão;
import localStorage.Artefatos;
import util.GerarId;

/**
 * 
 * @author whesl
 *
 */

public class AuditoriaUsuario implements IMenuCrudPadrão{
	
	private static AuditoriaUsuario instance;

	/**
	 * 
	 * Método Getter referente ao atributo instance.
	 * 
	 * @return
	 */
	private static AuditoriaUsuario getIntance() {
		return instance;
	}

	/**
	 * 
	 * Método Setter referente ao atributo instance.
	 * 
	 * @param aInstance
	 */
	private static void setInstance(AuditoriaUsuario aInstance) {
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
	public static AuditoriaUsuario getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaUsuario());
		}

		return getIntance();

	}
	
	/**
	 * 
	 * Método auditaObjeto fica como responsável em instanciar o menu solicitado pelo
	 * usuário, podendo este menu ser o MenuInsereUsuario, MenuDeletaUsuario ou 
	 * MenuAlteracaoUsuario.
	 * 
	 * @param opcaoMenu
	 * 
	 */
	@Override
	public void auditaObjeto(int opcaoMenu) {
		
		switch (opcaoMenu) {

			case 1: {
	
				MenuUsuario.getInstance().getMenuInsereUsuario();
				break;
	
			}
	
			case 2: {
	
				MenuUsuario.getInstance().getMenuDeletaUsuario();
				break;
	
			}
			
			case 3: {
				
				MenuUsuario.getInstance().getMenuAlteracaoUsuario();
				break;
	
			}
	
			default: {
	
				listarObjeto();
				break;
	
			}
	
		}
			
	}

	/**
	 * 
	 * Método insereObjeto realizará a inclusão de um novo Usuário na lista usuarios.
	 * 
	 * @param object
	 * 
	 */
	@Override
	public void insereObjeto(Object object) {
		
		Usuario usuario = (Usuario) object;
		
		usuario.setId(GerarId.getInstance().geraIdPessoa());
		usuario.setLogin(Integer.toString(usuario.getId()));

		Artefatos.usuarios.add(usuario);

		System.out.println(IMensagemGeral.USUARIO_INSERIDO_SUCESSO);
		
	}

	/**
	 * 
	 * Método alteraObjeto será responsável em alterar um usuario cujo ID já exista na 
	 * base de usuarios.
	 * 
	 * @param object
	 * 
	 */
	@Override
	public void alteraObjeto(Object object) {
		
		Usuario usuario = (Usuario) object;
		
		for (int i = 0; i < Artefatos.usuarios.size(); i++) {

			if (usuario.getId() == Artefatos.usuarios.get(i).getId()) {

				Artefatos.usuarios.get(i).setBairro(usuario.getBairro());
				Artefatos.usuarios.get(i).setCep(usuario.getCep());
				Artefatos.usuarios.get(i).setCidade(usuario.getCidade());
				Artefatos.usuarios.get(i).setEmail(usuario.getEmail());
				Artefatos.usuarios.get(i).setLogradouro(usuario.getLogradouro());
				Artefatos.usuarios.get(i).setNome(usuario.getNome());
				Artefatos.usuarios.get(i).setTelefone(usuario.getTelefone());
				Artefatos.usuarios.get(i).setUf(usuario.getUf());
				Artefatos.usuarios.get(i).setSenha(usuario.getSenha());
				
			}
		}

		System.out.println(IMensagemGeral.USUARIO_ALTERADO_SUCESSO);
		
	}

	/**
	 * 
	 * Método removeObjeto será responsável em remover um determinado usuario cujo ID já
	 * exista na base de Usuario.
	 * 
	 * @param id
	 * 
	 */
	@Override
	public void removeObjeto(int id) {
		
		for (int i = 0; i < Artefatos.usuarios.size(); i++) {

			if (Artefatos.usuarios.get(i).getId() == id) {

				Artefatos.usuarios.remove(i);

			}
		}

		System.out.println(IMensagemGeral.USUARIO_DELETADO_SUCESSO);
		
	}

	/**
	 * Método listarObjeto será responsável em listar todos os Usuários que estejam 
	 * na lista usuarios.
	 */
	@Override
	public void listarObjeto() {
		
		for(Usuario usuario : Artefatos.usuarios){
			System.out.println(usuario.toString());
		}
		
	}

	/**
	 * 
	 * Método getObject será responsável em retornar um usuario cujo ID exista na 
	 * base usuarios. 
	 * 
	 * @param id
	 * 
	 */
	@Override
	public Object getObject(int id) {
		
		Usuario usuario = new Usuario();

		for (int i = 0; i < Artefatos.usuarios.size(); i++) {

			if (id == Artefatos.usuarios.get(i).getId()) {

				usuario = Artefatos.usuarios.get(i);

			}

		}

		return usuario;
		
	}

}
