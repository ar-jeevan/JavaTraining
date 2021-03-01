package com.rakuten.training.dal;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.rakuten.training.domain.Movies;


@Repository
@Transactional
public class MoviesDAOJpaImpl implements MovieDAO {

	@Autowired
	EntityManager em;
	
	
	
	@Override
	public Movies save(Movies toBeSaved) {
		
	
		em.persist(toBeSaved);
		
		return toBeSaved;
	}

	@Override
	public Movies findById(int id) {
		
	    return  em.find(Movies.class, id);
	}

	@Override
	public List<Movies> findByGenre(String genre) {
		
		Query q= em.createQuery("select m from Movies as m where m.genre=:mname");
		q.setParameter("mname", genre);
		return q.getResultList();
	
	}

	@Override
	public void deleteById(int id) {
		
		Movies m = em.find(Movies.class,id);
		em.remove(m);
		
	
	}

	@Override
	public List<Movies> findAll() {
		
		
		Query q= em.createQuery("select m from Movies as m ");
		List<Movies> all= q.getResultList();
		return all;
		
	}

	
	
	
	
	
}
