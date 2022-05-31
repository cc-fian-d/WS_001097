package model;

import java.time.LocalTime;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class MessageTimeBean {
	
	public String getMessage() {
		
		return "Kompositions Komponenten sind toll";
	}
	
	
	public LocalTime getTime() {
		return LocalTime.now();
	}
}
