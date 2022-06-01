package ctrl;

import javax.faces.application.Application;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.PostConstructApplicationEvent;
import javax.faces.event.PreDestroyApplicationEvent;
import javax.faces.event.SystemEvent;
import javax.faces.event.SystemEventListener;

public class MySystemEventListener implements SystemEventListener{

	@Override
	public void processEvent(SystemEvent event) throws AbortProcessingException {
		
		if(event instanceof PostConstructApplicationEvent) {
			/**
			 * Event nach dem Start der Applikation
			 */
			System.out.println("Applikation wird gestartet.");
		}
		
		
		if(event instanceof PreDestroyApplicationEvent) {
			/**
			 * Event kurz von abschalten der Anwendung
			 */
			System.out.println("Applikation wird beendet.");
		}
	}

	@Override
	public boolean isListenerForSource(Object source) {
		return (source instanceof Application);
	}

}
