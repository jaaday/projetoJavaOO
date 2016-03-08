
public interface RepositorioClientes {

	public void inserir(Cliente c);

	public void atualizar(Cliente c);

	public void remover(String num);

	public Cliente procurar(String num);

	public boolean existe(String num);
}
