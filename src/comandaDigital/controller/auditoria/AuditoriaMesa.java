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

	private static AuditoriaMesa getIntance() {
		return instance;
	}

	private static void setInstance(AuditoriaMesa aInstance) {
		instance = aInstance;
	}

	public static AuditoriaMesa getInstance() {

		if (getIntance() == null) {
			setInstance(new AuditoriaMesa());
		}

		return getIntance();

	}

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

	@Override
	public void removeObjeto(int id) {

		for (int x = 0; x < Artefatos.mesas.size(); x++) {
			if (id == Artefatos.mesas.get(x).getNumeroMesa()) {
				Artefatos.mesas.remove(x);
			}
		}

		System.out.println(IMensagemGeral.MESA_DELETADA_SUCESSO);

	}

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

	public void listarMesaEspecifica(Mesa mesa) {
		System.out.println();
	}

	@Override
	public Object getObject(int id) {
		// TODO Auto-generated method stub
		return null;
	}

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

	public boolean validaMesaComandaDigital(Mesa mesa) {

		for (Mesa mesaAb : Artefatos.mesas) {
			if (mesaAb.getNumeroMesa() == mesa.getNumeroMesa()) {
				return true;
			}
		}

		return false;
	}

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
