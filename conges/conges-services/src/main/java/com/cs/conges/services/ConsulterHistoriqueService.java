package com.cs.conges.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.cs.conges.entites.Conge;
import com.cs.conges.entites.Employe;
import com.cs.conges.entites.Statut;
import com.cs.conges.persistance.CongeDAO;

import com.cs.conges.persistance.EmployeDAO;

/**
 * @author Formation
 * @version 1.0
 * @created 02-nov.-2016 15:37:01
 */
@Service
public class ConsulterHistoriqueService {

	@Autowired private CongeDAO congeDAO;
	@Autowired private EmployeDAO employeDAO;
	
	public List<Conge> consulterEnAttente(int idEmploye){
		return congeDAO.findByStatut(idEmploye,Statut.EN_ATTENTE);
		
	}
	public Employe consulterHistoriqueEmploye(int idEmploye){
		
		return employeDAO.findEmployeAndConges(idEmploye);
	}
}//end ConsulterHistoriqueService