package Ex5;

import java.util.ArrayList;

public class RegistroRecebimentos {
	static ArrayList<Recebivel> recebiveis = new ArrayList<Recebivel>();
	
	public static void main(String[] args) {
		recebiveis.add(new Servico("test", 1, 5d));
		recebiveis.add(new Servico("test2", 100, 9d));
		recebiveis.add(new ItemVenda("test3", 100, 9d));
		recebiveis.add(new ItemVenda("test5", 500, 1d));
	}
}
