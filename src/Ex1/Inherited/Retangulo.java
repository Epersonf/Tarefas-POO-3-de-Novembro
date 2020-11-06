package Ex1.Inherited;

import Ex1.FormaGeometrica;

public class Retangulo extends FormaGeometrica {
	
	public void calcularArea(float lado1, float lado2) {
		this.area = lado1 * lado2;
	}
	
	public void calcularPerimetro(float lado1, float lado2) {
		this.perimetro = (lado1 * 2) + (lado2 * 2);
	}
	
}