package ctrl;

import java.io.Serializable;
import java.util.Map;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.faces.annotation.InitParameterMap;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class ServletConfigController implements Serializable{

	@Inject
	@InitParameterMap
	private Map<String,String> initParams;

	@Inject
	ExternalContext externalContext;
	
	@Inject
	FacesContext facesContext;
	
	public Map<String, String> getInitParams() {
		return initParams;
	}
	
	public ServletConfigController() {
		
	}
	public Map<String, String> getJsfInitParams() {
		return initParams.entrySet().stream()
                .filter(e -> e.getKey().startsWith("javax.faces"))
                .collect(Collectors.toMap(e -> e.getKey(), p -> p.getValue()));
	}
}
