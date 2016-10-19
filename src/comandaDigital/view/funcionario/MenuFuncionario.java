package comandaDigital.view.funcionario;

import java.util.Scanner;

import comandaDigital.controller.auditoria.AuditoriaFuncionario;
import comandaDigital.controller.auditoria.AuditoriaUsuario;
import comandaDigital.model.pessoas.Funcionario;
import comandaDigital.model.pessoas.Usuario;

/**
 * 
 * @author whesl
 *
 */

public class MenuFuncionario {
	
	private static MenuFuncionario instance;
	private Scanner scan = new Scanner(System.in);

    private static MenuFuncionario getIntance() {
        return instance;
    }

    private static void setInstance(MenuFuncionario aInstance) {
        instance = aInstance;
    }

    public static MenuFuncionario getInstance() {

        if (getIntance() == null) {
            setInstance(new MenuFuncionario());
        }

        return getIntance();

    }
    
    public void getMenuFuncionario() {

		int opcaoMenuFuncionario = 0;
		boolean flagMenuFuncionario = true;
		
		while (flagMenuFuncionario) {
			
			boolean flagMenu = true;
			
			System.out.println("************************************");
			System.out.println("*	     Menu Funcionario	       *");
			System.out.println("************************************");			
			System.out.println("*  1) Cadastro de funcionario     *");
			System.out.println("*  2) Remoção de funcionario      *");
			System.out.println("*  3) Atualização de funcionario  *");
			System.out.println("*  4) Listar funcionarios   *");
			System.out.println("*  0) Sair                    *");
			System.out.println("************************************\n\n");
			
			while (flagMenu) {
				
				System.out.println("Digite a opção desejada ou digite [0] para sair: ");
				opcaoMenuFuncionario = scan.nextInt();
				
				if (opcaoMenuFuncionario > 0 && opcaoMenuFuncionario < 5) {
					
					AuditoriaFuncionario.getInstance().auditaObjeto(opcaoMenuFuncionario);
					flagMenu = false;
					
				} else if (opcaoMenuFuncionario == 0) {
					
					flagMenu = false;
					flagMenuFuncionario = false;
					
				} else {
					
					flagMenu = true;
					
				}
				
			}
			
		}

	}
    
    public void getMenuInsereFuncionario() {

		Funcionario funcionario = new Funcionario();
		
		System.out.println("************************************");
		System.out.println("*	 Menu Insere Funcionario    *");
		System.out.println("************************************\n");
		
		System.out.println("\nCadastro do Funcionario:\n");
		
		System.out.println("Id de Usuario: ");
		Usuario usuario = (Usuario) AuditoriaUsuario.getInstance().getObject(scan.nextInt());
		
		System.out.println("Função: ");
		funcionario.setFuncao(scan.next());
		
		System.out.println("Salario: ");
		funcionario.setSalario(scan.nextDouble());
		
		funcionario.setUsuario(usuario);
		
		AuditoriaFuncionario.getInstance().insereObjeto(funcionario);
		
		System.out.println("************************************\n");
		
	}
    
    public void getMenuAlteracaoFuncionario() {

		Funcionario funcionario = new Funcionario();
		
		System.out.println("************************************");
		System.out.println("*	 Menu Atualização de Funcionario    *");
		System.out.println("************************************\n");
		
		System.out.println("Id de Usuario: ");
		Usuario usuario = (Usuario) AuditoriaUsuario.getInstance().getObject(scan.nextInt());
				
		System.out.println("\nAtualizações do funcionario:\n");
		
		System.out.println("Função: ");
		funcionario.setFuncao(scan.next());
		
		System.out.println("Salario: ");
		funcionario.setSalario(scan.nextDouble());
		
		funcionario.setUsuario(usuario);
		
		AuditoriaFuncionario.getInstance().alteraObjeto(funcionario);
		
		System.out.println("************************************\n");
		
	}
    
    public void getMenuDeletaFuncionario() {

		System.out.println("************************************");
		System.out.println("*	 Menu Deleta Funcionario    *");
		System.out.println("************************************\n");
		
		System.out.println("\nDeleta o Funcionario:\n");
		
		System.out.println("Id de Usuario: ");
		Usuario usuario = (Usuario) AuditoriaUsuario.getInstance().getObject(scan.nextInt());
		
		AuditoriaFuncionario.getInstance().removeObjeto(usuario.getId());
		
		System.out.println("************************************\n");
		
	}
    
}
