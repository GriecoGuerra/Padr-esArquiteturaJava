package padroes.comportamentais.chain;

public class BancoD extends BancoChain {

	public BancoD() {
		super(IDBancos.bancoD);
	}

	@Override
	protected void efetuaPagamento() {
		System.out.println("Pagamento efetuado no banco D");
	}

}
