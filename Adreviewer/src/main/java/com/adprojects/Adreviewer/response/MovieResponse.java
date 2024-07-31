package com.adprojects.Adreviewer.response;

import com.adprojects.Adreviewer.entities.Genre;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MovieResponse {
    private String title;
    private Genre genre;
    private Double rating;
    private List<ReviewResponse> reviews;
}
