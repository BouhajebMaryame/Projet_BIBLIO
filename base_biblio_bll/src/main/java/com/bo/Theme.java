package com.bo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 * théme d'un livre
 * 
 * @author Boudaa
 *
 */
@Entity
public class Theme {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	@OneToMany
	@JoinColumn(name = "IDTHME")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private List<Book> livres;
	
	

	@Override
	public String toString() {
		return nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Book> getLivres() {
		return livres;
	}

	public void setLivres(List<Book> livres) {
		this.livres = livres;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long idThme) {
		this.id = idThme;
	}

}
