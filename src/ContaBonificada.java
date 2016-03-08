public class ContaBonificada extends ContaAbstrata {

	private double bonus;

	public ContaBonificada(String numeroConta, Cliente c) {
		super(numeroConta, 0, c);
	}

	public ContaBonificada(String numeroConta, double saldo, Cliente c) {
		super(numeroConta, saldo, c);
	}

	public void renderBonus() {
		setSaldo(getSaldo() + bonus);
		bonus = 0;
	}

	public double getBonus() {
		return bonus;
	}
	
	@Override
	public void creditar(double valor) {
		bonus = bonus + valor * 0.01;
		setSaldo(getSaldo() + valor);
	}

}