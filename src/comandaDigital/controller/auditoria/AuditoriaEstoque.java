package comandaDigital.controller.auditoria;

import java.util.Map;

import comandaDigital.model.estabelecimento.Estoque;
import comandaDigital.view.estoque.MenuEstoque;
import interfaces.mensagens.IMensagemGeral;
import interfaces.padroes.IMenuCrudPadrão;
import localStorage.Artefatos;

/**
 * 
 * 
 * 
 * @author whesl
 *
 */

public class AuditoriaEstoque implements IMenuCrudPadrão {

	private static AuditoriaEstoque instance;

	/**
	 * 
	 * Método Getter referente ao atributo instance.
	 * 
	 * @return
	 */
	private static AuditoriaEstoque getIntance() {
		return instance;
	}

	/**
	 * 
	 * Método Setter referente ao atributo instance.
	 * 
	 * @param aInstance
	 */
	private static void setInstance(AuditoriaEstoque aInstance) {
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
	public static AuditoriaEstoque getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaEstoque());
		}

		return getIntance();

	}

	/**
	 * Método auditaObjeto fica como responsável em instanciar o menu solicitado pelo
	 * usuário, podendo este menu ser o MenuInsereEstoque, MenuDeletaEstoque ou 
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
	 * Método insereObjeto realizará a inclusão de um novo Produto na base estoque.
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
	 * Método alteraObjeto será responsável em verificar se existe um Produto na base 
	 * estoque pelo ID que está sendo passado por parametro, existindo este produto,
	 * o mesmo será atualizado.
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
	 * Método alteraObjeto será responsável em verificar se existe um Produto na base 
	 * estoque pelo ID que está sendo passado por parametro, existindo este produto,
	 * o mesmo será removido.
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
	 * Método listarObjeto será responsável em listar todos os Produtos que estejam 
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
	 * Método não implementado.
	 * 
	 * @param id
	 * 
	 */
	@Override
	public Object getObject(int id) {

		Estoque estoque = new Estoque();
		System.out.println("Metodo não implementado!!!");

		return estoque;

	}

}
