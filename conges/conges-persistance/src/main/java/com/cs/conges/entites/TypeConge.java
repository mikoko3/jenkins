package com.cs.conges.entites;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

//import framwork.java.lang.string;

/**
 * @author Formation
 * @version 1.0
 * @created 02-nov.-2016 15:37:01
 */
@Entity
public class TypeConge {

	private int id;
	private String nom;

	public TypeConge(){

	}
@Id
@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void finalize() throws Throwable {

	}
}//end typeConge