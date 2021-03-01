package com.rakuten.training.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movies")
public class Movies {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="movie_id")
	int id;
	
	@Column(name="poster")
    String poster;
	
	@Column(name="name")
	String name;
	
	@Column(name="moviedesc")
	String movieDesc; 
	
	@Column(name="numsongs")
	int numSongs;
	
	
	@Column(name="numFight")
    int	numFight;
	
	@Column(name="genre")
	String genre;

	public Movies() {
		// TODO Auto-generated constructor stub
	}

	public Movies(String poster, String name, String movieDesc, int numSongs, int numFight, String genre) {
		super();
		this.poster = poster;
		this.name = name;
		this.movieDesc = movieDesc;
		this.numSongs = numSongs;
		this.numFight = numFight;
		this.genre = genre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPoster() {
		return poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMovieDesc() {
		return movieDesc;
	}

	public void setMovieDesc(String movieDesc) {
		this.movieDesc = movieDesc;
	}

	public int getNumSongs() {
		return numSongs;
	}

	public void setNumSongs(int numSongs) {
		this.numSongs = numSongs;
	}

	public int getNumFight() {
		return numFight;
	}

	public void setNumFight(int numFight) {
		this.numFight = numFight;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
	
	
}
