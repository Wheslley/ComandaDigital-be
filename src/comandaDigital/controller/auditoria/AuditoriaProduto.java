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

	/**
	 * 
	 * Método Getter referente ao atributo instance.
	 * 
	 * @return
	 */
	private static AuditoriaProduto getIntance() {
		return instance;
	}

	/**
	 * 
	 * Método Setter referente ao atributo instance.
	 * 
	 * @param aInstance
	 */
	private static void setInstance(AuditoriaProduto aInstance) {
		instance = aInstance;
	}

	/**
	 * Caso a variavel instance não estiver referência de nenhum ponto da
	 * memória, associamos a ela um endereço e instanciamos a própria classe,
	 * transformando-a em uma classe assincrôna.
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
	 * Método auditaObjeto fica como responsável em instanciar o menu solicitado pelo
	 * usuário, podendo este menu ser o MenuInsereProduto, MenuDeletaProduto ou 
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
	 * Método insereObjeto realizará a inclusão de um novo Produto na lista produtos.
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
	 * Método alteraObjeto será responsável em alterar um produto cujo ID já exista na 
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
	 * Método removeObjeto será responsável em remover um determinado produto cujo ID já
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
	 * Método listarObjeto será responsável em listar todos os Produto que estejam 
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
	 * Método listarProdutoItemComandaDigital será responsável 
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
	 * Método getObject será responsável em retornar um produto cujo ID exista na 
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
