package com.cs.conges.persistance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cs.conges.entites.Employe;

public interface EmployeRepository extends JpaRepository<Employe,Integer> {
	public Employe findByNom(String nom);
	public Employe findByNomAndPrenom(String nom,String Prenom);
	@Query("SELECT e FROM Employe e WHERE e.nom LIKE CONCAT(:name,'%')")
	public List<Employe> findByNomStartingWith(@Param ("name") String nom);
}
