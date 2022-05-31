package model;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7351729135012380019L;

	private String role;
	
	private boolean premium;
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public boolean isPremium() {
		return premium;
	}

	private void setPremium(boolean premium) {
		this.premium = premium;
	}
	
	public User() {
		setRole("user");
	}
	
	public void changePremium() {
		this.premium = !this.premium;
	}
	
	public void sudo() {
		if (role == "user") {
			setRole("admin");
		} else {
			setRole("user");
		}
	}
}
