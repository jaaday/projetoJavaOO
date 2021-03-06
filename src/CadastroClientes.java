public class CadastroClientes {
	private RepositorioClientes clientes;

	public CadastroClientes(RepositorioClientes rep) {
		this.clientes = rep;
	}

	public void atualizar(Cliente c) {
		clientes.atualizar(c);
	}

	public void cadastrar(Cliente c) {
		String cpf = c.getCpf();
		if (!clientes.existe(cpf)) {
			clientes.inserir(c);
		} else {
			System.out.print("Cliente Existente");
		}
	}

	public void descadastrar(String cpf) {
		clientes.remover(cpf);
	}

	public Cliente procurar(String cpf) {
		return clientes.procurar(cpf);
	}
}