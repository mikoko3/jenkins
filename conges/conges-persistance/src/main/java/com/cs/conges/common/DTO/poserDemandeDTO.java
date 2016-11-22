package com.cs.conges.common.DTO;

import java.util.List;

import com.cs.conges.entites.Solde;
import com.cs.conges.entites.TypeConge;

/**
 * @author Formation
 * @version 1.0
 * @created 02-nov.-2016 15:37:01
 */
public class poserDemandeDTO {

	public List<Solde>  Solde;
	public List<TypeConge> typeConge;
	
	
	public poserDemandeDTO(List<Solde> solde, List<TypeConge> typeConge) {
		super();
		Solde = solde;
		this.typeConge = typeConge;
	}

	
}//end poserDemandeDTO