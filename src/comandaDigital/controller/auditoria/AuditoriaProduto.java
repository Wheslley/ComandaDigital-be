package comandaDigital.controller.auditoria;

import comandaDigital.model.produto.Produto;
import comandaDigital.view.produto.MenuProduto;
import interfaces.mensagens.IMensagemGeral;
import interfaces.padroes.IMenuCrudPadr�o;
import localStorage.Artefatos;
import util.GerarId;

/**
 * 
 * @author whesl
 *
 */

public class AuditoriaProduto implements IMenuCrudPadr�o {

	private static AuditoriaProduto instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance.
	 * 
	 * @return
	 */
	private static AuditoriaProduto getIntance() {
		return instance;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo instance.
	 * 
	 * @param aInstance
	 */
	private static void setInstance(AuditoriaProduto aInstance) {
		instance = aInstance;
	}

	/**
	 * Caso a variavel instance n�o estiver refer�ncia de nenhum ponto da
	 * mem�ria, associamos a ela um endere�o e instanciamos a pr�pria classe,
	 * transformando-a em uma classe assincr�na.
	 * 
	 * @return
	 */
	public static AuditoriaProduto getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaProduto());
		}

		return getIntance();

	}

	/**
	 * 
	 * M�todo auditaObjeto fica como respons�vel em instanciar o menu solicitado pelo
	 * usu�rio, podendo este menu ser o MenuInsereProduto, MenuDeletaProduto ou 
	 * MenuAlteracaoProduto.
	 * 
	 * @param opcaoMenu
	 * 
	 */
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

	/**
	 * 
	 * M�todo insereObjeto realizar� a inclus�o de um novo Produto na lista produtos.
	 * 
	 * @param object
	 * 
	 */
	@Override
	public void insereObjeto(Object object) {

		Produto produto = (Produto) object;

		produto.setIdProduto(GerarId.getInstance().gerarIdProduto());

		Artefatos.produtos.add(produto);

		System.out.println(IMensagemGeral.PRODUTO_INSERIDO_SUCESSO);

	}

	/**
	 * 
	 * M�todo alteraObjeto ser� respons�vel em alterar um produto cujo ID j� exista na 
	 * base de produtos.
	 * 
	 * @param object
	 * 
	 */
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

	/**
	 * 
	 * M�todo removeObjeto ser� respons�vel em remover um determinado produto cujo ID j�
	 * exista na base de Produto.
	 * 
	 * @param id
	 * 
	 */
	@Override
	public void removeObjeto(int id) {

		for (int i = 0; i < Artefatos.produtos.size(); i++) {

			if (Artefatos.produtos.get(i).getIdProduto() == id) {

				Artefatos.produtos.remove(i);

			}
		}

		System.out.println(IMensagemGeral.PRODUTO_DELETADO_SUCESSO);
		
	}

	/**
	 * M�todo listarObjeto ser� respons�vel em listar todos os Produto que estejam 
	 * na lista produtos.
	 */
	@Override
	public void listarObjeto() {
		
		for(Produto produto : Artefatos.produtos){
			System.out.println(produto.toString());
		}
		
	}
	
	/**
	 * 
	 * M�todo listarProdutoItemComandaDigital ser� respons�vel 
	 * em retornar todos os produtos que esteja inserido na lista produtos  
	 * 
	 */
	public void listarProdutoItemComandaDigital(){
		
		for(Produto produto : Artefatos.produtos){
			System.out.println("PRODUTO: ID: [" + produto.getIdProduto() + "] - NOME: [" + produto.getNome() + "]");
		}
		
	}

	/**
	 * 
	 * M�todo getObject ser� respons�vel em retornar um produto cujo ID exista na 
	 * base produtos. 
	 * 
	 * @param id
	 * 
	 */
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
