package comandaDigital.controller.auditoria;

import comandaDigital.model.pessoas.Funcionario;
import comandaDigital.view.funcionario.MenuFuncionario;
import comandaDigital.view.produto.MenuProduto;
import interfaces.mensagens.IMensagemGeral;
import interfaces.padroes.IMenuCrudPadrão;
import localStorage.Artefatos;
import util.GerarId;

/**
 * 
 * @author whesl
 *
 */

public class AuditoriaProduto implements IMenuCrudPadrão {

	private static AuditoriaProduto instance;

	private static AuditoriaProduto getIntance() {
		return instance;
	}

	private static void setInstance(AuditoriaProduto aInstance) {
		instance = aInstance;
	}

	public static AuditoriaProduto getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaProduto());
		}

		return getIntance();

	}

	@Override
	public void auditaObjeto(int opcaoMenu) {

		switch (opcaoMenu) {

			case 1: {
	
				MenuProduto.getInstance().getMenuInsereProduto();
				break;
	
			}
	
			case 2: {
	
				MenuProduto.getInstance().getMenuDeletaProduto();
				break;
	
			}
	
			case 3: {
	
				MenuProduto.getInstance().getMenuAlteracaoProduto();
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

		funcionario.setNumeroFuncionario(GerarId.getInstance().geraIdFuncionario());

		Artefatos.funcionarios.add(funcionario);

		System.out.println(IMensagemGeral.FUNCIONARIO_INSERIDO_SUCESSO);

	}

	@Override
	public void alteraObjeto(Object object) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeObjeto(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void listarObjeto() {
		// TODO Auto-generated method stub

	}

	@Override
	public Object getObject(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
