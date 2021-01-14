package scarab.meldedaten.mifid.service;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import scarab.meldedaten.mifid.Basisdaten;
import scarab.meldedaten.mifid.Feld;
import scarab.meldedaten.mifid.Meldedaten;

@Stateless
public class MeldungService {

  @PersistenceContext
  private EntityManager entityManager;

  public List<Basisdaten> holeBasisdatenGefiltert(Basisdaten basisdaten) {
    TypedQuery<Basisdaten> query =
        entityManager.createQuery(
            "select b from Basisdaten b where b.statusBtg = :statusBtg and b.statusArm = :statusArm and b.statusNca = :statusNca",
            Basisdaten.class);
    query.setParameter("statusBtg", basisdaten.getStatusBtg());
    query.setParameter("statusArm", basisdaten.getStatusArm());
    query.setParameter("statusNca", basisdaten.getStatusNca());

    return query.getResultList();
  }

  public List<Meldedaten> holeMeldedatenFuerBasisdaten(Basisdaten basisdaten) {
    Meldedaten feld1 = new Meldedaten();
    feld1.setFeldId(1);
    feld1.setWert("Wert1 fuer MeldungId " + basisdaten.getMeldungId());
    Meldedaten feld2 = new Meldedaten();
    feld2.setFeldId(2);
    feld2.setWert("Wert2 fuer MeldungId " + basisdaten.getMeldungId());
    Meldedaten feld3 = new Meldedaten();
    feld3.setFeldId(3);
    feld3.setWert("Wert3 fuer MeldungId " + basisdaten.getMeldungId());
    Meldedaten feld4 = new Meldedaten();
    feld4.setFeldId(4);
    feld4.setWert("Wert4 fuer MeldungId " + basisdaten.getMeldungId());

    List<Meldedaten> meldedatenListe = new ArrayList<>();

    meldedatenListe.add(feld1);
    meldedatenListe.add(feld2);
    meldedatenListe.add(feld3);
    meldedatenListe.add(feld4);

    return meldedatenListe;
  }

  public List<Feld> holeFelder() {
    List<Feld> ergebnis;

    TypedQuery<Feld> query =
        entityManager.createQuery("select f from Feld f order by f.feldId asc", Feld.class);

    ergebnis = query.getResultList();

    return ergebnis;
  }
}
