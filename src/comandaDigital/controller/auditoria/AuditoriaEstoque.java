package comandaDigital.controller.auditoria;

import java.util.Map;

import comandaDigital.model.estabelecimento.Estoque;
import comandaDigital.view.estoque.MenuEstoque;
import interfaces.mensagens.IMensagemGeral;
import interfaces.padroes.IMenuCrudPadr�o;
import localStorage.Artefatos;

/**
 * 
 * 
 * 
 * @author whesl
 *
 */

public class AuditoriaEstoque implements IMenuCrudPadr�o {

	private static AuditoriaEstoque instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance.
	 * 
	 * @return
	 */
	private static AuditoriaEstoque getIntance() {
		return instance;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo instance.
	 * 
	 * @param aInstance
	 */
	private static void setInstance(AuditoriaEstoque aInstance) {
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
	public static AuditoriaEstoque getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaEstoque());
		}

		return getIntance();

	}

	/**
	 * M�todo auditaObjeto fica como respons�vel em instanciar o menu solicitado pelo
	 * usu�rio, podendo este menu ser o MenuInsereEstoque, MenuDeletaEstoque ou 
	 * MenuAlteracaoEstoque.
	 * 
	 * @param opcaoMenu
	 * 
	 */
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

	/**
	 * M�todo insereObjeto realizar� a inclus�o de um novo Produto na base estoque.
	 * 
	 * @param object
	 * 
	 */
	@Override
	public void insereObjeto(Object object) {

		Estoque estoque = (Estoque) object;

		Artefatos.estoque.put(estoque.getIdProduto(), estoque.getQuantidadeProduto());

		System.out.println(IMensagemGeral.ESTOQUE_INSERIDO_SUCESSO);

	}

	/**
	 * 
	 * M�todo alteraObjeto ser� respons�vel em verificar se existe um Produto na base 
	 * estoque pelo ID que est� sendo passado por parametro, existindo este produto,
	 * o mesmo ser� atualizado.
	 * 
	 * @param object
	 * 
	 */
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

	/**
	 * 
	 * M�todo alteraObjeto ser� respons�vel em verificar se existe um Produto na base 
	 * estoque pelo ID que est� sendo passado por parametro, existindo este produto,
	 * o mesmo ser� removido.
	 * 
	 * @param id
	 * 
	 */
	@Override
	public void removeObjeto(int id) {

		Integer idProduto = id;
		Artefatos.estoque.remove(idProduto);

		System.out.println(IMensagemGeral.ESTOQUE_DELETADO_SUCESSO);
		
	}

	/**
	 * 
	 * M�todo listarObjeto ser� respons�vel em listar todos os Produtos que estejam 
	 * na base estoque.
	 * 
	 */
	@Override
	public void listarObjeto() {

		for (Map.Entry<Integer, Integer> entry : Artefatos.estoque.entrySet()) {
			
			System.out.println("IdProduto: " + entry.getKey() + " - Quantidade: " + entry.getValue());
			
		}

	}

	/**
	 * 
	 * M�todo n�o implementado.
	 * 
	 * @param id
	 * 
	 */
	@Override
	public Object getObject(int id) {

		Estoque estoque = new Estoque();
		System.out.println("Metodo n�o implementado!!!");

		return estoque;

	}

}
