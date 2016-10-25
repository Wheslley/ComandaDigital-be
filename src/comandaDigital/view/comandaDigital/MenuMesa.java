package comandaDigital.view.comandaDigital;

import java.util.Scanner;

import comandaDigital.controller.auditoria.AuditoriaMesa;
import comandaDigital.controller.auditoria.AuditoriaProduto;
import comandaDigital.model.comanda.ItemComandaDigital;
import comandaDigital.model.estabelecimento.Mesa;
import comandaDigital.model.produto.Produto;

/**
 * 
 * Classe MenuComandaDigital será responsável em exibir todas as opções disponíveis para a opção comanda digital
 * 
 * @author w_his
 *
 */
public class MenuMesa {
	
	private static MenuMesa instance;

	/**
	 * 
	 * Método Getter referente ao atributo instance
	 * 
	 * @return
	 */
    private static MenuMesa getIntance() {
        return instance;
    }

    /**
     * 
     * Método Setter referente ao atributo instance
     * 
     * @param aInstance
     */
    private static void setInstance(MenuMesa aInstance) {
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
    public static MenuMesa getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuMesa());
        }

        return getIntance();

    }
    
    /**
     * Menu completo contendo todas as opções do MenuCliente
     */
    public void getMenuMesa() {
    	
    	Scanner scan = new Scanner(System.in);
		int opcaoMenuMesa = 0;
		boolean flagMenuMesa = true;
		
		while (flagMenuMesa) {

			
			boolean flagMenu = true;
			
			System.out.println("************************************");
			System.out.println("*	     Menu Mesa           	   *");
			System.out.println("************************************");			
			System.out.println("*  1) Cadastro de Item na Comanda  *");
			System.out.println("*  2) Remoção de Mesa     		   *");
			System.out.println("*  3) Atualização de Mesa 		   *");
			System.out.println("*  4) Listar Mesas                 *");
			System.out.println("*  0) Sair                         *");
			System.out.println("************************************\n\n");
			
			while (flagMenu) {
				
				System.out.println("Digite a opção desejada ou digite [0] para sair: ");
				opcaoMenuMesa = scan.nextInt();
				
				if (opcaoMenuMesa > 0 && opcaoMenuMesa < 5) {
					
					AuditoriaMesa.getInstance().auditaObjeto(opcaoMenuMesa);
					flagMenu = false;
					
				} else if (opcaoMenuMesa == 0) {
					
					flagMenu = false;
					flagMenuMesa = false;
					
				} else {
					
					flagMenu = true;
					
				}
				
			}
			
		}
		
	}
    
    /**
     * Menu referente ao cadastro de um novo item na ComandaDigital
     */
    public void getMenuInsereItemComanda() {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("************************************");
		System.out.println("*	 Menu Insere Mesa    *");
		System.out.println("************************************\n");
		
		Mesa mesa = new Mesa();
		ItemComandaDigital itemComandaDigital = new ItemComandaDigital();
		
		System.out.println("\nCadastro da Mesa:\n");
		
		System.out.println("Numero da mesa: ");
		mesa.setNumeroMesa(scan.nextInt());
		
		if(AuditoriaMesa.getInstance().validaMesaComandaDigital(mesa)){
			
			System.out.println("Digite o id do produto: ");
			itemComandaDigital.setProduto( (Produto) AuditoriaProduto.getInstance().getObject(scan.nextInt()));
			
			System.out.println("Digite a quantidade do produto: ");
			itemComandaDigital.setQuantidadeProduto(scan.nextInt());
			
			mesa.getComandaDigital().setAddListItemComandaDigital(itemComandaDigital);
			
			AuditoriaMesa.getInstance().insereObjeto(mesa);
			
		}else{
			System.out.println("Mesa não existe ou não consta em aberto!!");
		}
		
		System.out.println("************************************\n");
		
    }
    
    /**
     * Menu referente a alteração de um determinado cliente tendo como referência o id do cliente
     */
    public void getMenuAlteracaoMesa() {

		Scanner scan = new Scanner(System.in);
	
		System.out.println("************************************");
		System.out.println("*	 Menu Atualização Mesa    *");
		System.out.println("************************************\n");
		
		Mesa mesa = new Mesa();
		ItemComandaDigital itemComandaDigital = new ItemComandaDigital();

		System.out.println("\nAtualização da Mesa:\n");
		
		System.out.println("Numero da mesa: ");
		mesa.setNumeroMesa(scan.nextInt());
		
		System.out.println("Id do item da comanda Digital: ");
		itemComandaDigital.setIdItemComandaDigital(scan.nextInt());
		
		if(AuditoriaMesa.getInstance().validaItemComandaDigital(mesa, itemComandaDigital)){
			
			System.out.println("Digite o id do produto: ");
			itemComandaDigital.setProduto( (Produto) AuditoriaProduto.getInstance().getObject(scan.nextInt()));
			
			System.out.println("Digite a quantidade do produto: ");
			itemComandaDigital.setQuantidadeProduto(scan.nextInt());
			
			mesa.getComandaDigital().setAddListItemComandaDigital(itemComandaDigital);
			
			//AuditoriaComandaDigital.getInstance().alteraObjeto(mesa);
			
		}else{
			System.out.println("Mesa ou item inexistente!!!");
		}
		
		System.out.println("************************************\n");
		
	}
    
    /**
     * Menu referente a exclusão de um determinado item da comanda digital.
     */
    public void getMenuDeletaMesa() {

		Scanner scan = new Scanner(System.in);
		int idItemComandaDigital = 0;
		
		System.out.println("************************************");
		System.out.println("*	 Menu Deleta ItemComandaDigital    *");
		System.out.println("************************************\n");
		
		System.out.println("\nDeleta a Mesa:\n");
		
		System.out.println("Id do Item: ");
		idItemComandaDigital = scan.nextInt();
		
		//AuditoriaComandaDigital.getInstance().removeObjeto(idItemComandaDigital);
		
		System.out.println("************************************\n");
		
	}
    
}
