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

	private static AuditoriaFuncionario getIntance() {
		return instance;
	}

	private static void setInstance(AuditoriaFuncionario aInstance) {
		instance = aInstance;
	}

	public static AuditoriaFuncionario getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaFuncionario());
		}

		return getIntance();

	}

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

	@Override
	public void insereObjeto(Object object) {

		Funcionario funcionario = (Funcionario) object;
		
		funcionario.setId(GerarId.getInstance().geraId());
		funcionario.setNumeroFuncionario(GerarId.getInstance().geraIdFuncionario());

		Artefatos.funcionarios.add(funcionario);

		System.out.println(IMensagemGeral.FUNCIONARIO_INSERIDO_SUCESSO);
	}

	@Override
	public void alteraObjeto(Object object) {
		
		Funcionario funcionario = (Funcionario) object;
		
		for (int i = 0; i < Artefatos.funcionarios.size(); i++) {

			if (funcionario.getId() == Artefatos.funcionarios.get(i).getId()) {

				Artefatos.funcionarios.get(i).setBairro(funcionario.getBairro());
				Artefatos.funcionarios.get(i).setCep(funcionario.getCep());
				Artefatos.funcionarios.get(i).setCidade(funcionario.getCidade());
				Artefatos.funcionarios.get(i).setEmail(funcionario.getEmail());
				Artefatos.funcionarios.get(i).setLogradouro(funcionario.getLogradouro());
				Artefatos.funcionarios.get(i).setNome(funcionario.getNome());
				Artefatos.funcionarios.get(i).setTelefone(funcionario.getTelefone());
				Artefatos.funcionarios.get(i).setUf(funcionario.getUf());
				Artefatos.funcionarios.get(i).setFuncao(funcionario.getFuncao());
				Artefatos.funcionarios.get(i).setSalario(funcionario.getSalario());
				
			}
		}

		System.out.println(IMensagemGeral.FUNCIONARIO_ALTERADO_SUCESSO);
		
	}

	@Override
	public void removeObjeto(int id) {
		
		for (int i = 0; i < Artefatos.funcionarios.size(); i++) {

			if (Artefatos.funcionarios.get(i).getId() == id) {

				Artefatos.funcionarios.remove(i);

			}
		}

		System.out.println(IMensagemGeral.FUNCIONARIO_DELETADO_SUCESSO);
	}

	@Override
	public void listarObjeto() {
		
		for(Funcionario funcionario : Artefatos.funcionarios){
			System.out.println(funcionario.toString());
		}
		
	}

	@Override
	public Object getObject(int id) {

		Funcionario funcionario = new Funcionario();

		for (int i = 0; i < Artefatos.funcionarios.size(); i++) {

			if (id == Artefatos.funcionarios.get(i).getId()) {

				System.out.println(Artefatos.funcionarios.get(i).getNome());
				funcionario = Artefatos.funcionarios.get(i);

			}

		}

		return funcionario;
	}

}
