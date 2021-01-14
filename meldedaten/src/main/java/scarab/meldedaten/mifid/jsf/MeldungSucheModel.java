package scarab.meldedaten.mifid.jsf;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import scarab.meldedaten.mifid.Basisdaten;
import scarab.meldedaten.mifid.Status;
import scarab.meldedaten.mifid.service.StatusService;

@Named
@RequestScoped
public class MeldungSucheModel {

  private Basisdaten basisdaten = new Basisdaten();
  private List<Status> statusBtgListe = new ArrayList<>();
  private List<Status> statusArmListe = new ArrayList<>();
  private List<Status> statusNcaListe = new ArrayList<>();

  @EJB
  StatusService statusService;

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

  public List<Status> getStatusArmListe() {
    return statusArmListe;
  }

  public void setStatusArmListe(List<Status> statusArmListe) {
    this.statusArmListe = statusArmListe;
  }

  public List<Status> getStatusNcaListe() {
    return statusNcaListe;
  }

  public void setStatusNcaListe(List<Status> statusNcaListe) {
    this.statusNcaListe = statusNcaListe;
  }

  @PostConstruct
  private void setupStatusListen() {
    statusBtgListe.addAll(statusService.getAlleStatusFuerGruppe("BTG"));
    statusArmListe.addAll(statusService.getAlleStatusFuerGruppe("ARM"));
    statusNcaListe.addAll(statusService.getAlleStatusFuerGruppe("NCA"));
  }
}
