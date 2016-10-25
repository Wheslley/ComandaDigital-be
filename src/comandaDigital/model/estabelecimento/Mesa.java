package comandaDigital.model.estabelecimento;

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
		
		Double valorProduto = 0.0;
		String srReturn = "Mesa: " + this.numeroMesa + " - ";
		
		for(ItemComandaDigital item : comandaDigital.getListItemComandaDigital()){
			valorProduto += item.getValorTodosProutos();
		}
		
		srReturn = srReturn.concat(valorProduto.toString());
		
		return srReturn;
	}
}
