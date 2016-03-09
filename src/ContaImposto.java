
public class ContaImposto extends ContaAbstrata{

	private static final double TAXA = 0.01;

	public ContaImposto() {
		// TODO Auto-generated constructor stub
	}
	
	public ContaImposto(String numeroConta, Cliente c) {
		super(numeroConta, 0, c);
	}

	public void debitar(double valor) {
		setSaldo(getSaldo() - valor * (1 + TAXA));
	}	

}
