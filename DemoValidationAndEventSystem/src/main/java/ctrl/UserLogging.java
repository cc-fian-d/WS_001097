package ctrl;


import java.util.logging.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Named;

import model.DeleteUser;
import model.RegisterUser;
import model.User;

@ApplicationScoped
@Named
public class UserLogging {

	private static final Logger LOG = Logger.getLogger("User Operation");
	
	public void observUser(@Observes User user) {
		
		LOG.info(user.getName());
	}
	
}
