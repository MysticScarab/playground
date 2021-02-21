package scarab.meldedaten.mifid.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import scarab.meldedaten.mifid.Status;

/**
 * Service für den Zugriff auf die verfügbaren Statusausprägungen.
 */
@Stateless
public class StatusService {

  @PersistenceContext
  private EntityManager entityManager;

  /**
   * Liefert eine Liste von {@link Status}, welche alle der übergebenen Gruppe zugeordnet sind.
   *
   * @param gruppe Name der Statusgruppe
   * @return {@link List} mit {@link Status}
   */
  public List<Status> getAlleStatusFuerGruppe(String gruppe) {
    TypedQuery<Status> query =
        entityManager.createQuery("select s from Status s where s.gruppe = :gruppe", Status.class);
    query.setParameter("gruppe", gruppe);

    return query.getResultList();
  }
}
