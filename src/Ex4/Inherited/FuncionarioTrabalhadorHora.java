package Ex4.Inherited;

public class FuncionarioTrabalhadorHora extends FuncionarioAssalariado {
	
	float taxaDeSalarioPorHora;
	
	public FuncionarioTrabalhadorHora(float salarioBase, float taxaDeSalarioPorHora) {
		super(salarioBase);
		this.taxaDeSalarioPorHora = taxaDeSalarioPorHora;
	}
	
	@Override
	public float calculaSalario() {
		return super.calculaSalario() + 1.5f * taxaDeSalarioPorHora;
	}
}
