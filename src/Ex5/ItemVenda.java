package Ex5;

public class ItemVenda implements Recebivel {
	
	private String produto;
	private int quantidade;
	private double precoUnitario;
	
	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	public ItemVenda(String produto, int quantidade, double precoUnitario) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
	}
	
	@Override
	public double totalizarReceita() {
		// TODO Auto-generated method stub
		return 0;
	}

}
