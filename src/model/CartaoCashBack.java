package model;
import model.CartaoPrePago;

public class CartaoCashBack extends CartaoPrePago{
	public static final int GOLD   = 0;
	public static final int SILVER = 1;
	public static final int BRONZE = 2;
	
	private int tipo;

	public CartaoCashBack(String numeroCartao, String nomeTitular, int anoValidade, int mesValidade, double saldo,
			int tipo) {
		super(numeroCartao, nomeTitular, anoValidade, mesValidade, saldo);
		this.tipo = tipo;
	}
	
	public boolean comprar(double valor) {
		if(super.saldo >= valor) {
			saldo -= valor;
			
			//logica do cashback
			switch(this.tipo) {
			case GOLD:
				super.saldo += valor * 8/100;
				break;
			case SILVER:
				super.saldo += valor * 5/100;
				break;
			case BRONZE:
				super.saldo += valor *2/100;
				break;
			}
			return true;
		}
		return false;
	}
	public String toString() {
		return "CartaoCashBack [tipo=" + tipo + ", numeroCartao="+ numeroCartao+", nomeTitular=" + nomeTitular+ ", saldo="+ saldo+"]";
	}
}


	