package com.adprojects.Adreviewer.repository;

import com.adprojects.Adreviewer.entities.Genre;
import com.adprojects.Adreviewer.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    public Movie findByTitle(String title);

    public List<Movie> findByGenre(Genre genre);
}
