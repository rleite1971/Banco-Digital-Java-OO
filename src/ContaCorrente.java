public class ContaCorrente extends Conta {
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean sacar(double valor) {
		double valorASacar = valor;
		return super.sacar(valorASacar);
	}
	
	@Override
	public void depositar(double valor) {
		super.saldo += valor;
	}
}
