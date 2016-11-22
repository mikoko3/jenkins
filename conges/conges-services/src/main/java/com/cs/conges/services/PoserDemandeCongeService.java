package com.cs.conges.services;

import com.cs.conges.entites.Solde;
import com.cs.conges.entites.Conge;
import com.cs.conges.entites.TypeConge;
import com.cs.conges.persistance.CongeDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cs.conges.common.DTO.poserDemandeDTO;

/**
 * @author Formation
 * @version 1.0
 * @created 02-nov.-2016 15:37:01
 */
@Service
public class PoserDemandeCongeService {
	@Autowired @Qualifier ("congeDAO")
	private CongeDAO congeDAO;
	public PoserDemandeCongeService(){
		System.out.println("init");

	}

	/**
	 * 
	 * @param conge
	 */
	public void enregistrerDemande(Conge conge){
		congeDAO.saveConge(conge);
		System.out.println("nlle demande de conge");

	}

	/**
	 * 
	 * @param idEmploye
	 */
	public poserDemandeDTO recupererInitialContext(int idEmploye){
		
		List<Solde> soldes = congeDAO.findSolde(idEmploye);
		List<TypeConge> typeConges = congeDAO.findTypeConge();
		return new poserDemandeDTO(soldes , typeConges) ;
	}
}//end PoserDemandeCongeService