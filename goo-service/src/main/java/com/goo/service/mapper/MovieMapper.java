package com.goo.service.mapper;

import com.goo.common.dto.MovieDTO;
import com.goo.dal.domain.Movie;
import org.mapstruct.Mapper;

/**
 * Created by DongPT1 on 6/16/2017.
 */
@Mapper(componentModel = "spring")
public abstract class MovieMapper implements AbstractMapper<Movie, MovieDTO> {
}
