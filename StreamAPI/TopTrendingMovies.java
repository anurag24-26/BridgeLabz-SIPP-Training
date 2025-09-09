import java.util.*;
import java.util.stream.*;

class Movie {
    String title;
    double rating;
    int releaseYear;

    Movie(String title, double rating, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public String toString() {
        return title + " (" + releaseYear + ") - Rating: " + rating;
    }
}

public class TopTrendingMovies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Movie A", 8.5, 2023),
            new Movie("Movie B", 9.0, 2024),
            new Movie("Movie C", 7.5, 2022),
            new Movie("Movie D", 9.2, 2024),
            new Movie("Movie E", 8.7, 2023),
            new Movie("Movie F", 9.5, 2025)
        );

        movies.stream()
              .sorted(Comparator.comparingDouble((Movie m) -> m.rating)
                                .thenComparingInt(m -> m.releaseYear)
                                .reversed())
              .limit(5)
              .forEach(System.out::println);
    }
}
