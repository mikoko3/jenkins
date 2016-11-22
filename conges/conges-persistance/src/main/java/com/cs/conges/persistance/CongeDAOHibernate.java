package com.cs.conges.persistance;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cs.conges.entites.Conge;
import com.cs.conges.entites.Statut;
@Repository
public class CongeDAOHibernate implements CongeDAO {
@PersistenceContext private EntityManager entityManager;
	@Override
	public List findSolde(int idEmploye) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List findTypeConge() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void saveConge(Conge conge) {
		System.out.println("dans hibernate");
		
		
		entityManager.persist(conge);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Conge> findByStatut(int idEmploye, Statut statut) {
		// TODO Auto-generated method stub
		Query query = entityManager.createNamedQuery("findByStatut");
		query.setParameter("idEmploye",idEmploye);
		query.setParameter("statut",statut);
		return query.getResultList();
	}

}
