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

/**
 * FormBean für die Meldungssuche.
 */
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

  /**
   * Setzt ein ggf. vorhandenes Ergebnis zurück und leitet auf die Suchmaske weiter.
   *
   * @return {@link #NAV_SUCHE}
   */
  public String initialisiereSuche() {
    model.getErgebnisModel().setErgebnis(new ArrayList<>());

    return NAV_SUCHE;
  }

  /**
   * Führt die Suche gegen den Businessservice durch. Das Ergebnis wird im Model abgelegt. Eine
   * Navigation wird nicht durchgeführt.
   *
   * @return {@code null}, um auf der aktuellen Maske zu bleiben
   */
  public String executeSuche() {
    FacesMessage message = new FacesMessage("Suche durchgeführt.");
    FacesContext.getCurrentInstance().addMessage(null, message);

    model
        .getErgebnisModel()
        .setErgebnis(meldungService.holeBasisdatenGefiltert(model.getBasisdaten()));

    return null;
  }

  /**
   * Lädt die Detaildaten für die aktuell gewählte Meldung und leitet anschließend auf die
   * Detailseite weiter.
   *
   * @param gewaehlteBasisdaten {@link Basisdaten} zu lesenden Meldung
   * @return {@link #NAV_DETAIL} bei Erfolg und {@code null}, wenn keine Meldung gewählt wurde
   */
  public String oeffneDetail(Basisdaten gewaehlteBasisdaten) {
    if (null != gewaehlteBasisdaten) {

      detailModel.setBasisdaten(gewaehlteBasisdaten);
      detailModel.setFeldListe(meldungService.holeFelder());
      detailModel.setMeldedatenListe(
          meldungService.holeMeldedatenFuerBasisdaten(gewaehlteBasisdaten));

      return NAV_DETAIL;
    } else {
      FacesMessage message = new FacesMessage("Kein Meldesatz gewählt.");
      FacesContext.getCurrentInstance().addMessage(null, message);
      return null;
    }
  }
}
