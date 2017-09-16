package scarab.meldedaten.mifid.jsf;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import scarab.meldedaten.mifid.Basisdaten;
import scarab.meldedaten.mifid.service.MeldungService;

@Named
@RequestScoped
public class MeldungSucheForm {

	private static final String NAV_SUCHE = "/meldedaten/suche";
	private static final String NAV_DETAIL = "/meldedaten/detail";
	
	@EJB
	private MeldungService meldungService;

	@Inject
	private MeldungSucheModel model;

	@Inject
	private MeldungDetailModel detailModel;

	public String initialisiereSuche() {
		model.getErgebnisModel().setErgebnis(new ArrayList<Basisdaten>());

		return NAV_SUCHE;
	}

	public String executeSuche() {
		FacesMessage message = new FacesMessage("Suche durchgeführt.");
		FacesContext.getCurrentInstance().addMessage(null, message);
		
		model.getErgebnisModel().setErgebnis(meldungService.holeBasisdatenGefiltert());

		return null;
	}

	public String oeffneDetail(Basisdaten gewaehlteBasisdaten) {
			if (null != gewaehlteBasisdaten) {

			detailModel.setBasisdaten(gewaehlteBasisdaten);

			

			detailModel.setMeldedatenListe(meldungService.holeMeldedatenFuerBasisdaten(gewaehlteBasisdaten));

			return NAV_DETAIL;
		} else {
			FacesMessage message = new FacesMessage("Kein Meldesatz gewählt.");
			FacesContext.getCurrentInstance().addMessage(null, message);
			return null;
		}
	}

}
