package Ex3;

import Ex2.Construcao;

public class Casa extends Construcao {
	
	public Casa(boolean usoDeEnergiaRenovavel, int numeroDeLampadas, boolean usoDeArCondicionado, int numeroDePessoas) {
		super(usoDeEnergiaRenovavel, numeroDeLampadas, usoDeArCondicionado, numeroDePessoas);
	}

	@Override
	public float getCarbonFootprint() {
		// TODO Auto-generated method stub
		return 0;
	}
}
