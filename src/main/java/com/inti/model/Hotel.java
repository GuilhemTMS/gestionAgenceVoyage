package com.inti.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Hotel implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idHotel;
	private String nom;
	private int nbEtoile;
	@ManyToOne
	@JoinColumn(name="id_destination")
	private Destination destination;
	@OneToMany
	private List<Avis> avisListe;
	@OneToMany(mappedBy = "hotel")
	private List<Reservation> reservations;
	
	private String room;
	
	public Hotel() {
		
	}

	public Hotel(String nom, int nbEtoile) {
		this.nom = nom;
		this.nbEtoile = nbEtoile;
	}
	
	public Hotel(String nom, int nbEtoile, Destination destination) {
		this.nom = nom;
		this.nbEtoile = nbEtoile;
		this.destination = destination;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public Long getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Long idHotel) {
		this.idHotel = idHotel;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbEtoile() {
		return nbEtoile;
	}

	public void setNbEtoile(int nbEtoile) {
		this.nbEtoile = nbEtoile;
	}
	
	public List<Avis> getAvisListe() {
		return avisListe;
	}

	public void setAvisListe(List<Avis> avisListe) {
		this.avisListe = avisListe;
	}

	@Override
	public String toString() {
		return "Hotel [idHotel=" + idHotel + ", nom=" + nom + ", nbEtoile=" + nbEtoile + "]";
	}
	
	
}
