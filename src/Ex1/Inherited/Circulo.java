package Ex1.Inherited;

import Ex1.FormaGeometrica;

public class Circulo extends FormaGeometrica {
	
	public void calcularArea(float raio) {
		this.area = (float) (Math.PI * Math.pow(raio, 2.0f));
	}
	
	public void calcularPerimetro(float raio) {
		this.perimetro = (float) (2 * Math.PI * raio);
	}
	
}
