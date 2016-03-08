public class Poupanca extends ContaAbstrata {
	
	public Poupanca(String num, Cliente cli) {
		super(num, 0, cli);
	}

	public Poupanca(String num, double s, Cliente c) {
		super(num, s, c);
	}

	public void renderJuros(double taxa) {
		double saldo = this.getSaldo();
		this.creditar(saldo * taxa);
	}

	@Override
	public void creditar(double valor) {
		setSaldo(getSaldo() + valor);
	}

}
