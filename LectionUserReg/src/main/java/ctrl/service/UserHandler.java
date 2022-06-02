package ctrl.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import model.User;

/**
 * Verwaltet die Benutzer.
 * 
 * Wird beim Start erzeugt und durch einen JSF SystemEvent ausgeführt.
 *
 * 2 Möglichkeiten zur Lösung.
 * 
 * 1. SystemEventListener und in der FacesConfig registrieren.
 * 
 * 2. ApplicationScoped und von CDI verwalten lassen.
 * 
 * Hier wurde die 2. Möglichkeit umgesetzt.
 */
@ApplicationScoped
@Named
public class UserHandler implements Serializable {

	@Inject
	private User user;

	private List<User> users;

	private List<User> loggedInUsers;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<User> getLoggedInUsers() {
		return loggedInUsers;
	}

	public void setLoggedInUsers(List<User> loggedInUsers) {
		this.loggedInUsers = loggedInUsers;
	}

	public UserHandler() {
		users = new ArrayList<User>();
		loggedInUsers = new ArrayList<User>();
	}

	public String addUser() {
		String result = "fail";
		if (users.add(user.copy())) {
			result = "success";
		}
		return result;
	}

	public String loginUser() {
		String result = "fail";

		if (users.contains(user.copy())) {
			
			loggedInUsers.add(users.get(users.indexOf(user.copy())));
			result = "success";
		}

		return result;
	}

}
