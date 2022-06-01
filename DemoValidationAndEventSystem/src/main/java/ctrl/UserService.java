package ctrl;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import model.DeleteUser;
import model.RegisterUser;
import model.User;

@ApplicationScoped
@Named
public class UserService {

	@Inject
	User benutzer;
	
	@Inject
	@RegisterUser
	private Event<User> registerUser;
	
	@Inject
	@DeleteUser
	private Event<User> removeUser;
	
	public void registerUser() {
		registerUser.fire(benutzer.copy());
	}
	
	public void removeUser() {
		removeUser.fire(benutzer.copy());
	}
}
