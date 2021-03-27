import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieDetailsList {

    ArrayList<MovieDetails> movies = new ArrayList<>();


    public void addMovie(String name, String leadActor, String leadActress, String genre){
        movies.add(new MovieDetails(name,leadActor,leadActress,genre));
    }

    public void removeMovie(String movie){

        for (MovieDetails m:movies) {
            if(m.getMovieName().equalsIgnoreCase(movie)){
                int index = m.getMovieName().indexOf(movie);
                movies.remove(index);
            }
            System.out.println("Movie is not in the LIST");
        }
    }

    public void removeAllMovies(){
        movies.removeAll(movies);
    }

    public void findMovieByName(String name){

        for (MovieDetails m: movies) {
            if(m.getMovieName().equalsIgnoreCase(name)){
                int index = m.getMovieName().indexOf(name);
                System.out.println(m.toString());
            }else
                System.out.println("Movie not in the LIST");
            break;
        }

    }

    public void findMovieByGenre(String genre){
        for (MovieDetails m: movies) {
            if(m.getGenre().equalsIgnoreCase(genre)){
                System.out.println(m.toString());
            }
        }
    }

    /*public void sortBy(String id){
        if(id.equalsIgnoreCase("name")){
            movies.sort(new NameComparator());
            System.out.println("Name Sorting ");
        }
        if(id.equalsIgnoreCase("genre")){
            movies.sort(new GenreComparator());
            System.out.println("Genre Sorting ");
        }


        System.out.println(movies.toString());
    }*/

    @Override
    public String toString() {
        return "MovieDetailsList{" +
                "movies=" + movies +
                '}';
    }
}