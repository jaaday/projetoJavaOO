public class RepositorioContasArray implements RepositorioContas {

	private ContaAbstrata[] contas;
	private int indice;
	private final static int tamCache = 100;

	public RepositorioContasArray() {
		indice = 0;
		contas = new ContaAbstrata[tamCache];
	}

	@Override
	public void inserir(ContaAbstrata c) {
		// TODO Auto-generated method stub
		contas[indice] = c;
		indice = indice + 1;
	}

	@Override
	public void atualizar(ContaAbstrata c) {
		// TODO Auto-generated method stub
		int i = procurarIndice(c.getNumero());
		if (i != -1) {
			contas[i] = c;
		} else {
			System.out.println("Conta nao encontrada");
		}
	}

	@Override
	public void remover(String num) {
		// TODO Auto-generated method stub
		if (existe(num)) {
			int i = this.procurarIndice(num);
			contas[i] = contas[indice - 1];
			contas[indice - 1] = null;
			indice = indice - 1;
		} else {
			System.out.println("Conta nao encontrada");
		}
	}

	@Override
	public ContaAbstrata procurar(String num) {
		// TODO Auto-generated method stub
		ContaAbstrata c = null;
		if (existe(num)) {
			int i = this.procurarIndice(num);
			c = contas[i];
		} else {
			System.out.println("Conta nao encontrada");
		}

		return c;
	}

	@Override
	public boolean existe(String num) {
		// TODO Auto-generated method stub
		boolean resp = false;

		int i = this.procurarIndice(num);
		if (i != -1) {
			resp = true;
		}

		return resp;
	}

	private int procurarIndice(String num) {
		int i = 0;
		int ind = -1;
		boolean achou = false;

		while ((i < indice) && !achou) {
			if ((contas[i].getNumero()).equals(num)) {
				ind = i;
				achou = true;
			}
			i = i + 1;
		}
		return ind;
	}
}
