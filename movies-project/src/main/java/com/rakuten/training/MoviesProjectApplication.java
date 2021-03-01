package com.rakuten.training;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rakuten.training.dal.MovieDAO;

import com.rakuten.training.domain.Movies;

@SpringBootApplication
public class MoviesProjectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MoviesProjectApplication.class, args);
		
		
		ApplicationContext springContainer=
				SpringApplication.run(MoviesProjectApplication.class, args);
		
		testFullMovieDao(springContainer);
	}

	private static void testFullMovieDao(ApplicationContext springContainer) {
		
		
		
		
		MovieDAO dao= springContainer.getBean(MovieDAO.class);
		
		Movies mov= new Movies("multiplex","hero","lifestory",0, 0, "actionthriller");
		
		dao.save(mov);
		System.out.println("saved to db");
	  	
	   List<Movies> all=dao.findAll();
	  System.out.println("there are"+all.size()+"products");
		
		
		
	}

	

}
