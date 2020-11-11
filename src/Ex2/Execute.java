package Ex2;

import java.util.ArrayList;

import Ex3.Casa;
import Ex3.Escola;

/* Resposta exercicio 3
 * 
 * a) O programa nao funcionaria, pois nao eh possivel instanciar uma classe abstrata.
 * 
 * b) Ao modificar para instanciar diretamente funciona, pois agora se instanciam as classes herdadas, e não a classe
 * abstrata.
 * 
 * */


public class Execute {
	/* Implementacao do exercicio 2 */
	public static void main(String[] args) {
		ArrayList<CarbonFootprint> lista = new ArrayList<CarbonFootprint>();
		lista.add(new Carro(2, "Gasolina"));
		lista.add(new Carro(12, "Nao gasolina"));
		lista.add(new Casa(true, 10, true, 200));
		lista.add(new Escola(false, 5, false, 100));
		
		for (CarbonFootprint c : lista)
			System.out.println(c.getCarbonFootprint());
	}
	
}
