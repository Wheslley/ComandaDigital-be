package Sistema.menus;

import java.util.Scanner;

public class Menu {
	
	public static Integer getMenuPrincipal(){
		Scanner scan = new Scanner(System.in);
		int opcaoMenu = 666;
		
		while((opcaoMenu > 3) || (opcaoMenu < 0)){
			
			System.out.println("***********************************");
			System.out.println("*         Opções de Telas         *");
			System.out.println("***********************************");
			System.out.println("*  1) Menu Administrativo         *");
			System.out.println("*  2) Menu de Vendas              *");
			System.out.println("*  3) Menu Usuário Final          *");
			System.out.println("*  0) Sair                        *");
			System.out.println("***********************************");
		
			opcaoMenu = scan.nextInt();
		}
		
		return opcaoMenu;
	}
}
