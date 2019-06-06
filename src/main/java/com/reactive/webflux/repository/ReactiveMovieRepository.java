package com.reactive.webflux.repository;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.reactive.webflux.domain.Movie;

import reactor.core.publisher.Flux;

@Repository
public class ReactiveMovieRepository implements MovieRepository {

	private static List<Movie> movie = new ArrayList<>();

	static {
		movie.add(new Movie("Polar (2019)", 64));
		movie.add(new Movie("Iron Man (2008)", 79));
		movie.add(new Movie("The Shawshank Redemption (1994)", 93));
		movie.add(new Movie("Forrest Gump (1994)", 83));
		movie.add(new Movie("Glass (2019)", 70));
		
		movie.add(new Movie("Avengers: Infinity War (2018)", 91));
		movie.add(new Movie("Aquaman (2018)", 79));
		movie.add(new Movie("Black Panther (2018)", 73));
		movie.add(new Movie(" Spider-Man: Into the Spider-Verse  (2018)", 85));
		movie.add(new Movie("Jurassic World: Fallen Kingdom  (2018)", 62));
		
	}

	@Override
	public Flux<Movie> findAll() {
		return Flux.fromIterable(movie).delayElements(Duration.ofSeconds(2));
	}

}
