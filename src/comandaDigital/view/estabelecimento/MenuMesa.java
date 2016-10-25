package comandaDigital.view.estabelecimento;

import java.util.Scanner;

import comandaDigital.controller.auditoria.AuditoriaMesa;
import comandaDigital.controller.auditoria.AuditoriaProduto;
import comandaDigital.model.comanda.ItemComandaDigital;
import comandaDigital.model.estabelecimento.Mesa;
import comandaDigital.model.produto.Produto;

/**
 * 
 * Classe MenuMesa ser� respons�vel em exibir todas as op��es dispon�veis para a op��o mesa
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
     * Menu completo contendo todas as op��es do MenuMesa
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
			System.out.println("*  2) Fechar Mesas       		   *");
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
			
			System.out.println("\n[1] Pesquisar Produto.");
			System.out.println("[2] Inserir Produto.\n");
			
			int opcaoPesquisarProduto = scan.nextInt();
			
			if(opcaoPesquisarProduto == 1){
				AuditoriaProduto.getInstance().listarProdutoItemComandaDigital();
			}
			
			System.out.println("\nDigite o id do produto: ");
			itemComandaDigital.setProduto( (Produto) AuditoriaProduto.getInstance().getObject(scan.nextInt()));
			
			System.out.println("Digite a quantidade do produto: ");
			itemComandaDigital.setQuantidadeProduto(scan.nextInt());
			
			itemComandaDigital.setIdItemComandaDigital(AuditoriaMesa.getInstance().contaItemComandaDigital(mesa));
			
			mesa.getComandaDigital().setAddListItemComandaDigital(itemComandaDigital);
			
			AuditoriaMesa.getInstance().insereObjeto(mesa);
			
		}else{
			System.out.println("Mesa n�o existe ou n�o consta em aberto!!");
		}
		
		System.out.println("************************************\n");
		
    }
    
    /**
     * Menu referente a altera��o de uma determinada mesa pelo seu numero
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
		
		if(AuditoriaMesa.getInstance().validaMesaComandaDigital(mesa)){
			
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
     * Menu referente ao fechamento da Mesa
     */
    public void getMenuFecharMesa() {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("************************************");
		System.out.println("*	     Menu Fechar Mesa          *");
		System.out.println("************************************\n");
		
		Mesa mesa = new Mesa();
		
		System.out.println("\nFechar Mesa:\n");
		
		System.out.println("Numero da mesa: ");
		mesa.setNumeroMesa(scan.nextInt());
		
		if(AuditoriaMesa.getInstance().validaMesaComandaDigital(mesa)){
						
			AuditoriaMesa.getInstance().fechaMesa(mesa);
			
		}else{
			System.out.println("Mesa n�o existe ou n�o consta em aberto!!");
		}
		
		System.out.println("************************************\n");
		
    }
    
}
