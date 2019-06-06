package com.reactive.webflux.repository;

import com.reactive.webflux.domain.Movie;

import reactor.core.publisher.Flux;

public interface MovieRepository {
	Flux<Movie> findAll();
}
