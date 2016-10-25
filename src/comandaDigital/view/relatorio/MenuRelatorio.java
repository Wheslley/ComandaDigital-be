package comandaDigital.view.relatorio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

import comandaDigital.controller.auditoria.AuditoriaRelatorio;

/**
 * 
 * Classe MenuRelatorio será responsável em exibir todas as opções disponíveis para a opção relatório
 * 
 * @author w_his
 *
 */
public class MenuRelatorio {
	
	private static MenuRelatorio instance;

	/**
	 * 
	 * Método Getter referente ao atributo instance
	 * 
	 * @return
	 */
	private static MenuRelatorio getIntance() {
		return instance;
	}

	/**
	 * 
	 * Método Setter referente ao atributo instance
	 * 
	 * @param aInstance
	 */
	private static void setInstance(MenuRelatorio aInstance) {
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
	public static MenuRelatorio getInstance() {

		if (getIntance() == null) {
			setInstance(new MenuRelatorio());
		}

		return getIntance();

	}
	
    /**
     * Menu completo contendo todas as opções do MenuRelatorio
     */
    public void getMenuRelatorio() {

		Scanner scan = new Scanner(System.in);
		int opcaoMenuRelatorio = 0;
		boolean flagMenuRelatorio = true;
		
		while (flagMenuRelatorio) {
			
			boolean flagMenu = true;
			
			System.out.println("************************************");
			System.out.println("*	     Menu Relatorio 	       *");
			System.out.println("************************************");			
			System.out.println("*  1) Gerar relatorio         *");
			System.out.println("*  0) Sair                    *");
			System.out.println("************************************\n\n");
			
			while (flagMenu) {
				
				System.out.println("Digite a opção desejada ou digite [0] para sair: ");
				opcaoMenuRelatorio = scan.nextInt();
				
				if (opcaoMenuRelatorio > 0 && opcaoMenuRelatorio < 2) {
					
					AuditoriaRelatorio.getInstance().auditaObjeto(opcaoMenuRelatorio);
					flagMenu = false;
					
				} else if (opcaoMenuRelatorio == 0) {
					
					flagMenu = false;
					flagMenuRelatorio = false;
					
				} else {
					
					flagMenu = true;
					
				}
				
			}
		
		}
		
	}
    
    /**
     * Menu referente ao cadastro de um novo usuario
     * @throws IOException 
     */
    public void getMenuGeraRelatorio() throws IOException {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("************************************");
		System.out.println("*	    Menu Gera Relatorio        *");
		System.out.println("************************************\n");
		
		Writer w = new FileWriter("relatorio.txt");
		//OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(w);
		
		bw.write("Teste");
		bw.flush();
		
		w.close();
		
		//AuditoriaUsuario.getInstance().insereObjeto(usuario);
		
		System.out.println("************************************\n");
		
	}
	
}
