package ctrl;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Named;

import model.DeleteUser;
import model.RegisterUser;
import model.User;

@Named
@ApplicationScoped
public class UserHandler {

	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public UserHandler() {
		users = new ArrayList<User>();
	}

	public void addUser(@Observes @RegisterUser User user) {
		users.add(user);
	}

	public void deleteUser(@Observes @DeleteUser User user) {
		if (!users.isEmpty()) {
			users.remove(users.size() - 1);
		}

	}

}
