package scarab.meldedaten.mifid.jsf;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import scarab.meldedaten.mifid.Basisdaten;
import scarab.meldedaten.mifid.Meldedaten;

@Named
@RequestScoped
public class MeldungDetailModel {

	private Basisdaten basisdaten;

	private List<Meldedaten> meldedatenListe;

	public Basisdaten getBasisdaten() {
		return basisdaten;
	}

	public void setBasisdaten(Basisdaten basisdaten) {
		this.basisdaten = basisdaten;
	}

	public List<Meldedaten> getMeldedatenListe() {
		return meldedatenListe;
	}

	public void setMeldedatenListe(List<Meldedaten> meldedatenListe) {
		this.meldedatenListe = meldedatenListe;
	}

}
