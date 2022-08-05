public class Cliente implements Antenticacao {
	private String nome;
	private String cpf;
	private String profissao;
	private int senha;
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getProfissao() {
		return this.profissao;
	}
	
	public void setProfissao(String profissao) {
		this.profissao = profissao;
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