package comandaDigital.controller.auditoria;

import comandaDigital.model.pessoas.Funcionario;
import comandaDigital.view.funcionario.MenuFuncionario;
import interfaces.mensagens.IMensagemGeral;
import interfaces.padroes.IMenuCrudPadr�o;
import localStorage.Artefatos;
import util.GerarId;

/**
 * 
 * @author whesl
 *
 */

public class AuditoriaFuncionario implements IMenuCrudPadr�o{
	
	private static AuditoriaFuncionario instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance.
	 * 
	 * @return
	 */
	private static AuditoriaFuncionario getIntance() {
		return instance;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo instance.
	 * 
	 * @param aInstance
	 */
	private static void setInstance(AuditoriaFuncionario aInstance) {
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
	public static AuditoriaFuncionario getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaFuncionario());
		}

		return getIntance();

	}

	/**
	 * 
	 * M�todo auditaObjeto fica como respons�vel em instanciar o menu solicitado pelo
	 * usu�rio, podendo este menu ser o MenuInsereFuncionario, MenuDeletaFuncionario ou 
	 * MenuAlteracaoFuncionario.
	 * 
	 * @param opcaoMenu
	 * 
	 */
	@Override
	public void auditaObjeto(int opcaoMenu) {
		
		switch (opcaoMenu) {

			case 1: {
	
				MenuFuncionario.getInstance().getMenuInsereFuncionario();
				break;
	
			}
	
			case 2: {
	
				MenuFuncionario.getInstance().getMenuDeletaFuncionario();
				break;
	
			}
			
			case 3: {
				
				MenuFuncionario.getInstance().getMenuAlteracaoFuncionario();
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
	 * M�todo insereObjeto realizar� a inclus�o de um novo Funcionario na lista funcionarios.
	 * 
	 * @param object
	 * 
	 */
	@Override
	public void insereObjeto(Object object) {

		Funcionario funcionario = (Funcionario) object;
		
		funcionario.setNumeroFuncionario(GerarId.getInstance().geraIdFuncionario());

		Artefatos.funcionarios.add(funcionario);

		//System.out.println(IMensagemGeral.FUNCIONARIO_INSERIDO_SUCESSO);
		
	}

	/**
	 * 
	 * M�todo alteraObjeto ser� respons�vel em alterar um funcion�rio cujo ID j� exista na 
	 * base de Funcionarios.
	 * 
	 * @param object
	 * 
	 */
	@Override
	public void alteraObjeto(Object object) {
		
		Funcionario funcionario = (Funcionario) object;
		
		for (int i = 0; i < Artefatos.funcionarios.size(); i++) {

			if (funcionario.getUsuario().getId() == Artefatos.funcionarios.get(i).getUsuario().getId()) {

				Artefatos.funcionarios.get(i).getUsuario().setBairro(funcionario.getUsuario().getBairro());
				Artefatos.funcionarios.get(i).getUsuario().setCep(funcionario.getUsuario().getCep());
				Artefatos.funcionarios.get(i).getUsuario().setCidade(funcionario.getUsuario().getCidade());
				Artefatos.funcionarios.get(i).getUsuario().setEmail(funcionario.getUsuario().getEmail());
				Artefatos.funcionarios.get(i).getUsuario().setLogradouro(funcionario.getUsuario().getLogradouro());
				Artefatos.funcionarios.get(i).getUsuario().setNome(funcionario.getUsuario().getNome());
				Artefatos.funcionarios.get(i).getUsuario().setTelefone(funcionario.getUsuario().getTelefone());
				Artefatos.funcionarios.get(i).getUsuario().setUf(funcionario.getUsuario().getUf());
				Artefatos.funcionarios.get(i).setFuncao(funcionario.getFuncao());
				Artefatos.funcionarios.get(i).setSalario(funcionario.getSalario());
				
			}
		}

		System.out.println(IMensagemGeral.FUNCIONARIO_ALTERADO_SUCESSO);
		
	}

	/**
	 * 
	 * M�todo removeObjeto ser� respons�vel em remover um determinado funcion�rio cujo ID j�
	 * exista na base de Funcionario.
	 * 
	 * @param id
	 * 
	 */
	@Override
	public void removeObjeto(int id) {
		
		for (int i = 0; i < Artefatos.funcionarios.size(); i++) {

			if (Artefatos.funcionarios.get(i).getUsuario().getId() == id) {

				Artefatos.funcionarios.remove(i);

			}
		}

		System.out.println(IMensagemGeral.FUNCIONARIO_DELETADO_SUCESSO);
	}

	/**
	 * 
	 * M�todo listarObjeto ser� respons�vel em listar todos os Funcionarios que estejam 
	 * na lista funcionarios.
	 * 
	 */
	@Override
	public void listarObjeto() {
		
		for(Funcionario funcionario : Artefatos.funcionarios){
			System.out.println(funcionario.toString());
		}
		
	}

	/**
	 * 
	 * M�todo getObject ser� respons�vel em retornar um funcionario cujo ID exista na 
	 * base Funcionarios. 
	 * 
	 * @param id
	 * 
	 */
	@Override
	public Object getObject(int id) {

		Funcionario funcionario = new Funcionario();

		for (int i = 0; i < Artefatos.funcionarios.size(); i++) {

			if (id == Artefatos.funcionarios.get(i).getUsuario().getId()) {

				funcionario = Artefatos.funcionarios.get(i);

			}

		}

		return funcionario;
		
	}

}
