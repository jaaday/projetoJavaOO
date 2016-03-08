public class CadastroContas {

	private RepositorioContasArray contas;

	public CadastroContas(RepositorioContasArray r) {
		this.contas = r;
	}

	public void atualizar(Conta c) {
		contas.atualizar(c);
	}

	public void cadastrar(Conta c) {
		if (!contas.existe(c.getNumero())) {
			contas.inserir(c);
		} else {
			System.out.println("Conta ja cadastrada");
		}
	}

	public void creditar(String n, double v) {
		Conta c = contas.procurar(n);
		c.creditar(v);
	}

	public void debitar(String n, double v) {
		Conta c = contas.procurar(n);
		c.debitar(v);
	}

	public void remover(String n) {
		contas.remover(n);
	}

	public Conta procurar(String n) {
		return contas.procurar(n);
	}

	public void transferir(String origem, String destino, double val) {
		Conta o = contas.procurar(origem);
		Conta d = contas.procurar(destino);
		o.transferir(d, val);
	}
}