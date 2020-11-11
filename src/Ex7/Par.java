package Ex7;

public class Par<F, S> {
	
	F f;
	
	public F getF() {
		return f;
	}

	public void setF(F f) {
		this.f = f;
	}
	
	S s;

	public S getS() {
		return s;
	}

	public void setS(S s) {
		this.s = s;
	}
	
	public Par(F f, S s) {
		this.f = f;
		this.s = s;
	}
}
