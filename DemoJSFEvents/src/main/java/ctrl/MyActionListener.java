package ctrl;

import java.util.logging.Logger;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class MyActionListener implements ActionListener {
	private static final Logger LOG = Logger.getLogger("HTMLCommandButtonLogger");
	
	@Override
	public void processAction(ActionEvent event) throws AbortProcessingException {
		LOG.info(event.toString());
		
	}
}
