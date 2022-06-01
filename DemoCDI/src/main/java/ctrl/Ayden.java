package ctrl;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.enterprise.inject.Default;
import javax.inject.Named;

@Named
@SessionScoped
//@Default
@PaymentAyden
public class Ayden implements Payment {

	@Override
	public void buy() {
		System.out.println("buy: Ayden wird verwendet");
		
	}

	@Override
	public void check() {
		System.out.println("check: Ayden wird verwendet");
	}

}
