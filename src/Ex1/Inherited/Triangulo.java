package Ex1.Inherited;

import Ex1.FormaGeometrica;

public class Triangulo extends FormaGeometrica {
	
	public void calcularArea(float base, float altura) {
		this.area = base * altura * .5f;
	}
	
	public void calcularPerimetro(float lado1, float lado2, float lado3) {
		this.perimetro = lado1 + lado2 + lado3;
	}
	
}
