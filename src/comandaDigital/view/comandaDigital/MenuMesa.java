package comandaDigital.view.comandaDigital;

import java.util.Scanner;

import comandaDigital.controller.auditoria.AuditoriaMesa;
import comandaDigital.controller.auditoria.AuditoriaProduto;
import comandaDigital.model.comanda.ItemComandaDigital;
import comandaDigital.model.estabelecimento.Mesa;
import comandaDigital.model.produto.Produto;

/**
 * 
 * Classe MenuComandaDigital ser� respons�vel em exibir todas as op��es dispon�veis para a op��o comanda digital
 * 
 * @author w_his
 *
 */
public class MenuMesa {
	
	private static MenuMesa instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance
	 * 
	 * @return
	 */
    private static MenuMesa getIntance() {
        return instance;
    }

    /**
     * 
     * M�todo Setter referente ao atributo instance
     * 
     * @param aInstance
     */
    private static void setInstance(MenuMesa aInstance) {
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
    public static MenuMesa getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuMesa());
        }

        return getIntance();

    }
    
    /**
     * Menu completo contendo todas as op��es do MenuCliente
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
			System.out.println("*  2) Remo��o de Mesa     		   *");
			System.out.println("*  3) Atualiza��o de Mesa 		   *");
			System.out.println("*  4) Listar Mesas                 *");
			System.out.println("*  0) Sair                         *");
			System.out.println("************************************\n\n");
			
			while (flagMenu) {
				
				System.out.println("Digite a op��o desejada ou digite [0] para sair: ");
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
			System.out.println("Mesa n�o existe ou n�o consta em aberto!!");
		}
		
		System.out.println("************************************\n");
		
    }
    
    /**
     * Menu referente a altera��o de um determinado cliente tendo como refer�ncia o id do cliente
     */
    public void getMenuAlteracaoMesa() {

		Scanner scan = new Scanner(System.in);
	
		System.out.println("************************************");
		System.out.println("*	 Menu Atualiza��o Mesa    *");
		System.out.println("************************************\n");
		
		Mesa mesa = new Mesa();
		ItemComandaDigital itemComandaDigital = new ItemComandaDigital();

		System.out.println("\nAtualiza��o da Mesa:\n");
		
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
     * Menu referente a exclus�o de um determinado item da comanda digital.
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
