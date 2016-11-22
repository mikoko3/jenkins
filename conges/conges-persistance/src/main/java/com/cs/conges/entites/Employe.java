package com.cs.conges.entites;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * @author Formation
 * @version 1.0
 * @created 02-nov.-2016 15:37:01
 * 
 * 
 */

@NamedQuery(name="findEmployeAndConges", query="SELECT e FROM Employe e LEFT JOIN FETCH e.conge where e.id = :idEmploye ")
@Entity
@Table(catalog= "conges")
public class Employe {

	private Date dateembauche;
	private int id_employe;
	private String nom;
	private String prenom;
	private List<Conge> conge;
	
	
	@OneToMany(mappedBy="employe")
	public List<Conge> getConge() {
		return conge;
	}

	public void setConge(List<Conge> conge) {
		this.conge = conge;
	}

	public Employe(){

	}
	@Column(name="date_embauche")
	@Temporal(TemporalType.DATE)
	public Date getDateembauche() {
		return dateembauche;
	}

	public void setDateembauche(Date dateembauche) {
		this.dateembauche = dateembauche;
	}
@Id
@GeneratedValue
	public int getId() {
		return id_employe;
	}

	public void setId(int id) {
		this.id_employe = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
}//end employe