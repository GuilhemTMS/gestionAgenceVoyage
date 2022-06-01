package com.inti.model;

import java.util.List;

import javax.persistence.OneToMany;

public class Voyageur {

	private Long idVoyageur;
	private String nom;
	private String prenom;
	private String age;
	@OneToMany(mappedBy = "voyageur")
	private List<Reservation> reservations;

	public Voyageur() {
	}

	public Voyageur(Long idVoyageur, String nom, String prenom, String age, List<Reservation> reservations) {
		this.idVoyageur = idVoyageur;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.reservations = reservations;
	}

	public Long getIdVoyageur() {
		return idVoyageur;
	}

	public void setIdVoyageur(Long idVoyageur) {
		this.idVoyageur = idVoyageur;
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	@Override
	public String toString() {
		return "Voyageur [idVoyageur=" + idVoyageur + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age
				+ ", reservations=" + reservations + "]";
	}

	
	
	
}
