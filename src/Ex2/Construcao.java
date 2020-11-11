package Ex2;

public abstract class Construcao implements CarbonFootprint {
	private boolean usoDeEnergiaRenovavel;
	private int numeroDeLampadas;
	private boolean usoDeArCondicionado;
	private int numeroDePessoas;
	
	public int getNumeroDePessoas() {
		return numeroDePessoas;
	}
	public void setNumeroDePessoas(int numeroDePessoas) {
		this.numeroDePessoas = numeroDePessoas;
	}
	public boolean isUsoDeEnergiaRenovavel() {
		return usoDeEnergiaRenovavel;
	}
	public void setUsoDeEnergiaRenovavel(boolean usoDeEnergiaRenovavel) {
		this.usoDeEnergiaRenovavel = usoDeEnergiaRenovavel;
	}
	public int getNumeroDeLampadas() {
		return numeroDeLampadas;
	}
	public void setNumeroDeLampadas(int numeroDeLamapadas) {
		this.numeroDeLampadas = numeroDeLamapadas;
	}
	public boolean isUsoDeArCondicionado() {
		return usoDeArCondicionado;
	}
	public void setUsoDeArCondicionado(boolean usoDeArCondicionado) {
		this.usoDeArCondicionado = usoDeArCondicionado;
	}
	
	public Construcao(boolean usoDeEnergiaRenovavel, int numeroDeLampadas, boolean usoDeArCondicionado, int numeroDePessoas) {
		setUsoDeEnergiaRenovavel(usoDeEnergiaRenovavel);
		setNumeroDeLampadas(numeroDeLampadas);
		setUsoDeArCondicionado(usoDeArCondicionado);
		setNumeroDePessoas(numeroDePessoas);
	}
	
	@Override
	public float getCarbonFootprint() {
		return numeroDeLampadas + numeroDePessoas * 10 + ((usoDeArCondicionado) ? 1 : 0) * 5 + (usoDeEnergiaRenovavel ? 0 : 1) * 5;
	}
}
