package ctrl;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter(value = "mailConverter")
public class EmailConverter implements Converter{

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		
		if(component instanceof HtmlInputText) {
			HtmlInputText inputText = (HtmlInputText) component;
		}
		
		FacesMessage msg = new FacesMessage("Leider habe ich das nicht konvertieren können");
		
				
//		System.out.println("Konverter läuft");
		if(!value.contains("@")) {
			value = value.concat("@intern.cc");//
			//throw new ConverterException(msg);
		}
//		System.out.println(value);
		return value;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		return value.toString();
	}

}
