package comandaDigital.view.funcionario;

import java.util.Scanner;

import comandaDigital.controller.auditoria.AuditoriaFuncionario;
import comandaDigital.model.pessoas.Funcionario;

public class MenuFuncionario {
	
	private static MenuFuncionario instance;

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

		Scanner scan = new Scanner(System.in);
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

		Scanner scan = new Scanner(System.in);
		
		System.out.println("************************************");
		System.out.println("*	 Menu Insere Funcionario    *");
		System.out.println("************************************\n");
		
		Funcionario funcionario = new Funcionario();
		
		System.out.println("\nCadastro do Funcionario:\n");
		
		System.out.println("Nome: ");
		funcionario.setNome(scan.next());
		
		System.out.println("Email: ");
		funcionario.setEmail(scan.next());
		
		System.out.println("Telefone: ");
		funcionario.setTelefone(scan.next());
		
		System.out.println("Logradouro: ");
		funcionario.setLogradouro(scan.next());
		
		System.out.println("Bairro: ");
		funcionario.setBairro(scan.next());
		
		System.out.println("Cep: ");
		funcionario.setCep(scan.nextInt());
		
		System.out.println("Cidade: ");
		funcionario.setCidade(scan.next());
		
		System.out.println("UF: ");
		funcionario.setUf(scan.next());
		
		System.out.println("Função: ");
		funcionario.setFuncao(scan.next());
		
		System.out.println("Salario: ");
		funcionario.setSalario(scan.nextDouble());
		
		AuditoriaFuncionario.getInstance().insereObjeto(funcionario);
		
		System.out.println("************************************\n");
		
	}
    
    public void getMenuAlteracaoFuncionario() {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("************************************");
		System.out.println("*	 Menu Atualização de Funcionario    *");
		System.out.println("************************************\n");
		
		System.out.println("Id do Funcionario: ");
		Funcionario funcionario = (Funcionario) AuditoriaFuncionario.getInstance().getObject(scan.nextInt());
		
		System.out.println(funcionario.getNome());
		
		System.out.println("\nAtualizações do funcionario:\n");
		
		System.out.println("Nome: ");
		funcionario.setNome(scan.next());
		
		System.out.println("Email: ");
		funcionario.setEmail(scan.next());
		
		System.out.println("Telefone: ");
		funcionario.setTelefone(scan.next());
		
		System.out.println("Logradouro: ");
		funcionario.setLogradouro(scan.next());
		
		System.out.println("Bairro: ");
		funcionario.setBairro(scan.next());
		
		System.out.println("Cep: ");
		funcionario.setCep(scan.nextInt());
		
		System.out.println("Cidade: ");
		funcionario.setCidade(scan.next());
		
		System.out.println("UF: ");
		funcionario.setUf(scan.next());
		
		System.out.println("Função: ");
		funcionario.setFuncao(scan.next());
		
		System.out.println("Salario: ");
		funcionario.setSalario(scan.nextDouble());
		
		AuditoriaFuncionario.getInstance().alteraObjeto(funcionario);
		
		System.out.println("************************************\n");
		
	}
    
    public void getMenuDeletaFuncionario() {

		Scanner scan = new Scanner(System.in);
		int idFuncionario = 0;
		
		System.out.println("************************************");
		System.out.println("*	 Menu Deleta Funcionario    *");
		System.out.println("************************************\n");
		
		System.out.println("\nDeleta o Funcionario:\n");
		
		System.out.println("Id: ");
		idFuncionario = scan.nextInt();
		
		AuditoriaFuncionario.getInstance().removeObjeto(idFuncionario);
		
		System.out.println("************************************\n");
		
	}
    
}
