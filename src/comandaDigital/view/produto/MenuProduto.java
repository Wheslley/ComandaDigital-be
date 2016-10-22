package comandaDigital.view.produto;

import java.util.Scanner;

import comandaDigital.controller.auditoria.AuditoriaProduto;
import comandaDigital.controller.auditoria.AuditoriaUsuario;
import comandaDigital.model.produto.Produto;

/**
 * 
 * @author whesl
 *
 */
public class MenuProduto {

	private static MenuProduto instance;

	private static MenuProduto getIntance() {
		return instance;
	}

	private static void setInstance(MenuProduto aInstance) {
		instance = aInstance;
	}

	public static MenuProduto getInstance() {

		if (getIntance() == null) {
			setInstance(new MenuProduto());
		}

		return getIntance();

	}
	
	public void getMenuProduto() {

		Scanner scan = new Scanner(System.in);
		int opcaoMenuProduto = 0;
		boolean flagMenuProduto = true;
		
		while (flagMenuProduto) {
			
			boolean flagMenu = true;
			
			System.out.println("************************************");
			System.out.println("*	     Menu Produto	       *");
			System.out.println("************************************");			
			System.out.println("*  1) Cadastro de Produto     *");
			System.out.println("*  2) Remoção de Produto      *");
			System.out.println("*  3) Atualização de Produto  *");
			System.out.println("*  4) Listar Produto          *");
			System.out.println("*  0) Sair                    *");
			System.out.println("************************************\n\n");
			
			while (flagMenu) {
				
				System.out.println("Digite a opção desejada ou digite [0] para sair: ");
				opcaoMenuProduto = scan.nextInt();
				
				if (opcaoMenuProduto > 0 && opcaoMenuProduto < 5) {
					
					AuditoriaProduto.getInstance().auditaObjeto(opcaoMenuProduto);
					flagMenu = false;
					
				} else if (opcaoMenuProduto == 0) {
					
					flagMenu = false;
					flagMenuProduto = false;
					
				} else {
					
					flagMenu = true;
					
				}
				
			}
			
		}

	}
    
    public void getMenuInsereProduto() {
		
    	Scanner scan = new Scanner(System.in);
    	
		System.out.println("************************************");
		System.out.println("*	 Menu Insere Produtos    *");
		System.out.println("************************************\n");
		
		Produto produto = new Produto();
		
		System.out.println("\nCadastro do Produto:\n");
		
		System.out.println("Nome: ");
		produto.setNome(scan.next());
		
		System.out.println("Descricao: ");
		produto.setDescricao(scan.next());
		
		System.out.println("Valor Base: ");
		produto.setValorBase(scan.nextDouble());
		
		System.out.println("Valor Venda: ");
		produto.setValorVenda(scan.nextDouble());
		
		AuditoriaProduto.getInstance().insereObjeto(produto);
		
		System.out.println("************************************\n");
		
	}
    
    public void getMenuAlteracaoProduto() {
		
    	Scanner scan = new Scanner(System.in);
    	
		System.out.println("************************************");
		System.out.println("*	 Menu Atualização de Produto    *");
		System.out.println("************************************\n");
		
		System.out.println("Id do Produto: ");
		Produto produto = (Produto) AuditoriaProduto.getInstance().getObject(scan.nextInt());
		
		System.out.println("\nAtualizações do Produto:\n");
		
		System.out.println("Nome: ");
		produto.setNome(scan.next());
		
		System.out.println("Descricao: ");
		produto.setDescricao(scan.next());
		
		System.out.println("Valor Base: ");
		produto.setValorBase(scan.nextDouble());
		
		System.out.println("Valor Venda: ");
		produto.setValorVenda(scan.nextDouble());
		
		AuditoriaProduto.getInstance().alteraObjeto(produto);
		
		System.out.println("************************************\n");
		
	}
    
    public void getMenuDeletaProduto() {
    	
    	Scanner scan = new Scanner(System.in);
		int idProduto = 0;
		
		System.out.println("************************************");
		System.out.println("*	 Menu Deleta Produto    *");
		System.out.println("************************************\n");
		
		System.out.println("\nDeleta o Produto:\n");
		
		System.out.println("Id: ");
		idProduto = scan.nextInt();
		
		AuditoriaProduto.getInstance().removeObjeto(idProduto);
		
		System.out.println("************************************\n");
		
	}
    
}
