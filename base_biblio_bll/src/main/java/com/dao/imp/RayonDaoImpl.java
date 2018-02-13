package com.dao.imp;

import org.springframework.stereotype.Repository;
import com.bo.Rayon;
import com.dao.RayonDao;
import com.genericdao.impl.GenericDaoImpl;

@Repository
public class RayonDaoImpl extends GenericDaoImpl<Rayon, Long> implements
		RayonDao {

	public RayonDaoImpl() {

		// car on travail sur des objets de la classe Rayon, il y a des méthodes
		// hibernate qui auront besoin de cette information cf. le code de
		// generic dao
		super(Rayon.class);
	}
}
