package ctrl;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.event.ComponentSystemEventListener;

public class MyComponentSystemEventListener implements ComponentSystemEventListener{

	@Override
	public void processEvent(ComponentSystemEvent event) throws AbortProcessingException {
		/**
		 * 
		 * Type f�r die Events die verwendet werden k�nnen.
		 * 
		 * preRenderView
		 * 
		 * postAddToView
		 * 
		 * preValidate
		 * 
		 * postValidate
		 * 
		 */
		
	}

}
