package ctrl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.User;

@Named
@ApplicationScoped
public class PageController {

	@Inject
	private User user;
	
	public String moveToPage2() {
		System.out.println(user.hashCode());
		
		return "page2";
	}
	
}
