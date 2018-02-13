package com.dao;

import java.util.List;

import com.bo.Lecteur;
import com.genericdao.api.GenericDao;
import com.genericdao.common.EntityNotFoundException;



public interface LecteurDAO extends GenericDao<Lecteur, Long> {
	
	public List<Lecteur> getLecteurByName(String pName)  throws EntityNotFoundException;
	
	
	
}
