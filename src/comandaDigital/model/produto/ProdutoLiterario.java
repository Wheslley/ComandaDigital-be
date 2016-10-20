package comandaDigital.model.produto;

/**
 * 
 * @author w_his
 *
 */

public class ProdutoLiterario extends Produto{
	
	private String codigoProduto;
	private String autor;
	private int edicao;
	private int numeroPaginas;
	
	public ProdutoLiterario(int idProduto, String nome, String descricao, double valorBase, double valorVenda, String codigoProduto, String autor, int edicao, int numeroPaginas){
		super(idProduto, nome, descricao, valorBase, valorVenda);
		this.codigoProduto = codigoProduto;
		this.autor = autor;
		this.edicao = edicao;
		this.numeroPaginas = numeroPaginas;
	}
	
	public ProdutoLiterario(){
		
	}
	
	public String getCodigoProduto() {
		return codigoProduto;
	}

	public void setIdProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}
	
	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

}
