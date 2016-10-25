package comandaDigital.controller.auditoria;

import comandaDigital.model.comanda.ItemComandaDigital;
import comandaDigital.model.estabelecimento.Mesa;
import comandaDigital.view.comandaDigital.MenuMesa;
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

			MenuMesa.getInstance().getMenuDeletaMesa();
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
				Artefatos.mesas.remove(x);
				Artefatos.mesas.add(mesaParam);
			}
		}

		System.out.println(IMensagemGeral.MESA_INSERIDA_SUCESSO);

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
        
		for(int x = 0; x < IMensagemGeral.LIMITE_MESAS_ESTABELECIMENTO; x++){
			for(int y = 0; y < IMensagemGeral.LIMITE_MESAS_ESTABELECIMENTO; y++){
				if(Artefatos.mesas.get(y).getNumeroMesa() == (x + 1)){
					System.out.println(Artefatos.mesas.get(y).toString());
				}
			}
		}
		
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

}
