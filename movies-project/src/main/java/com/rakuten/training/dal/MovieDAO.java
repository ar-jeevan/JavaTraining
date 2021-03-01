package com.rakuten.training.dal;

import java.util.List;

import com.rakuten.training.domain.Movies;

public interface MovieDAO {
	
	public Movies save(Movies toBeSaved);
	public Movies findById(int id);
	public List<Movies>findAll();
	public List<Movies> findByGenre(String genre);
	
	public void deleteById(int id);
	
	

}
//CRUD
//+
//findByGenre(String genre)
//findByNumSongsGreaterThan(int num)
//findByNameLike(String name)