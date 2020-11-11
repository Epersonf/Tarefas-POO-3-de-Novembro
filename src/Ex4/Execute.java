package Ex4;

import java.util.ArrayList;

public class Execute {
	public static void main(String[] args) {
		
	}
	
	public void aumentaSalarioEmPorcentagem(ArrayList<Funcionario> funcs, float porcentagem) {
		for (Funcionario f : funcs)
			f.setSalarioBase(f.getSalarioBase() * (1f + porcentagem));
	}
	
	public float calculaFolhaDePagamento(ArrayList<Funcionario> funcs) {
		float toReturn = 0;
		for (Funcionario f : funcs)
			toReturn += f.calculaSalario();
		return toReturn;
	}
}
