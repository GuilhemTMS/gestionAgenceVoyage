package com.inti.model;

import java.util.List;

import javax.persistence.OneToMany;

public class Destination {
	
	private Long idDestination;
	private Long longitude;
	private Long latitude;
	private String ville;
	
	@OneToMany(mappedBy="destination")
	private List<Hotel> hotels;
	
	public Destination() {
		
	}

	public Destination(Long idDestination, Long longitude, Long latitude) {
		this.idDestination = idDestination;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public Long getIdDestination() {
		return idDestination;
	}

	public void setIdDestination(Long idDestination) {
		this.idDestination = idDestination;
	}

	public Long getLongitude() {
		return longitude;
	}

	public void setLongitude(Long longitude) {
		this.longitude = longitude;
	}

	public Long getLatitude() {
		return latitude;
	}

	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "Destination [idDestination=" + idDestination + ", longitude=" + longitude + ", latitude=" + latitude
				+ "]";
	}
	
}
