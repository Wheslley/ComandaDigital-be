package comandaDigital.controller.auditoria;

import com.sun.javafx.scene.layout.region.Margins.Converter;

import comandaDigital.model.pessoas.Funcionario;
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

	private static AuditoriaUsuario getIntance() {
		return instance;
	}

	private static void setInstance(AuditoriaUsuario aInstance) {
		instance = aInstance;
	}

	public static AuditoriaUsuario getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaUsuario());
		}

		return getIntance();

	}
	
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

	@Override
	public void insereObjeto(Object object) {
		
		Usuario usuario = (Usuario) object;
		
		usuario.setId(GerarId.getInstance().geraId());
		usuario.setLogin(Integer.toString(usuario.getId()));

		Artefatos.usuarios.add(usuario);

		System.out.println(IMensagemGeral.USUARIO_INSERIDO_SUCESSO);
		
	}

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

	@Override
	public void removeObjeto(int id) {
		
		for (int i = 0; i < Artefatos.usuarios.size(); i++) {

			if (Artefatos.usuarios.get(i).getId() == id) {

				Artefatos.usuarios.remove(i);

			}
		}

		System.out.println(IMensagemGeral.USUARIO_DELETADO_SUCESSO);
		
	}

	@Override
	public void listarObjeto() {
		
		for(Usuario usuario : Artefatos.usuarios){
			System.out.println(usuario.toString());
		}
		
	}

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
