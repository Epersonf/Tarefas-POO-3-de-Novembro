package Ex4.Inherited;

import Ex4.Funcionario;

public class FuncionarioComissionado extends Funcionario {

	public FuncionarioComissionado(float salarioBase) {
		super(salarioBase);
	}
	
	public float calculaSalario() {
		return salarioBase * 4;
	}
}
