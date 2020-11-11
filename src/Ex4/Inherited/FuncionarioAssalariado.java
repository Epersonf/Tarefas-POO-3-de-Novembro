package Ex4.Inherited;

import Ex4.Funcionario;

public class FuncionarioAssalariado extends Funcionario {

	public FuncionarioAssalariado(float salarioBase) {
		super(salarioBase);
	}
	
	public float calculaSalario() {
		return salarioBase;
	}
	
}
