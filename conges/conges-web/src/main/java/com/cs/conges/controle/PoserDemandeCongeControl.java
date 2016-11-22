package com.cs.conges.controle;

import com.cs.conges.services.PoserDemandeCongeService;

/**
 * @author Formation
 * @version 1.0
 * @created 02-nov.-2016 15:37:01
 */
public class PoserDemandeCongeControl {
	private PoserDemandeCongeService poserDemandeCongeService;

	public PoserDemandeCongeControl(){

	}

	public void finalize() throws Throwable {

	}
	public void enregistrerDemande(){

	}

	public void poserDemandeConge(){
		poserDemandeCongeService.recupererInitialContext(1);

	}
}//end PoserDemandeCongeControl