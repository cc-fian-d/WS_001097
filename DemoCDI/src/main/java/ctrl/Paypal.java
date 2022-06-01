package ctrl;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class Paypal implements Payment {

	@Override
	public void buy() {
		System.out.println("buy: Paypal wird verwendet");
		
	}

	@Override
	public void check() {
		System.out.println("check: Paypal wird verwendet");
	}

}
