package com.service;

import com.bo.Lecteur;
import com.genericdao.common.EntityNotFoundException;

public interface LecteurService {

	public void addLecteur(Lecteur pLecteur);

	public void deleteLecteur(Long idLecteur) throws EntityNotFoundException;

	public void findLecteurByName(String pName) throws EntityNotFoundException;

}
