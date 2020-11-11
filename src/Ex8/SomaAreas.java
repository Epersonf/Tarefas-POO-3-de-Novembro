package Ex8;

import java.util.ArrayList;

import Ex1.FormaGeometrica;

public class SomaAreas {
	public static<T extends FormaGeometrica> float somaAreas(ArrayList<T> t) {
		float sum = 0;
		for (T i : t)
			sum += i.getArea();
		return sum;
	}
}
