
public abstract class ContaAbstrata {
	private String numero;
	private double saldo;
	private Cliente cliente;

	public ContaAbstrata() {
	}
	
	public ContaAbstrata(String num, double s, Cliente c) {
		setNumero(num);
		setSaldo(s);
		setCliente(c);
	}

	/**
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo
	 *            the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @param cliente
	 *            the cliente to set
	 */
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void transferir(ContaAbstrata c, double v) {
		this.debitar(v);
		c.creditar(v);
	}

	public abstract void creditar(double valor);

	public void debitar(double valor) {
		if (valor <= getSaldo()) {
			setSaldo(getSaldo() - valor);
			System.out.println("Débito realizado");
		} else {
			System.out.println("Saldo insuficiente");
		}
		
	}

}
