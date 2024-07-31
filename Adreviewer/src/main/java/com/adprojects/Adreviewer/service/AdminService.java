package com.adprojects.Adreviewer.service;

import com.adprojects.Adreviewer.entities.Movie;
import com.adprojects.Adreviewer.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    private MovieRepository movieRepository;

    //constructor injection
    public AdminService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie addMovie(Movie movie){
        return movieRepository.save(movie);
    }
}
