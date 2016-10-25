package comandaDigital.view.relatorio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Map;
import java.util.Scanner;

import comandaDigital.controller.auditoria.AuditoriaProduto;
import comandaDigital.controller.auditoria.AuditoriaRelatorio;
import comandaDigital.model.estabelecimento.Mesa;
import comandaDigital.model.produto.Produto;
import localStorage.Artefatos;

/**
 * 
 * Classe MenuRelatorio ser� respons�vel em exibir todas as op��es dispon�veis para a op��o relat�rio
 * 
 * @author w_his
 *
 */
public class MenuRelatorio {
	
	private static MenuRelatorio instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance
	 * 
	 * @return
	 */
	private static MenuRelatorio getIntance() {
		return instance;
	}

	/**
	 * 
	 * M�todo Setter referente ao atributo instance
	 * 
	 * @param aInstance
	 */
	private static void setInstance(MenuRelatorio aInstance) {
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
	public static MenuRelatorio getInstance() {

		if (getIntance() == null) {
			setInstance(new MenuRelatorio());
		}

		return getIntance();

	}
	
    /**
     * Menu completo contendo todas as op��es do MenuRelatorio
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
			System.out.println("*  1) Relatorio de produtos        *");
			System.out.println("*  2) Relatorio de estoque         *");
			System.out.println("*  3) Relatorio de mesas fechadas  *");
			System.out.println("*  0) Sair                         *");
			System.out.println("************************************\n\n");
			
			while (flagMenu) {
				
				System.out.println("Digite a op��o desejada ou digite [0] para sair: ");
				opcaoMenuRelatorio = scan.nextInt();
				
				if (opcaoMenuRelatorio > 0 && opcaoMenuRelatorio < 5) {
					
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
     * Menu referente ao relatorio de todos os produtos
     * @throws IOException 
     */
    public void getMenuRelatorioProduto() throws IOException {

		Scanner scan = new Scanner(System.in);
		String nomeArquivo;
		
		System.out.println("************************************");
		System.out.println("*	 Menu Relatorio Produtos       *");
		System.out.println("************************************\n");
		
		System.out.println("Nome do arquivo: ");
		nomeArquivo = (scan.next());
		
		Writer w = new FileWriter(nomeArquivo + ".txt");
		BufferedWriter bw = new BufferedWriter(w);
		
		bw.write("Relatorio de todos os produtos cadastrados no sistema.");
		bw.newLine();
		bw.newLine();
		bw.write("Produtos:");
		bw.newLine();
		bw.newLine();
		
		for(Produto produto : Artefatos.produtos){
			bw.write("Produto: [" + produto.getNome() + "] - Descricao: ["+ produto.getDescricao() + "] - Pre�o: [" + produto.getValorVenda() + "]");
			bw.newLine();
		}
		
		bw.flush();
		bw.close();
		
		System.out.println("*Relatorio salvo com sucesso!!*");
		
		System.out.println("************************************\n");
		
    }
    
    /**
     * Menu referente ao relatorio de todo o estoque
     * @throws IOException 
     */
    public void getMenuRelatorioEstoque() throws IOException {

		Scanner scan = new Scanner(System.in);
		String nomeArquivo;
		
		System.out.println("************************************");
		System.out.println("*	 Menu Relatorio Estoque    *");
		System.out.println("************************************\n");
		
		System.out.println("Nome do arquivo: ");
		nomeArquivo = (scan.next());
		
		Writer w = new FileWriter(nomeArquivo + ".txt");
		BufferedWriter bw = new BufferedWriter(w);
		
		bw.write("Relatorio de todo o estoque do sistema.");
		bw.newLine();
		bw.newLine();
		bw.write("Estoque:");
		bw.newLine();
		bw.newLine();
		
		for(Map.Entry<Integer, Integer> entry : Artefatos.estoque.entrySet()){

			Produto produto = (Produto) AuditoriaProduto.getInstance().getObject(entry.getKey());

			bw.write("Produto ID: [" + entry.getKey() + "] Nome: [" + produto.getNome() + "] Quantidade: [" + entry.getValue() + "] Pre�o: [" + produto.getValorVenda() + "]");
			bw.newLine();

		}
		
		bw.flush();
		bw.close();
		
		System.out.println("*Relatorio salvo com sucesso!!*");
		
		System.out.println("************************************\n");
		
    }
    
    /**
     * Menu referente ao relatorio de todas as vendas
     * @throws IOException 
     */
    public void getMenuRelatorioMesasFechadas() throws IOException {

		Scanner scan = new Scanner(System.in);
		String nomeArquivo;
		
		System.out.println("************************************");
		System.out.println("*   Menu Relatorio Mesas Fechadas  *");
		System.out.println("************************************\n");
		
		System.out.println("Nome do arquivo: ");
		nomeArquivo = (scan.next());
		
		Writer w = new FileWriter(nomeArquivo + ".txt");
		BufferedWriter bw = new BufferedWriter(w);
		
		bw.write("Relatorio de todos as mesas fechadas do sistema.");
		bw.newLine();
		bw.newLine();
		bw.write("Mesas Fechadas:");
		bw.newLine();
		bw.newLine();
		
		for(Mesa mesa : Artefatos.mesasFechadas){

			bw.write(mesa.toString());
			bw.newLine();

		}
		
		bw.flush();
		bw.close();
		

		System.out.println("*Relatorio salvo com sucesso!!*");
		
		System.out.println("************************************\n");
		
    }
	
}
