package com.cs.conges.persistance;

import java.util.List;

import org.springframework.stereotype.Repository;

//import framwork.java.util.list;
import com.cs.conges.entites.Conge;
import com.cs.conges.entites.Statut;

/**
 * @author Formation
 * @version 1.0
 * @created 02-nov.-2016 15:37:01
 */
@Repository
public class CongeDAOJdbc extends AbstractDAO implements CongeDAO {
	public CongeDAOJdbc(){

	}

	public void finalize() throws Throwable {

	}
	/* (non-Javadoc)
	 * @see com.cs.conges.persistance.CongeDAO#findSolde(int)
	 */
	@Override
	public List findSolde(int idEmploye){
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cs.conges.persistance.CongeDAO#findTypeConge()
	 */
	@Override
	public List findTypeConge(){
		return null;
	}

	/* (non-Javadoc)
	 * @see com.cs.conges.persistance.CongeDAO#saveConge(com.cs.conges.entites.conge)
	 */
	@Override
	public void saveConge(Conge conge){
		System.out.println("dans JDBC");

	}

	@Override
	public List<Conge> findByStatut(int idEmploye, Statut enAttente) {
		// TODO Auto-generated method stub
		return null;
	}
}//end CongeDAO