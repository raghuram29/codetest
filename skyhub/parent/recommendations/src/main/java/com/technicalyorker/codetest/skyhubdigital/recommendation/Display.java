package com.technicalyorker.codetest.skyhubdigital.recommendation;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.technicalyorker.codetest.skyhubdigital.recommendation.db.MovieDB;
import com.technicalyorker.codetest.skyhubdigital.recommendation.model.Movie;

public class Display {
	public void display(Integer flightTime) {
		List<Movie> movies = MovieDB.getMovieList();
		Set<TwoMovies> set = new HashSet<>();
		for (Movie movie1 : movies) {
			for (Movie movie2 : movies) {
				if (movie1 != movie2) {
					TwoMovies twoMovie = new TwoMovies(movie1, movie2);
					if (flightTime < twoMovie.getTime()) {
						set.add(twoMovie);
					}
				}
			}
		}
	}
}