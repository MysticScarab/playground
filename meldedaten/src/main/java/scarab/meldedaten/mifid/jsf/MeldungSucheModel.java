package scarab.meldedaten.mifid.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import scarab.meldedaten.mifid.Basisdaten;
import scarab.meldedaten.mifid.Status;

@Named
@RequestScoped
public class MeldungSucheModel {

	private Basisdaten basisdaten = new Basisdaten();
	private List<Status> statusBtgListe = new ArrayList<Status>();

	@Inject
	private MeldungSucheErgebnisModel ergebnisModel;

	public MeldungSucheErgebnisModel getErgebnisModel() {
		return ergebnisModel;
	}

	public void setErgebnisModel(MeldungSucheErgebnisModel ergebnisModel) {
		this.ergebnisModel = ergebnisModel;
	}

	public Basisdaten getBasisdaten() {
		return basisdaten;
	}

	public void setBasisdaten(Basisdaten basisdaten) {
		this.basisdaten = basisdaten;
	}

	public List<Status> getStatusBtgListe() {
		return statusBtgListe;
	}

	public void setStatusBtgListe(List<Status> statusBtgListe) {
		this.statusBtgListe = statusBtgListe;
	}

	@PostConstruct
	private void setupStatusBtgListe() {
		// statusBtgListe.add(null);
		statusBtgListe.add(new Status(1, "BTG", "offen"));
		statusBtgListe.add(new Status(2, "BTG", "versandt"));
		statusBtgListe.add(new Status(3, "BTG", "kontrolliert"));
		statusBtgListe.add(new Status(4, "BTG", "unvollständig"));
	}

}
