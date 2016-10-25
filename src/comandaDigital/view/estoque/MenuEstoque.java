package comandaDigital.view.estoque;

import java.util.Scanner;

import comandaDigital.controller.auditoria.AuditoriaCliente;
import comandaDigital.controller.auditoria.AuditoriaEstoque;
import comandaDigital.controller.auditoria.AuditoriaProduto;
import comandaDigital.model.estabelecimento.Estoque;
import comandaDigital.model.pessoas.Cliente;
import comandaDigital.model.produto.Produto;

/**
 * 
 * Classe MenuEstoque ser� respons�vel em exibir todas as op��es dispon�veis para a op��o estoque
 * 
 * @author whesl
 *
 */
public class MenuEstoque {
	
	private static MenuEstoque instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance
	 * 
	 * @return
	 */
    private static MenuEstoque getIntance() {
        return instance;
    }

    /**
     * 
     * M�todo Setter referente ao atributo instance
     * 
     * @param aInstance
     */
    private static void setInstance(MenuEstoque aInstance) {
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
    public static MenuEstoque getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuEstoque());
        }

        return getIntance();

    }
    
    /**
     * Menu completo contendo todas as op��es do MenuEstoque
     */
    public void getMenuEstoque() {
    	
    	Scanner scan = new Scanner(System.in);
		int opcaoMenuEstoque = 0;
		boolean flagMenuEstoque = true;
		
		while (flagMenuEstoque) {

			
			boolean flagMenu = true;
			
			System.out.println("************************************");
			System.out.println("*	     Menu Estoque	       *");
			System.out.println("************************************");			
			System.out.println("*  1) Cadastro de Estoque     *");
			System.out.println("*  2) Remo��o de Estoque      *");
			System.out.println("*  3) Atualiza��o de Estoque  *");
			System.out.println("*  4) Listar Estoque          *");
			System.out.println("*  0) Sair                    *");
			System.out.println("************************************\n\n");
			
			while (flagMenu) {
				
				System.out.println("Digite a op��o desejada ou digite [0] para sair: ");
				opcaoMenuEstoque = scan.nextInt();
				
				if (opcaoMenuEstoque > 0 && opcaoMenuEstoque < 5) {
					
					AuditoriaEstoque.getInstance().auditaObjeto(opcaoMenuEstoque);
					flagMenu = false;
					
				} else if (opcaoMenuEstoque == 0) {
					
					flagMenu = false;
					flagMenuEstoque = false;
					
				} else {
					
					flagMenu = true;
					
				}
				
			}
			
		}
		
	}
    
    /**
     * Menu referente ao cadastro do estoque
     */
    public void getMenuInsereEstoque() {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("************************************");
		System.out.println("*	 Menu Insere Estoque    *");
		System.out.println("************************************\n");
		
		Produto produto = new Produto();
		Estoque estoque = new Estoque();
		
		System.out.println("\nCadastro do Estoque:\n");
		
		System.out.println("Id do Produto: ");
		produto = (Produto) AuditoriaProduto.getInstance().getObject(scan.nextInt());
		estoque.setIdProduto(produto.getIdProduto());
		
		System.out.println("Quantidade do Produto: ");
		estoque.setQuantidadeProduto(scan.nextInt());
		
		AuditoriaEstoque.getInstance().insereObjeto(estoque);
		
		System.out.println("************************************\n");
		
    }
    
    /**
     * Menu referente a altera��o de um determinado produto no estoque tendo como refer�ncia o id do produto
     */
    public void getMenuAlteracaoEstoque() {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("************************************");
		System.out.println("*	 Menu Atualiza��o de Estoque    *");
		System.out.println("************************************\n");
		
		Produto produto = new Produto();
		Estoque estoque = new Estoque();
		
		System.out.println("Atualiza��o do Estoque:\n");
		
		System.out.println("Id do Produto: ");
		produto = (Produto) AuditoriaProduto.getInstance().getObject(scan.nextInt());
		estoque.setIdProduto(produto.getIdProduto());
		
		System.out.println("Quantidade do Produto: ");
		estoque.setQuantidadeProduto(scan.nextInt());
		
		AuditoriaEstoque.getInstance().alteraObjeto(estoque);
		
		System.out.println("************************************\n");
		
	}
    
    /**
     * Menu referente a exclus�o de um determinado produto no estoque tendo como refer�ncia o id do produto
     */
    public void getMenuDeletaEstoque() {

		Scanner scan = new Scanner(System.in);
		int idProduto = 0;
		
		System.out.println("************************************");
		System.out.println("*	 Menu Deleta Estoque    *");
		System.out.println("************************************\n");
		
		System.out.println("\nDeleta o Estoque:\n");
		
		System.out.println("Id do Produto: ");
		idProduto = scan.nextInt();
		
		AuditoriaEstoque.getInstance().removeObjeto(idProduto);
		
		System.out.println("************************************\n");
		
	}
    
}
