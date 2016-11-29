package comandaDigital.view.cliente;

import java.util.Scanner;

import comandaDigital.controller.auditoria.AuditoriaCliente;
import comandaDigital.model.pessoas.Cliente;

/**
 * 
 * Classe MenuCliente ser� respons�vel em exibir todas as op��es dispon�veis para a op��o cliente
 * 
 * @author whesl
 *
 */

public class MenuCliente {
	
	private static MenuCliente instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance
	 * 
	 * @return
	 */
    private static MenuCliente getIntance() {
        return instance;
    }

    /**
     * 
     * M�todo Setter referente ao atributo instance
     * 
     * @param aInstance
     */
    private static void setInstance(MenuCliente aInstance) {
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
    public static MenuCliente getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuCliente());
        }

        return getIntance();

    }
    
    
    /**
     * Menu completo contendo todas as op��es do MenuCliente
     */
    public void getMenuCliente() {
    	
    	Scanner scan = new Scanner(System.in);
		int opcaoMenuCliente = 0;
		boolean flagMenuCliente = true;
		
		while (flagMenuCliente) {

			
			boolean flagMenu = true;
			
			System.out.println("************************************");
			System.out.println("*	     Menu Cliente	       *");
			System.out.println("************************************");			
			System.out.println("*  1) Cadastro de cliente     *");
			System.out.println("*  2) Remo��o de cliente      *");
			System.out.println("*  3) Atualiza��o de cliente  *");
			System.out.println("*  4) Listar clientes   *");
			System.out.println("*  0) Sair                    *");
			System.out.println("************************************\n\n");
			
			while (flagMenu) {
				
				System.out.println("Digite a op��o desejada ou digite [0] para sair: ");
				opcaoMenuCliente = scan.nextInt();
				
				if (opcaoMenuCliente > 0 && opcaoMenuCliente < 5) {
					
					AuditoriaCliente.getInstance().validaMenu(opcaoMenuCliente);
					flagMenu = false;
					
				} else if (opcaoMenuCliente == 0) {
					
					flagMenu = false;
					flagMenuCliente = false;
					
				} else {
					
					flagMenu = true;
					
				}
				
			}
			
		}
		
	}
    
    /**
     * Menu referente ao cadastro de um novo cliente
     */
    public void getMenuInsereCliente() {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("************************************");
		System.out.println("*	 Menu Insere Cliente    *");
		System.out.println("************************************\n");
		
		Cliente cliente = new Cliente();
		
		System.out.println("\nCadastro do Cliente:\n");
		
		System.out.println("Nome: ");
		cliente.setNome(scan.next());
		
		System.out.println("Email: ");
		cliente.setEmail(scan.next());
		
		System.out.println("Telefone: ");
		cliente.setTelefone(scan.next());
		
		System.out.println("Logradouro: ");
		cliente.setLogradouro(scan.next());
		
		System.out.println("Bairro: ");
		cliente.setBairro(scan.next());
		
		System.out.println("Cep: ");
		cliente.setCep(scan.nextInt());
		
		System.out.println("Cidade: ");
		cliente.setCidade(scan.next());
		
		System.out.println("UF: ");
		cliente.setUf(scan.next());
		
		AuditoriaCliente.getInstance().insereObjeto(cliente);
		
		System.out.println("************************************\n");
		
    }
    
    /**
     * Menu referente a altera��o de um determinado cliente tendo como refer�ncia o id do cliente
     */
    public void getMenuAlteracaoCliente() {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("************************************");
		System.out.println("*	 Menu Atualiza��o de Cliente    *");
		System.out.println("************************************\n");
		
		System.out.println("Id do cliente: ");
		Cliente cliente = (Cliente) AuditoriaCliente.getInstance().getObject(scan.nextInt());
		
		System.out.println(cliente.getNome());
		
		System.out.println("\nAtualiza��es do cliente:\n");
		
		System.out.println("Nome: ");
		cliente.setNome(scan.next());
		
		System.out.println("Email: ");
		cliente.setEmail(scan.next());
		
		System.out.println("Telefone: ");
		cliente.setTelefone(scan.next());
		
		System.out.println("Logradouro: ");
		cliente.setLogradouro(scan.next());
		
		System.out.println("Bairro: ");
		cliente.setBairro(scan.next());
		
		System.out.println("Cep: ");
		cliente.setCep(scan.nextInt());
		
		System.out.println("Cidade: ");
		cliente.setCidade(scan.next());
		
		System.out.println("UF: ");
		cliente.setUf(scan.next());
		
		AuditoriaCliente.getInstance().alteraObjeto(cliente);
		
		System.out.println("************************************\n");
		
	}
    
    /**
     * Menu referente a exclus�o de um determinado cliente tendo como refer�ncia o id do cliente
     */
    public void getMenuDeletaCliente() {

		Scanner scan = new Scanner(System.in);
		int idCliente = 0;
		
		System.out.println("************************************");
		System.out.println("*	 Menu Deleta Cliente    *");
		System.out.println("************************************\n");
		
		System.out.println("\nDeleta o Cliente:\n");
		
		System.out.println("Id: ");
		idCliente = scan.nextInt();
		
		AuditoriaCliente.getInstance().removeObjeto(idCliente);
		
		System.out.println("************************************\n");
		
	}

}
