package com.cs.conges.entites;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

//import framework.java.util.date;

/**
 * @author Formation
 * @version 1.0
 * @created 02-nov.-2016 15:37:01
 */
@NamedQuery(name="findByStatut",query="SELECT entity FROM Conge entity "
		+ "WHERE entity.employe.id= :idEmploye AND entity.statut = :statut")
@Entity 
@Table(catalog="conges")
public class Conge {
	private Date datedebut;
	private Date datefin;
	private int id;
	private TypeConge typeconges;
	public Employe employe;

	public Conge(Date datedebut, Date datefin,  Employe employe, TypeConge typeConges) {
		super();
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.employe = employe;
		this.statut = Statut.EN_ATTENTE;
		this.typeconges = typeConges;
	}

	

	public Date getDatedebut() {
		return datedebut;
	}

	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}

	public Date getDatefin() {
		return datefin;
	}

	public void setDatefin(Date datefin) {
		this.datefin = datefin;
	}
	@Id
	@GeneratedValue
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@ManyToOne
	@JoinColumn(name = "id_type_conge")
	public TypeConge getTypeConges() {
		return typeconges;
	}

	public void setTypeConges(TypeConge typeconges) {
		this.typeconges = typeconges;
	}
	@ManyToOne
	@JoinColumn(name = "id_employe")
	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}
@Enumerated(EnumType.STRING)
	public Statut getStatut() {
		return statut;
	}

	public void setStatut(Statut statut) {
		this.statut = statut;
	}

	public Statut statut;
	public TypeConge typeConge;

	public Conge(){

	}

	public boolean valideDemande(){
		return false;
	}
}//end conge