package Ex4;

public abstract class Funcionario {
	protected float salarioBase;
	
	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Funcionario(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	public abstract float calculaSalario();
}
