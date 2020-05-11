import model.CartaoPrePago;
import model.CartaoCashBack;

public class Banco {
	public static void main(String args[]) {
		
		CartaoPrePago c1, c2,c3;
		
		c1 = new CartaoPrePago("7778888999","Joao",2022,05,100.0);
		c2 = new CartaoCashBack("6668888999","Malaquias",2023,07,1000.0, CartaoCashBack.BRONZE);
		c3 = new CartaoCashBack("6668888111","Mala",2023,07,1000.0, CartaoCashBack.GOLD);
		
		if(c1.comprar(200)) {
			System.out.println("Compra do cartao pre pago aprovado");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
		if(c2.comprar(300)) {
			System.out.println("COmpra Cashback aprovada");
		}
		else {
			System.out.println("COmpra Cashback negada");
		}
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}
	

}
