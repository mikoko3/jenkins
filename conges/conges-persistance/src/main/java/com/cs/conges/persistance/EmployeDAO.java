package com.cs.conges.persistance;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cs.conges.entites.Employe;

/**
 * @author Formation
 * @version 1.0
 * @param <ConsulterHistoriqueService>
 * @created 02-nov.-2016 15:37:01
 */
@Repository
public class EmployeDAO {
	
	public EmployeDAO(){

	}

	public void finalize() throws Throwable {

	}

	@PersistenceContext EntityManager entityManager;
	
	public Employe findEmployeAndConges(int idEmploye) {
		Query query = entityManager.createNamedQuery("findEmployeAndConges");
		query.setParameter("idEmploye",idEmploye);
	
		return (Employe) query.getSingleResult();
	}
}//end EmployeDAO