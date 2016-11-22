package com.cs.conges.controle;

import org.springframework.core.env.SystemEnvironmentPropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Formation
 * @version 1.0
 * @created 02-nov.-2016 15:37:01
 */
@RestController
public class ConsulterHistoriqueControl {
	@RequestMapping("/conges/Historique")
	public void consulterHistorique(){
		System.out.println("OK");
	}
	
}//end ConsulterHistoriqueControl