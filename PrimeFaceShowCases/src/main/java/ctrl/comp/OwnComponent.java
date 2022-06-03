package ctrl.comp;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.faces.component.FacesComponent;
import javax.faces.component.UIComponentBase;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.inject.Inject;

import model.User;

@FacesComponent(createTag = true, tagName = "myfirstcomp" , namespace = "http://www.exmple.com/ui")
public class OwnComponent extends UIComponentBase {

	@Inject
	User user;
	
	@Override
	public String getFamily() {
		return "my,first.component";
	}
	
	@Override
	public void encodeBegin(FacesContext context) throws IOException {
		
		String message = (String) this.getAttributes().get("message");
		
		LocalDate date = (LocalDate) this.getAttributes().get("date");
		
		if(date == null) {
			date = LocalDate.now();
		}
		
		String fDate = date.format(DateTimeFormatter.ISO_DATE);
		
		ResponseWriter writer = context.getResponseWriter();
		
		writer.startElement("p", this);
		writer.write("Message: " + message);
		writer.endElement("p");
		
		writer.startElement("p", this);
		writer.write("Datum: " + fDate);
		writer.endElement("p");
		
	}
	

}
