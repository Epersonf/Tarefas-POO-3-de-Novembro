package Ex3;

import Ex2.Construcao;

public class Escola extends Construcao {
	public Escola(boolean usoDeEnergiaRenovavel, int numeroDeLampadas, boolean usoDeArCondicionado,
			int numeroDePessoas) {
		super(usoDeEnergiaRenovavel, numeroDeLampadas, usoDeArCondicionado, numeroDePessoas);
		// TODO Auto-generated constructor stub
	}

	@Override
	public float getCarbonFootprint() {
		// TODO Auto-generated method stub
		return 0;
	}
}
