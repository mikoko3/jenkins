package com.cs.conges.persistance;

import java.util.List;

import com.cs.conges.entites.Conge;
import com.cs.conges.entites.Statut;

public interface CongeDAO {

	/**
	 * 
	 * @param idEmploye
	 */
	List findSolde(int idEmploye);

	List findTypeConge();

	/**
	 * 
	 * @param conge
	 */
	void saveConge(Conge conge);

	List<Conge> findByStatut(int idEmploye, Statut enAttente);

}