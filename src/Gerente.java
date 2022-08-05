public class Gerente extends Funcionario implements Autenticavel {
	private int senha;
	
	public double getBonificao() {
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autenticar(int senha) {
		if (this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
	}
}
