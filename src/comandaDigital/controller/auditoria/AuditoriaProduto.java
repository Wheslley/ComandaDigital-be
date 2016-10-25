package comandaDigital.controller.auditoria;

import comandaDigital.model.produto.Produto;
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

		Produto produto = (Produto) object;

		produto.setIdProduto(GerarId.getInstance().gerarIdProduto());

		Artefatos.produtos.add(produto);

		System.out.println(IMensagemGeral.PRODUTO_INSERIDO_SUCESSO);

	}

	@Override
	public void alteraObjeto(Object object) {

		Produto produto = (Produto) object;
		
		for (int i = 0; i < Artefatos.produtos.size(); i++) {

			if (produto.getIdProduto() == Artefatos.produtos.get(i).getIdProduto()) {

				Artefatos.produtos.get(i).setNome(produto.getNome());
				Artefatos.produtos.get(i).setDescricao(produto.getDescricao());
				Artefatos.produtos.get(i).setValorBase(produto.getValorBase());
				Artefatos.produtos.get(i).setValorVenda(produto.getValorVenda());
				
			}
		}

		System.out.println(IMensagemGeral.PRODUTO_ALTERADO_SUCESSO);

	}

	@Override
	public void removeObjeto(int id) {

		for (int i = 0; i < Artefatos.produtos.size(); i++) {

			if (Artefatos.produtos.get(i).getIdProduto() == id) {

				Artefatos.produtos.remove(i);

			}
		}

		System.out.println(IMensagemGeral.PRODUTO_DELETADO_SUCESSO);
		
	}

	@Override
	public void listarObjeto() {
		
		for(Produto produto : Artefatos.produtos){
			System.out.println(produto.toString());
		}
		
	}
	
	public void listarProdutoItemComandaDigital(){
		
		for(Produto produto : Artefatos.produtos){
			System.out.println("PRODUTO: ID: [" + produto.getIdProduto() + "] - NOME: [" + produto.getNome() + "]");
		}
		
	}

	@Override
	public Object getObject(int id) {
		
		Produto produto = new Produto();

		for (int i = 0; i < Artefatos.produtos.size(); i++) {

			if (id == Artefatos.produtos.get(i).getIdProduto()) {

				produto = Artefatos.produtos.get(i);

			}

		}

		return produto;
		
	}

}
