package ctrl.prime;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.event.DragDropEvent;

import ctrl.server.UserService;
import model.User;

@Named("dndUserView")
@ViewScoped
public class DNDUserView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6050727660543448462L;

	@Inject
	private UserService service;
	
	private List<User> users;
	
	private List<User> droppedUsers;
	
	private User selectedUser;
	
	@PostConstruct
	public void initialize() {
		users = service.getUsers(5);
		droppedUsers = new ArrayList<User>();
	}

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<User> getDroppedUsers() {
		return droppedUsers;
	}

	public void setDroppedUsers(List<User> droppedUsers) {
		this.droppedUsers = droppedUsers;
	}

	public User getSelectedUser() {
		return selectedUser;
	}

	public void setSelectedUser(User selectedUser) {
		this.selectedUser = selectedUser;
	}
	
	public void onDropUser(DragDropEvent<User> event) {
		User user = event.getData();
		
		droppedUsers.add(user);
		users.remove(user);
	}
	
}
