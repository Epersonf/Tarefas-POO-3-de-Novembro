package Ex6;

public class DiaDaSemana {
	
	public static enum Dia {
		DOMINGO,
		SEGUNDA,
		TERCA,
		QUARTA,
		QUINTA,
		SEXTA,
		SABADO
	}
	
	Dia dia = Dia.DOMINGO;
	
	public DiaDaSemana(Dia dia) {
		this.dia = dia;
	}
	
	public boolean ehDiaUtil(Dia dia) {
		return dia != Dia.DOMINGO && dia != Dia.SABADO;
	}
	
}
