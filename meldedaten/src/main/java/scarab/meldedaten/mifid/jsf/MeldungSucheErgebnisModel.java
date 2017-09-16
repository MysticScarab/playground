package scarab.meldedaten.mifid.jsf;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;

import scarab.meldedaten.mifid.Basisdaten;

@SessionScoped
public class MeldungSucheErgebnisModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<Basisdaten> ergebnis;
	
	public List<Basisdaten> getErgebnis() {
		return ergebnis;
	}

	public void setErgebnis(List<Basisdaten> ergebnis) {
		this.ergebnis = ergebnis;
	}

}
