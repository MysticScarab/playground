package scarab.meldedaten.mifid.jsf;

import java.util.*;
import java.util.Map.Entry;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import scarab.meldedaten.mifid.Basisdaten;
import scarab.meldedaten.mifid.Feld;
import scarab.meldedaten.mifid.Meldedaten;

@Named
@RequestScoped
public class MeldungDetailModel {

  private Basisdaten basisdaten;

  private List<Meldedaten> meldedatenListe;
  private List<Feld> feldListe;

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

  public List<Feld> getFeldListe() {
    return feldListe;
  }

  public void setFeldListe(List<Feld> feldListe) {
    this.feldListe = feldListe;
  }

  // TODO: Scope bzw. Auswertbarkeit prüfen, wegen erneuter Auswertung bei Action auf Detail-Seite
  public List<Entry<Feld, Meldedaten>> getFelderMitMeldedaten() {
    List<Entry<Feld, Meldedaten>> kombinierteListe;

    Map<Feld, Meldedaten> felderDatenMap = new HashMap<>();

    if (null != feldListe) {
      for (Feld feld : feldListe) {
        Meldedaten value = null;
        if (null != meldedatenListe) {

          for (Meldedaten meldedaten : meldedatenListe) {
            if (meldedaten.getFeldId() == feld.getFeldId()) {
              value = meldedaten;
            }
          }
        }
        felderDatenMap.put(feld, value);
      }
    }

    kombinierteListe = new ArrayList<>(felderDatenMap.entrySet());
    kombinierteListe.sort(Comparator.comparingInt(o -> o.getKey().getFeldId()));

    return kombinierteListe;
  }
}
