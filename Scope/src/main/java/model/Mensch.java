package model;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class Mensch implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2676055354569735260L;
	
	private String vorname;
	private String nachname;
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		System.out.println("Setzen des Vorname");
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		System.out.println("Setzen des Nachnamen");
		this.nachname = nachname;
	}
	
	public Mensch() {
		
	}
	
}
