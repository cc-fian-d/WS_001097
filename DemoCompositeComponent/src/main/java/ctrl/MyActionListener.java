package ctrl;

import javax.enterprise.context.ApplicationScoped;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;
import javax.inject.Named;

@ApplicationScoped
@Named
public class MyActionListener {

	public void processAction(ActionEvent event) throws AbortProcessingException {
		System.out.println("Kompositions Komponente mit dynamschen Actionlistener processAction");
	}

	public void registerAction(ActionEvent event) throws AbortProcessingException {
		System.out.println("Kompositions Komponente mit dynamschen Actionlistener registerAction");
	}

	public void deleteAction(ActionEvent event) throws AbortProcessingException {
		System.out.println("Kompositions Komponente mit dynamschen Actionlistener deleteAction");
	}

	public void readAction(ActionEvent event) throws AbortProcessingException {
		System.out.println("Kompositions Komponente mit dynamschen Actionlistener readAction");
	}
}
