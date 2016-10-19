package comandaDigital.view.cliente;

import java.util.Scanner;

import comandaDigital.controller.auditoria.AuditoriaCliente;
import comandaDigital.model.pessoas.Cliente;

public class MenuCliente {
	
	private static MenuCliente instance;

    private static MenuCliente getIntance() {
        return instance;
    }

    private static void setInstance(MenuCliente aInstance) {
        instance = aInstance;
    }

    public static MenuCliente getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuCliente());
        }

        return getIntance();

    }
    
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
			System.out.println("*  2) Remoção de cliente      *");
			System.out.println("*  3) Atualização de cliente  *");
			System.out.println("*  4) Listar clientes   *");
			System.out.println("*  0) Sair                    *");
			System.out.println("************************************\n\n");
			
			while (flagMenu) {
				
				System.out.println("Digite a opção desejada ou digite [0] para sair: ");
				opcaoMenuCliente = scan.nextInt();
				
				if (opcaoMenuCliente > 0 && opcaoMenuCliente < 5) {
					
					AuditoriaCliente.getInstance().auditaObjeto(opcaoMenuCliente);
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
    
    public void getMenuAlteracaoCliente() {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("************************************");
		System.out.println("*	 Menu Atualização de Cliente    *");
		System.out.println("************************************\n");
		
		System.out.println("Id do cliente: ");
		Cliente cliente = (Cliente) AuditoriaCliente.getInstance().getObject(scan.nextInt());
		
		System.out.println(cliente.getNome());
		
		System.out.println("\nAtualizações do cliente:\n");
		
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
