package com.inti.model;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class Reservation {

	private Long idVoyageur;
	private Date dateReservation;
	private int nbJours;
	@ManyToOne
	@JoinColumn(name = "id_hotel")
	private Hotel hotel;
	@ManyToOne
	
	@JoinColumn(name = "id_voyageur")
	private Voyageur voyageur;
	public Reservation() {
	}

	public Reservation(Long idVoyageur, Date dateReservation, int nbJours, Hotel hotel) {
		this.idVoyageur = idVoyageur;
		this.dateReservation = dateReservation;
		this.nbJours = nbJours;
		this.hotel = hotel;
	}

	public Long getIdVoyageur() {
		return idVoyageur;
	}

	public void setIdVoyageur(Long idVoyageur) {
		this.idVoyageur = idVoyageur;
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public int getNbJours() {
		return nbJours;
	}

	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "Reservation [idVoyageur=" + idVoyageur + ", dateReservation=" + dateReservation + ", nbJours=" + nbJours
				+ ", hotel=" + hotel + "]";
	}

	
}
