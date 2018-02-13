package com.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.springframework.beans.factory.annotation.Autowired;

import com.bo.Lecteur;
import com.service.LecteurService;

@ResultPath(value = "/pages/")
public class LecteurAction extends BaseAction {

	private Lecteur lecteur;
	@Autowired
	private LecteurService lecteurService;

	@Action(value = "addLecteur", results = { @Result(type="redirectAction", location = "listAction",name = "success") })
	public String addLecteur() {

		// TODO: Traitement applicatif à faire

		lecteurService.addLecteur(lecteur);

		// TODO: Traitement applicatif à faire

		return SUCCESS;
	}

	public Lecteur getLecteur() {
		return lecteur;
	}

	public void setLecteur(Lecteur lecteur) {
		this.lecteur = lecteur;
	}

	public LecteurService getLecteurService() {
		return lecteurService;
	}

	public void setLecteurService(LecteurService lecteurService) {
		this.lecteurService = lecteurService;
	}

}
