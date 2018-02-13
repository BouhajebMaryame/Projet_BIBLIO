package com.dao;

import java.util.List;

import com.bo.Book;
import com.bo.Rayon;
import com.genericdao.api.GenericDao;



/**
 * 
 * 
 * Interface du  DAO associé à l'entité métier Book. Cette Interface hérite la majorité de ses
 * fonctionnalités du DAO Generic
 * 
 * @author Boudaa
 *
 */
public interface BookDao extends GenericDao<Book, Long> {

	/**
	 * Ci-dessous les méthodes specifiques é ce DAO et que ne sont pas définies
	 * dans generic DAO (car elles n'ont pas un caractére génériques, elles sont
	 * specifiques aux livres)
	 */

	public List<Book> getBookByTitle(String pTitle);

	public Rayon getRayonByNom(String rayon);
}
