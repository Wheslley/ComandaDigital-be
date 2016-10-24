package comandaDigital.view.usuarios;

import java.util.Scanner;

import comandaDigital.controller.auditoria.AuditoriaUsuario;
import comandaDigital.model.pessoas.Usuario;

/**
 * 
 * Classe MenuUsuario ser� respons�vel em exibir todas as op��es dispon�veis para a op��o usu�rio
 * 
 * @author w_his
 *
 */
public class MenuUsuario {
	
	private static MenuUsuario instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance
	 * 
	 * @return
	 */
    private static MenuUsuario getIntance() {
        return instance;
    }

    /**
     * 
     * M�todo Setter referente ao atributo instance
     * 
     * @param aInstance
     */
    private static void setInstance(MenuUsuario aInstance) {
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
    public static MenuUsuario getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuUsuario());
        }

        return getIntance();

    }
    
    /**
     * Menu completo contendo todas as op��es do MenuUsuario
     */
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
    
    /**
     * Menu referente ao cadastro de um novo usuario
     */
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
    
    /**
     * Menu referente a altera��o de um determinado usu�rio tendo como refer�ncia o id do usu�rio
     */
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
    
    /**
     * Menu referente a exclus�o de um determinado usu�rio tendo como refer�ncia o id do usu�rio
     */
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
