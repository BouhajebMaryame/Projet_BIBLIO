package com.dao.imp;

import java.util.List;

import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.stereotype.Repository;

import com.bo.Book;
import com.bo.Rayon;
import com.dao.BookDao;
import com.genericdao.impl.GenericDaoImpl;



@Repository
public class BookDaoImpl extends GenericDaoImpl<Book, Long> implements BookDao {

	public BookDaoImpl() {

		// car on travail sur des objets de la classe Book, il y a des méthodes
		// hibernate qui auront besoin de cette information cf. le code de
		// generic dao
		super(Book.class);
	}

	public List<Book> getBookByTitle(String pTitle) {

		// Une requete HQL simple pour chercher les livres par titre
		return (List<Book> ) getHibernateTemplate().find("from Book where title=?", pTitle);
		

	}

	public Rayon getRayonByNom(String rayon) {

		// Une requete HQL simple pour chercher les rayons par nom

		List l = getHibernateTemplate().find("from Rayon where nom=?", rayon);

		if (l == null || l.size() == 0)
			throw new ObjectRetrievalFailureException(Rayon.class, rayon);

		return (Rayon) l.get(0);

	}

}
