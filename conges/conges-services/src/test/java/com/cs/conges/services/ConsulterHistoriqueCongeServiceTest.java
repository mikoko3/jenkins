package com.cs.conges.services;

import static org.junit.Assert.*;


import java.util.Collection;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.joda.time.LocalDate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cs.conges.AbstactTest;
import com.cs.conges.entites.Conge;
import com.cs.conges.entites.Employe;
import com.cs.conges.entites.Statut;
import com.cs.conges.entites.TypeConge;


public class ConsulterHistoriqueCongeServiceTest extends AbstactTest {
	@Autowired ConsulterHistoriqueService consulterHistoriqueService;
	//static ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	@Test
	public void testConsulterCongeEnAttente() {
		
		//arrange
		 //ConsulterHistoriqueService consulterHistoriqueService = context.getBean(ConsulterHistoriqueService.class);
		//act
		Collection<Conge> conges = consulterHistoriqueService.consulterEnAttente(1);
		//assert
		System.out.println(conges);
	}
@Test
public void consuterHistoriqueEmploye() throws Exception {
	Employe employe =consulterHistoriqueService.consulterHistoriqueEmploye(1);
	System.out.println("======================size=========="+employe.getConge().size());
	
}
	
}
