package scarab.tryout;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class FancyButtonBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String label = "F A N C Y";
	private String outcome = "/index";

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String doFancy() {
		return outcome;
	}

}
