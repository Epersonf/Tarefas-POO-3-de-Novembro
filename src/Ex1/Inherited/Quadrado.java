package Ex1.Inherited;

public class Quadrado extends Retangulo {
	
	public void calcularArea(float lado) {
		this.area = (float) Math.pow(lado, 2);
	}
	
	public void calcularPerimetro(float lado) {
		this.perimetro = lado * 4;
	}
	
}
