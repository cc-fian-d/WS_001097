package ctrl;

import java.util.logging.Logger;

import javax.faces.component.html.HtmlCommandButton;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.SystemEvent;
import javax.faces.event.SystemEventListener;

public class MyComponentEventListener implements SystemEventListener{

	private static final Logger LOG = Logger.getLogger("HTMLCommandButtonLogger");
	
	@Override
	public void processEvent(SystemEvent event) throws AbortProcessingException {
		//javax.faces.event.PreRenderComponentEvent;
//		System.out.println(event.getSource() + " soll erstellt werden");
		
		HtmlCommandButton btn = (HtmlCommandButton) event.getSource();
		
		btn.addActionListener(new MyActionListener());
		
	}

	@Override
	public boolean isListenerForSource(Object source) {
//		System.out.println(source);
		return (source instanceof HtmlCommandButton);
		//return true;//(source instanceof Application);
	}

}
