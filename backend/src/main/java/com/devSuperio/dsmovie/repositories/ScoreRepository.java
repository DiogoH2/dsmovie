package com.devSuperio.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperio.dsmovie.entities.Score;
import com.devSuperio.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
