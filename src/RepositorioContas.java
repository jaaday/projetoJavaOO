
public interface RepositorioContas {

	public void inserir(ContaAbstrata c);

	public void atualizar(ContaAbstrata c);

	public void remover(String num);

	public ContaAbstrata procurar(String num);

	public boolean existe(String num);
}
