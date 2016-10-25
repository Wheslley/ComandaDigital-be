package comandaDigital.model.estabelecimento;

import comandaDigital.model.comanda.ComandaDigital;
import comandaDigital.model.comanda.ItemComandaDigital;
import comandaDigital.model.pessoas.Funcionario;

/**
 * 
 * Classe Mesa será utilizada para
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
	
	/**
	 * 
	 * Método construtor contendo o atributo comandaDigital da classe Mesa
	 * 
	 * @param comandaDigital
	 */
	public Mesa(ComandaDigital comandaDigital) {
		this.comandaDigital = comandaDigital;
	}
	
	/**
	 * Método construtor padrão da classe Mesa
	 */
	public Mesa(){
		this.comandaDigital = new ComandaDigital();
		this.funcionario = new Funcionario();
	}

	/**
	 * 
	 * Método Getter referente ao atributo numeroMesa
	 * 
	 * @return
	 */
	public Integer getNumeroMesa() {
		return numeroMesa;
	}

	/**
	 * 
	 * Método Setter referente ao atributo numeroMesa
	 * 
	 * @param numeroMesa
	 */
	public void setNumeroMesa(Integer numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

	/**
	 * 
	 * Método Getter referente ao atributo quantidadeCadeiras
	 * 
	 * @return
	 */
	public Integer getQuantidadeCadeiras() {
		return quantidadeCadeiras;
	}

	/**
	 * 
	 * Método Setter referente ao atributo quantidadeCadeiras
	 * 
	 * @param quantidadeCadeiras
	 */
	public void setQuantidadeCadeiras(Integer quantidadeCadeiras) {
		this.quantidadeCadeiras = quantidadeCadeiras;
	}

	/**
	 * 
	 * Método Getter referente ao atributo comandaDigital
	 * 
	 * @return
	 */
	public ComandaDigital getComandaDigital() {
		return comandaDigital;
	}

	/**
	 * 
	 * Método Setter referente ao atributo comandaDigital
	 * 
	 * @param comandaDigital
	 */
	public void setComandaDigital(ComandaDigital comandaDigital) {
		this.comandaDigital = comandaDigital;
	}

	/**
	 * 
	 * Método Getter referente ao atributo statusMesa
	 * 
	 * @return
	 */
	public String getStatusMesa() {
		return statusMesa;
	}

	/**
	 * 
	 * Método Setter referente ao atributo statusMesa
	 * 
	 * @param statusMesa
	 */
	public void setStatusMesa(String statusMesa) {
		this.statusMesa = statusMesa;
	}

	/**
	 * 
	 * Método Getter referente ao atributo funcionario
	 * 
	 * @return
	 */
	public Funcionario getFuncionario() {
		return funcionario;
	}

	/**
	 * 
	 * Método Setter referente ao atributo funcionario
	 * 
	 * @param funcionario
	 */
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	
	/**
	 * Método toString será responsável em exibir no console da aplicação todas as mesas
	 * que estão abertas ou fechadas no estabelecimento, como todos os produtos consumidos.
	 */
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
