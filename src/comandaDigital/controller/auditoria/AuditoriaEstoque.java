package comandaDigital.controller.auditoria;

import java.util.Map;

import comandaDigital.model.produto.Estoque;
import comandaDigital.view.estoque.MenuEstoque;
import interfaces.mensagens.IMensagemGeral;
import interfaces.padroes.IMenuCrudPadrão;
import localStorage.Artefatos;

/**
 * 
 * @author whesl
 *
 */

public class AuditoriaEstoque implements IMenuCrudPadrão {

	private static AuditoriaEstoque instance;

	private static AuditoriaEstoque getIntance() {
		return instance;
	}

	private static void setInstance(AuditoriaEstoque aInstance) {
		instance = aInstance;
	}

	public static AuditoriaEstoque getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaEstoque());
		}

		return getIntance();

	}

	@Override
	public void auditaObjeto(int opcaoMenu) {

		switch (opcaoMenu) {

			case 1: {
	
				MenuEstoque.getInstance().getMenuInsereEstoque();
				break;
	
			}
	
			case 2: {
	
				MenuEstoque.getInstance().getMenuDeletaEstoque();
				break;
	
			}
	
			case 3: {
	
				MenuEstoque.getInstance().getMenuAlteracaoEstoque();
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

		Estoque estoque = (Estoque) object;

		Artefatos.estoque.put(estoque.getIdProduto(), estoque.getQuantidadeProduto());

		System.out.println(IMensagemGeral.ESTOQUE_INSERIDO_SUCESSO);

	}

	@Override
	public void alteraObjeto(Object object) {

		Estoque estoque = (Estoque) object;

		for (Map.Entry<Integer, Integer> entry : Artefatos.estoque.entrySet()) {

			if (estoque.getIdProduto() == entry.getKey()) {
				
				Artefatos.estoque.remove(estoque.getIdProduto());
				Artefatos.estoque.put(estoque.getIdProduto(), estoque.getQuantidadeProduto());
				
			}

		}

		System.out.println(IMensagemGeral.ESTOQUE_ALTERADO_SUCESSO);
		
	}

	@Override
	public void removeObjeto(int id) {

		Integer idProduto = id;
		Artefatos.estoque.remove(idProduto);

		System.out.println(IMensagemGeral.ESTOQUE_DELETADO_SUCESSO);
		
	}

	@Override
	public void listarObjeto() {

		for (Map.Entry<Integer, Integer> entry : Artefatos.estoque.entrySet()) {
			
			System.out.println("IdProduto: " + entry.getKey() + " - Quantidade: " + entry.getValue());
			
		}

	}

	@Override
	public Object getObject(int id) {

		Estoque estoque = new Estoque();
		System.out.println("Metodo não implementado!!!");

		return estoque;

	}

}
