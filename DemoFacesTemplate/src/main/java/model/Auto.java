package model;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class Auto {

	@Inject
	private Motor motor;

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	public Auto() {
		System.out.println("Auto wird erzeugt");
	}

	@Override
	public String toString() {
		return "Auto [motor=" + motor + "]";
	}
	
	
	
	
}
