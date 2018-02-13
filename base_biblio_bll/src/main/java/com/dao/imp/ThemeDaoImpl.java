package com.dao.imp;

import org.springframework.stereotype.Repository;

import com.bo.Theme;
import com.dao.ThemeDao;
import com.genericdao.impl.GenericDaoImpl;

@Repository
public class ThemeDaoImpl extends GenericDaoImpl<Theme, Long> implements
		ThemeDao {

	public ThemeDaoImpl() {

		// car on travail sur des objets de la classe Theme, il y a des méthodes
		// hibernate qui auront besoin de cette information cf. le code de
		// generic dao
		super(Theme.class);
	}

}
