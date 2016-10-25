package comandaDigital.model.estabelecimento;

import comandaDigital.controller.auditoria.AuditoriaProduto;
import comandaDigital.model.comanda.ComandaDigital;
import comandaDigital.model.comanda.ItemComandaDigital;
import comandaDigital.model.pessoas.Funcionario;

/**
 * 
 * @author whesl
 *
 */

public class Mesa {
	
	private Integer numeroMesa;
	private Integer quantidadeCadeiras;
	private ComandaDigital comandaDigital;
	private String statusMesa;
	private Funcionario funcionario;
	
	public Mesa(ComandaDigital comandaDigital) {
		this.comandaDigital = comandaDigital;
	}
	
	public Mesa(){
		this.comandaDigital = new ComandaDigital();
		this.funcionario = new Funcionario();
	}

	public Integer getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(Integer numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

	public Integer getQuantidadeCadeiras() {
		return quantidadeCadeiras;
	}

	public void setQuantidadeCadeiras(Integer quantidadeCadeiras) {
		this.quantidadeCadeiras = quantidadeCadeiras;
	}

	public ComandaDigital getComandaDigital() {
		return comandaDigital;
	}

	public void setComandaDigital(ComandaDigital comandaDigital) {
		this.comandaDigital = comandaDigital;
	}

	public String getStatusMesa() {
		return statusMesa;
	}

	public void setStatusMesa(String statusMesa) {
		this.statusMesa = statusMesa;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	public String toString(){
		
		Double valorTotalDosProdutos = 0.0;
		String srReturn = "";
		String strItem = "";
		
		for(ItemComandaDigital item : comandaDigital.getListItemComandaDigital()){
			valorTotalDosProdutos += item.getValorTodosProutos();
		}
		
		if(valorTotalDosProdutos > 0){
			
			srReturn = "\nMesa: [" + this.numeroMesa + "] [ABERTA]\n\n";
			
			for(ItemComandaDigital item : comandaDigital.getListItemComandaDigital()){
				
				strItem += "Item [" + item.getIdItemComandaDigital() + "]" +
						   " - Produto: [" + item.getProduto().getNome() + "]" +
						   " - Quantidade: [" + item.getQuantidadeProduto() + "]" +
						   " - SubTotal: [" +item.getValorTodosProutos() + "].\n";
				
			}
			
			srReturn = srReturn.concat(strItem);
			
			srReturn = srReturn.concat("\nTOTAL DA MESA: R$" + valorTotalDosProdutos.toString());
			
		}else{
			
			srReturn = "\nMesa: [" + this.numeroMesa + "] [FECHADA]\n";
			
		}
		
		return srReturn;
		
	}

}
