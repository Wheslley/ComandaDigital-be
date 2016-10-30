package comandaDigital.controller.auditoria;

import comandaDigital.model.pessoas.Funcionario;
import comandaDigital.view.funcionario.MenuFuncionario;
import interfaces.mensagens.IMensagemGeral;
import interfaces.padroes.IMenuCrudPadrão;
import localStorage.Artefatos;
import util.GerarId;

/**
 * 
 * @author whesl
 *
 */

public class AuditoriaFuncionario implements IMenuCrudPadrão{
	
	private static AuditoriaFuncionario instance;

	/**
	 * 
	 * Método Getter referente ao atributo instance.
	 * 
	 * @return
	 */
	private static AuditoriaFuncionario getIntance() {
		return instance;
	}

	/**
	 * 
	 * Método Setter referente ao atributo instance.
	 * 
	 * @param aInstance
	 */
	private static void setInstance(AuditoriaFuncionario aInstance) {
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
	public static AuditoriaFuncionario getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaFuncionario());
		}

		return getIntance();

	}

	/**
	 * 
	 * Método auditaObjeto fica como responsável em instanciar o menu solicitado pelo
	 * usuário, podendo este menu ser o MenuInsereFuncionario, MenuDeletaFuncionario ou 
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
	 * Método insereObjeto realizará a inclusão de um novo Funcionario na lista funcionarios.
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
	 * Método alteraObjeto será responsável em alterar um funcionário cujo ID já exista na 
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
	 * Método removeObjeto será responsável em remover um determinado funcionário cujo ID já
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
	 * Método listarObjeto será responsável em listar todos os Funcionarios que estejam 
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
	 * Método getObject será responsável em retornar um funcionario cujo ID exista na 
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
