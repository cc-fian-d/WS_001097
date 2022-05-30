package model;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class Schiff {

	@Inject
	private Motor motor;
	
}
