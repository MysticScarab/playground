package scarab.meldedaten.mifid.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import scarab.meldedaten.mifid.Status;

@Stateless
public class StatusService {

	@PersistenceContext
	EntityManager entityManager;

	public List<Status> getAlleStatusFuerGruppe(String gruppe) {
		List<Status> ergebnis = null;

		TypedQuery<Status> query = entityManager.createQuery("select s from Status s where s.gruppe = :gruppe",
				Status.class);
		query.setParameter("gruppe", gruppe);

		ergebnis = query.getResultList();

		return ergebnis;
	}

}
