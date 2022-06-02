package com.inti.model;

import javax.persistence.ManyToOne;

public class Avis {
	
	private Long idAvis;
	private String commentaire;
	private String titre;
	
	@ManyToOne
	private Hotel hotel;
	
	public Avis() {
	
	}

	public Avis(Long idAvis, String commentaire) {
		this.idAvis = idAvis;
		this.commentaire = commentaire;
	}

	public Long getIdAvis() {
		return idAvis;
	}

	public void setIdAvis(Long idAvis) {
		this.idAvis = idAvis;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	@Override
	public String toString() {
		return "Avis [idAvis=" + idAvis + ", commentaire=" + commentaire + "]";
	}
	
	
}
