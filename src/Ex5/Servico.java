package Ex5;

public class Servico implements Recebivel {
	
	private String descricao;
	private int horas;
	private double precoHora;
	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public double getPrecoHora() {
		return precoHora;
	}

	public void setPrecoHora(double precoHora) {
		this.precoHora = precoHora;
	}
	
	public Servico(String descricao, int horas, double precoHora) {
		this.descricao = descricao;
		this.horas = horas;
		this.precoHora = precoHora;
	}
	
	@Override
	public double totalizarReceita() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
