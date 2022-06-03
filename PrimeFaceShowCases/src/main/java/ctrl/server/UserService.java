package ctrl.server;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import model.Section;
import model.User;

@Named
@ApplicationScoped
public class UserService {

	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}
	
	/**
	 * Gefüllt mit Beispieldaten.
	 */
	@PostConstruct
	public void initialize() {
		users = new ArrayList<>();
		users.add(new User("Wagner", "Simp123", "wagner@yahoo.org", Section.A));
		users.add(new User("John", "Simp123", "john@yahoo.org", Section.A));
		users.add(new User("Barton", "Simp123", "barton@yahoo.org", Section.A));
		users.add(new User("Hildegard", "Simp123", "hildegard@yahoo.org", Section.A));
		users.add(new User("Simon", "Simp123", "simon@yahoo.org", Section.A));
		users.add(new User("Joanna", "Simp123", "joanna@yahoo.org", Section.A));
		users.add(new User("Jane", "Simp123", "jane123@yahoo.org", Section.A));
		users.add(new User("John", "Simp123", "john321@yahoo.org", Section.A));
		users.add(new User("Davis", "Simp123", "sivad@yahoo.org", Section.A));
		users.add(new User("Ferris", "Simp123", "blau@yahoo.org", Section.A));
		users.add(new User("Paulus", "Simp123", "paulus@yahoo.org", Section.A));
	}
	
	public List<User> getUsers(int size) {

		if (size > users.size()) {
			Random rand = new Random();

			List<User> randomList = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				int randomIndex = rand.nextInt(users.size());
				randomList.add(users.get(randomIndex));
			}

			return randomList;
		}

		else {
			return new ArrayList<>(users.subList(0, size));
		}
	}
	
	public List<User> getClonedUsers(int size) {
		List<User> results = new ArrayList<>();
//		List<User> originals = getUsers(size);
		for (User original : users) {
			results.add(original.copy());
		}
		return results;
	}
	
}
