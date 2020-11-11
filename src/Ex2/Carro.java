package Ex2;

public class Carro implements CarbonFootprint {
	
	private String combustivel;
	public String getCombustivel() {
		return combustivel;
	}
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	private float cilindrada;
	public float getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}
	
	public Carro(float cilindrada, String combustivel) {
		setCilindrada(cilindrada);
		setCombustivel(combustivel);
	}
	
	@Override
	public float getCarbonFootprint() {
		return getCilindrada() + (getCombustivel().equalsIgnoreCase("gasolina") ? 1 : 0) * 2;
	}
}
