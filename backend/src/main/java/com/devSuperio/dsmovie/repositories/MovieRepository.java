package com.devSuperio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperio.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
