package com.goo.dal.repository;

import com.goo.dal.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by DongPT1 on 6/16/2017.
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
