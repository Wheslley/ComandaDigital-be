package comandaDigital.controller.auditoria;

import java.util.Scanner;

import comandaDigital.model.comanda.ComandaDigital;
import comandaDigital.model.comanda.ItemComandaDigital;
import comandaDigital.model.estabelecimento.Mesa;
import comandaDigital.view.estabelecimento.MenuMesa;
import interfaces.mensagens.IMensagemGeral;
import interfaces.padroes.IMenuCrudPadr�o;
import localStorage.Artefatos;

/**
 * 
 * @author whesl
 *
 */

public class AuditoriaMesa implements IMenuCrudPadr�o {

	private static AuditoriaMesa instance;

	/**
	 * 
	 * M�todo Getter referente ao atributo instance.
	 * 
	 * @return
	 */
	private static AuditoriaMesa getIntance() {
		return instance;
	}

    /**
     * 
     * M�todo Setter referente ao atributo instance.
     * 
     * @param aInstance
     */
	private static void setInstance(AuditoriaMesa aInstance) {
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
	public static AuditoriaMesa getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaMesa());
		}

		return getIntance();

	}

	/**
	 * 
	 * M�todo auditaObjeto fica como respons�vel em instanciar o menu solicitado pelo
	 * usu�rio, podendo este menu ser o MenuInsereItemComanda, MenuFecharMesa ou 
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
	 * M�todo insereObjeto realizar� a inclus�o de um novo item na comanda digital para a
	 * mesa que est� sendo referida como parametro..
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
	 * M�todo contaItemComandaDigital realizar� a contagem de todos os itens de uma determinada mesa.
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
	 * M�todo alteraObjeto ser� respons�vel em alterar uma mesa cujo numero j� exista na 
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
	 * M�todo removeObjeto ser� respons�vel em remover uma mesa cujo numero j� exista na 
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
	 * M�todo listarObjeto ser� respons�vel em listar todos as Mesas que estejam 
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
	 * M�todo listarMesaEspecifica ser� respons�vel em listar somente uma Mesa.
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
	 * M�todo validaItemComandaDigital ser� respons�vel em verificar se a comanda digital
	 * que est� cadastrada na mesa j� possui um tipo de produto.
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
	 * M�todo validaMesaComandaDigital ser� respons�vel em verificar se o numero de uma mesa 
	 * � valido.
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
	 * M�todo calculaTotalMesa ser� respons�vel em realizar o calculo do valor 
	 * total que dever� ser pago pelo cliente.
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
	 * M�todo fechaMesa ser� respons�vel em realizar o fechamento de uma mesa e calcular o valor 
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
