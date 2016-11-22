package com.cs.conges.services;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;

import org.joda.time.LocalDate;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cs.conges.AbstactTest;
import com.cs.conges.entites.Conge;
import com.cs.conges.entites.Employe;
import com.cs.conges.entites.Statut;
import com.cs.conges.entites.TypeConge;
import com.cs.conges.persistance.repository.EmployeRepository;

public class PoserDemandeCongeServiceTest extends AbstactTest{
	//static ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	@Autowired PoserDemandeCongeService demandeCongeService;
	@PersistenceContext EntityManager entityManager;
	@Autowired
	EmployeRepository empl;
	@Test
	public void testEnregistrerDemande() {
		
		//arrange
		//context.getBean((EntityManagerFactory.class)).createEntityManager();//EntityManager entityManager =  
		Employe emp = empl.findByNom("co");
		List<Employe> emp1 = empl.findByNomStartingWith("c");
		Employe employe = entityManager.find(Employe.class,1);
		//Date datedebut = Date.from(Instant.from(LocalDate.of(2016, 02, 21).atStartOfDay()));
		
		Date datedebut = new LocalDate(2016, 02, 21).toDate();
		Date datefin = new LocalDate(2017, 02, 21).toDate();
		
		Conge conge = new Conge(datedebut, datefin, employe, null);
		//act
		System.out.println(employe.getPrenom());
		System.out.println("++++++++++++++"+emp.getPrenom());
		System.out.println("888888888888888"+emp1.get(0).getPrenom());
		
		//PoserDemandeCongeService demandeCongeService = (PoserDemandeCongeService) context.getBean("poserDemandeCongeService");
		demandeCongeService.enregistrerDemande(conge);
		//assert
		assertTrue(conge.getId()>0);
	}

	@Test
	public void testRecupererInitialContext() {
		//fail("Not yet implemented");
	}

}
