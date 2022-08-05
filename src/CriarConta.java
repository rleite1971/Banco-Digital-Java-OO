import java.util.Scanner;


public class CriarConta {
	public static void main(String[] args) {
		int numAgencia, numConta;
		
		Scanner answer = new Scanner(System.in);

		System.out.println("***Banco Digital***");
		System.out.println("");
		System.out.println("Nome:");

		Cliente novoCliente = new Cliente();
		novoCliente.setNome(answer.nextLine());
		
		System.out.println("CPF:");
		novoCliente.setCpf(answer.nextLine());
		
		System.out.println("Profissao:");
		novoCliente.setProfissao(answer.nextLine());
		
		System.out.println("Senha de 4 digitos:");
		novoCliente.setSenha(answer.nextInt());
		
		numAgencia = (int)(Math.random() * 100);
		numConta = (int)(Math.random() * 10000);
		Conta novaConta = new ContaCorrente(numAgencia, numConta);
		
		novaConta.setTitular(novoCliente);
		
		System.out.println("Valor C/C:");
		novaConta.depositar(answer.nextDouble());
		System.out.println("Valor saque:");
		novaConta.sacar(answer.nextDouble());
		System.out.println("Valor deposito:");
		novaConta.depositar(answer.nextDouble());

		System.out.println("");
		System.out.println(novaConta.getTitular().getNome() + " - Saldo C/C : R$ " + novaConta.getSaldo());
		
	}
}