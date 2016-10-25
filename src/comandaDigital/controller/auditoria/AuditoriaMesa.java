package comandaDigital.controller.auditoria;

import java.util.Scanner;

import comandaDigital.model.comanda.ComandaDigital;
import comandaDigital.model.comanda.ItemComandaDigital;
import comandaDigital.model.estabelecimento.Mesa;
import comandaDigital.view.estabelecimento.MenuMesa;
import interfaces.mensagens.IMensagemGeral;
import interfaces.padroes.IMenuCrudPadrão;
import localStorage.Artefatos;

/**
 * 
 * @author whesl
 *
 */

public class AuditoriaMesa implements IMenuCrudPadrão {

	private static AuditoriaMesa instance;

	/**
	 * 
	 * Método Getter referente ao atributo instance.
	 * 
	 * @return
	 */
	private static AuditoriaMesa getIntance() {
		return instance;
	}

    /**
     * 
     * Método Setter referente ao atributo instance.
     * 
     * @param aInstance
     */
	private static void setInstance(AuditoriaMesa aInstance) {
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
	public static AuditoriaMesa getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaMesa());
		}

		return getIntance();

	}

	/**
	 * 
	 * Método auditaObjeto fica como responsável em instanciar o menu solicitado pelo
	 * usuário, podendo este menu ser o MenuInsereItemComanda, MenuFecharMesa ou 
	 * MenuAlteracaoMesa.
	 * 
	 * @param opcaoMenu
	 * 
	 */
	@Override
	public void auditaObjeto(int opcaoMenu) {

		switch (opcaoMenu) {

		case 1: {

			MenuMesa.getInstance().getMenuInsereItemComanda();
			break;

		}

		case 2: {

			MenuMesa.getInstance().getMenuFecharMesa();
			break;

		}

		case 3: {

			MenuMesa.getInstance().getMenuAlteracaoMesa();
			break;

		}

		default: {

			listarObjeto();
			break;

		}

		}

	}

	/**
	 * 
	 * Método insereObjeto realizará a inclusão de um novo item na comanda digital para a
	 * mesa que está sendo referida como parametro..
	 * 
	 * @param object
	 * 
	 */
	@Override
	public void insereObjeto(Object object) {

		Mesa mesaParam = (Mesa) object;

		for (int x = 0; x < Artefatos.mesas.size(); x++) {

			if (mesaParam.getNumeroMesa() == Artefatos.mesas.get(x).getNumeroMesa()) {

				for (ItemComandaDigital item : mesaParam.getComandaDigital().getListItemComandaDigital()) {

					Artefatos.mesas.get(x).getComandaDigital().setAddListItemComandaDigital(item);

				}

			}

		}

		System.out.println(IMensagemGeral.MESA_INSERIDA_SUCESSO);

	}

	/**
	 * 
	 * Método contaItemComandaDigital realizará a contagem de todos os itens de uma determinada mesa.
	 * 
	 * @param mesa
	 * 
	 */
	public int contaItemComandaDigital(Mesa mesa) {

		Integer contadorItemComandaDigital = 0;

		for (int x = 0; x < Artefatos.mesas.size(); x++) {
			if (mesa.getNumeroMesa() == Artefatos.mesas.get(x).getNumeroMesa()) {

				contadorItemComandaDigital = Artefatos.mesas.get(x).getComandaDigital().getListItemComandaDigital()
						.size();

			}
		}

		return (contadorItemComandaDigital + 1);
	}

	/**
	 * 
	 * Método alteraObjeto será responsável em alterar uma mesa cujo numero já exista na 
	 * base de mesas.
	 * 
	 * @param object
	 * 
	 */
	@Override
	public void alteraObjeto(Object object) {

		Mesa mesaParam = (Mesa) object;

		for (int x = 0; x < Artefatos.mesas.size(); x++) {
			if (mesaParam.getNumeroMesa() == Artefatos.mesas.get(x).getNumeroMesa()) {
				Artefatos.mesas.remove(x);
				Artefatos.mesas.add(mesaParam);
			}
		}

		System.out.println(IMensagemGeral.MESA_ALTERADA_SUCESSO);

	}

	/**
	 * 
	 * Método removeObjeto será responsável em remover uma mesa cujo numero já exista na 
	 * base de mesas.
	 * 
	 * @param id
	 * 
	 */
	@Override
	public void removeObjeto(int id) {

		for (int x = 0; x < Artefatos.mesas.size(); x++) {
			if (id == Artefatos.mesas.get(x).getNumeroMesa()) {
				Artefatos.mesas.remove(x);
			}
		}

		System.out.println(IMensagemGeral.MESA_DELETADA_SUCESSO);

	}

	/**
	 * Método listarObjeto será responsável em listar todos as Mesas que estejam 
	 * na lista mesas.
	 */
	@Override
	public void listarObjeto() {

		for (int x = 0; x < IMensagemGeral.LIMITE_MESAS_ESTABELECIMENTO; x++) {
			for (int y = 0; y < IMensagemGeral.LIMITE_MESAS_ESTABELECIMENTO; y++) {
				if (Artefatos.mesas.get(y).getNumeroMesa() == (x + 1)) {
					System.out.println(Artefatos.mesas.get(y).toString());
				}
			}
		}

	}

	/**
	 * Método listarMesaEspecifica será responsável em listar somente uma Mesa.
	 */
	public void listarMesaEspecifica(Mesa mesa) {
		System.out.println();
	}

	
	@Override
	public Object getObject(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * Método validaItemComandaDigital será responsável em verificar se a comanda digital
	 * que está cadastrada na mesa já possui um tipo de produto.
	 * 
	 * @param mesa
	 */
	public boolean validaItemComandaDigital(Mesa mesa, ItemComandaDigital itemComandaDigital) {

		for (Mesa mesaAb : Artefatos.mesas) {
			if (mesaAb.getNumeroMesa() == mesa.getNumeroMesa()) {
				for (ItemComandaDigital item : mesaAb.getComandaDigital().getListItemComandaDigital()) {
					if (item.getIdItemComandaDigital() == itemComandaDigital.getIdItemComandaDigital()) {
						return true;
					}
				}
			}
		}

		return false;
	}

	/**
	 * 
	 * Método validaMesaComandaDigital será responsável em verificar se o numero de uma mesa 
	 * é valido.
	 * 
	 * @param mesa
	 */
	public boolean validaMesaComandaDigital(Mesa mesa) {

		for (Mesa mesaAb : Artefatos.mesas) {
			if (mesaAb.getNumeroMesa() == mesa.getNumeroMesa()) {
				return true;
			}
		}

		return false;
	}

	/**
	 * 
	 * Método calculaTotalMesa será responsável em realizar o calculo do valor 
	 * total que deverá ser pago pelo cliente.
	 * 
	 * @param mesa
	 */
	public Double calculaTotalMesa(Mesa mesa) {

		Double totalComanda = 0.0;

		for (int x = 0; x < Artefatos.mesas.size(); x++) {

			if (mesa.getNumeroMesa() == Artefatos.mesas.get(x).getNumeroMesa()) {

				for (ItemComandaDigital item : Artefatos.mesas.get(x).getComandaDigital().getListItemComandaDigital()) {
					totalComanda += item.getValorTodosProutos();
				}

			}

		}

		return totalComanda;
	}

	/**
	 * 
	 * Método fechaMesa será responsável em realizar o fechamento de uma mesa e calcular o valor 
	 * total de todos os seus produtos, como tambem o valor pago pelo cliente.
	 * 
	 * @param mesa
	 */
	public void fechaMesa(Mesa mesa) {

		Double valorRecebido = 0.0;
		Double valorTotal = calculaTotalMesa(mesa);
		Scanner scan = new Scanner(System.in);
		boolean validaValorRecevido = true;

		if (valorTotal > 0) {
			
			for (int x = 0; x < Artefatos.mesas.size(); x++) {

				if (mesa.getNumeroMesa() == Artefatos.mesas.get(x).getNumeroMesa()) {

					while (validaValorRecevido) {

						System.out.println("\nValor Total: " + valorTotal);
						System.out.println("Valor Recebido: ");
						valorRecebido = scan.nextDouble();

						if (valorRecebido > valorTotal) {

							System.out.println("Troco: " + (valorRecebido - valorTotal));
							validaValorRecevido = false;
							
							Mesa mesaFechada = new Mesa();
							
							mesaFechada.setComandaDigital(Artefatos.mesas.get(x).getComandaDigital());
							mesaFechada.setFuncionario(Artefatos.mesas.get(x).getFuncionario());
							mesaFechada.setNumeroMesa(Artefatos.mesas.get(x).getNumeroMesa());
							mesaFechada.setQuantidadeCadeiras(Artefatos.mesas.get(x).getNumeroMesa());
							mesaFechada.setStatusMesa(Artefatos.mesas.get(x).getStatusMesa());
							
							Artefatos.mesasFechadas.add(mesaFechada);
							Artefatos.mesas.get(x).setComandaDigital(new ComandaDigital());

						} else {

							System.out.println("Valor invalido a ser recedido");
							validaValorRecevido = true;

						}

					}
				}

			}
			
			System.out.println(IMensagemGeral.MESA_FECHADA_SUCESSO);
			
		} else {
			
			System.out.println(IMensagemGeral.MESA_NAO_STATUS_ABERTA);
			
		}
		
	}

}
