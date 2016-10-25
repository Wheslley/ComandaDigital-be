package comandaDigital.controller.auditoria;

import comandaDigital.model.pessoas.Usuario;
import comandaDigital.view.usuarios.MenuUsuario;
import interfaces.mensagens.IMensagemGeral;
import interfaces.padroes.IMenuCrudPadr�o;
import localStorage.Artefatos;
import util.GerarId;

/**
 * 
 * @author whesl
 *
 */

public class AuditoriaUsuario implements IMenuCrudPadr�o{
	
	private static AuditoriaUsuario instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance.
	 * 
	 * @return
	 */
	private static AuditoriaUsuario getIntance() {
		return instance;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo instance.
	 * 
	 * @param aInstance
	 */
	private static void setInstance(AuditoriaUsuario aInstance) {
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
	public static AuditoriaUsuario getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaUsuario());
		}

		return getIntance();

	}
	
	/**
	 * 
	 * M�todo auditaObjeto fica como respons�vel em instanciar o menu solicitado pelo
	 * usu�rio, podendo este menu ser o MenuInsereUsuario, MenuDeletaUsuario ou 
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
	 * M�todo insereObjeto realizar� a inclus�o de um novo Usu�rio na lista usuarios.
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
	 * M�todo alteraObjeto ser� respons�vel em alterar um usuario cujo ID j� exista na 
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
	 * M�todo removeObjeto ser� respons�vel em remover um determinado usuario cujo ID j�
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
	 * M�todo listarObjeto ser� respons�vel em listar todos os Usu�rios que estejam 
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
	 * M�todo getObject ser� respons�vel em retornar um usuario cujo ID exista na 
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
