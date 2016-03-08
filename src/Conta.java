public class Conta extends ContaAbstrata{

	public Conta(String num, Cliente c) {
		super(num, 0, c);
	}

	@Override
	public void creditar(double valor) {
		setSaldo(getSaldo() + valor);
	}

}