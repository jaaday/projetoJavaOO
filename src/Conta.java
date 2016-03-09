public abstract class Conta extends ContaAbstrata {

	public Conta(String num, Cliente c) {
		super(num, 0, c);
	}

	public Conta(String num, double s, Cliente c) {
		super(num, s, c);
	}

	public void debitar(double valor) {
		setSaldo(getSaldo() - valor);
	}
}