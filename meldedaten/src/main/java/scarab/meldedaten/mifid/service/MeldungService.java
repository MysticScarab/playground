package scarab.meldedaten.mifid.service;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import scarab.meldedaten.mifid.Basisdaten;
import scarab.meldedaten.mifid.Meldedaten;

@Stateless
public class MeldungService {
	
	public List<Basisdaten> holeBasisdatenGefiltert() {
		List<Basisdaten> ergebnis = new ArrayList<Basisdaten>();
		
		Basisdaten basisdaten1 = new Basisdaten();
		basisdaten1.setMeldungId(1L);
		basisdaten1.setTransaktionsnummer("1234567890");
		Basisdaten basisdaten2 = new Basisdaten();
		basisdaten2.setMeldungId(2L);
		basisdaten2.setTransaktionsnummer("0987654321");

		ergebnis.add(basisdaten1);
		ergebnis.add(basisdaten2);
		
		return ergebnis;
	}
	
	public List<Meldedaten> holeMeldedatenFuerBasisdaten(Basisdaten basisdaten) {
		List<Meldedaten> meldedatenListe = new ArrayList<Meldedaten>();

		Meldedaten feld1 = new Meldedaten();
		feld1.setWert("Wert1 fuer MeldungId " + basisdaten.getMeldungId());
		Meldedaten feld2 = new Meldedaten();
		feld2.setWert("Wert2 fuer MeldungId " + basisdaten.getMeldungId());
		Meldedaten feld3 = new Meldedaten();
		feld3.setWert("Wert3 fuer MeldungId " + basisdaten.getMeldungId());
		Meldedaten feld4 = new Meldedaten();
		feld4.setWert("Wert4 fuer MeldungId " + basisdaten.getMeldungId());
		meldedatenListe.add(feld1);
		meldedatenListe.add(feld2);
		meldedatenListe.add(feld3);
		meldedatenListe.add(feld4);
		
		return meldedatenListe;
	}

}
