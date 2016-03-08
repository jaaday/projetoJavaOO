public class CadastroClientes {
	private RepositorioClientesArray clientes;

	public CadastroClientes(RepositorioClientesArray rep) {
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
			System.out.println("Cliente Existente");
		}
	}

	public void descadastrar(String cpf) {
		clientes.remover(cpf);
	}

	public Cliente procurar(String cpf) {
		return clientes.procurar(cpf);
	}
}