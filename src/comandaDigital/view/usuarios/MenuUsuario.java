package comandaDigital.view.usuarios;

import java.util.Scanner;

import comandaDigital.controller.auditoria.AuditoriaUsuario;
import comandaDigital.model.pessoas.Usuario;

public class MenuUsuario {
	
	private static MenuUsuario instance;

    private static MenuUsuario getIntance() {
        return instance;
    }

    private static void setInstance(MenuUsuario aInstance) {
        instance = aInstance;
    }

    public static MenuUsuario getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuUsuario());
        }

        return getIntance();

    }
    
    public void getMenuUsuario() {

		Scanner scan = new Scanner(System.in);
		int opcaoMenuUsuario = 0;
		boolean flagMenuUsuario = true;
		
		while (flagMenuUsuario) {
			
			boolean flagMenu = true;
			
			System.out.println("************************************");
			System.out.println("*	     Menu Usuario	       *");
			System.out.println("************************************");			
			System.out.println("*  1) Cadastro de Usuario     *");
			System.out.println("*  2) Remo��o de Usuario      *");
			System.out.println("*  3) Atualiza��o de Usuario  *");
			System.out.println("*  4) Listar Usuario          *");
			System.out.println("*  0) Sair                    *");
			System.out.println("************************************\n\n");
			
			while (flagMenu) {
				
				System.out.println("Digite a op��o desejada ou digite [0] para sair: ");
				opcaoMenuUsuario = scan.nextInt();
				
				if (opcaoMenuUsuario > 0 && opcaoMenuUsuario < 5) {
					
					AuditoriaUsuario.getInstance().auditaObjeto(opcaoMenuUsuario);
					flagMenu = false;
					
				} else if (opcaoMenuUsuario == 0) {
					
					flagMenu = false;
					flagMenuUsuario = false;
					
				} else {
					
					flagMenu = true;
					
				}
				
			}
		
		}

	}
    
    public void getMenuInsereUsuario() {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("************************************");
		System.out.println("*	 Menu Insere Usuarios    *");
		System.out.println("************************************\n");
		
		Usuario usuario = new Usuario();
		
		System.out.println("\nCadastro do Usuario:\n");
		
		System.out.println("Nome: ");
		usuario.setNome(scan.next());
		
		System.out.println("Email: ");
		usuario.setEmail(scan.next());
		
		System.out.println("Telefone: ");
		usuario.setTelefone(scan.next());
		
		System.out.println("Logradouro: ");
		usuario.setLogradouro(scan.next());
		
		System.out.println("Bairro: ");
		usuario.setBairro(scan.next());
		
		System.out.println("Cep: ");
		usuario.setCep(scan.nextInt());
		
		System.out.println("Cidade: ");
		usuario.setCidade(scan.next());
		
		System.out.println("UF: ");
		usuario.setUf(scan.next());
		
		System.out.println("Senha: ");
		usuario.setSenha(scan.next());
		
		AuditoriaUsuario.getInstance().insereObjeto(usuario);
		
		System.out.println("************************************\n");
		
	}
    
    public void getMenuAlteracaoUsuario() {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("************************************");
		System.out.println("*	 Menu Atualiza��o de Usuario    *");
		System.out.println("************************************\n");
		
		System.out.println("Id do Usuario: ");
		Usuario usuario = (Usuario) AuditoriaUsuario.getInstance().getObject(scan.nextInt());
		
		System.out.println("\nAtualiza��es do Usuario:\n");
		
		System.out.println("Nome: ");
		usuario.setNome(scan.next());
		
		System.out.println("Email: ");
		usuario.setEmail(scan.next());
		
		System.out.println("Telefone: ");
		usuario.setTelefone(scan.next());
		
		System.out.println("Logradouro: ");
		usuario.setLogradouro(scan.next());
		
		System.out.println("Bairro: ");
		usuario.setBairro(scan.next());
		
		System.out.println("Cep: ");
		usuario.setCep(scan.nextInt());
		
		System.out.println("Cidade: ");
		usuario.setCidade(scan.next());
		
		System.out.println("UF: ");
		usuario.setUf(scan.next());
		
		System.out.println("Senha: ");
		usuario.setSenha(scan.next());
		
		AuditoriaUsuario.getInstance().alteraObjeto(usuario);
		
		System.out.println("************************************\n");
		
	}
    
    public void getMenuDeletaUsuario() {

		Scanner scan = new Scanner(System.in);
		int idUsuario = 0;
		
		System.out.println("************************************");
		System.out.println("*	 Menu Deleta Usuario    *");
		System.out.println("************************************\n");
		
		System.out.println("\nDeleta o Usuario:\n");
		
		System.out.println("Id: ");
		idUsuario = scan.nextInt();
		
		AuditoriaUsuario.getInstance().removeObjeto(idUsuario);
		
		System.out.println("************************************\n");
		
	}
    
}
