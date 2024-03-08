package managers;

//imports
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import classes.Movie;

public class FilmManager {

    private List<Movie> filmList;

    public FilmManager() {
        filmList = new ArrayList<>();
    }

    public int Size() {
        return filmList.size();
    }

    public void addMovie() {
        Movie _movie = new Movie();
        _movie.fill();
        filmList.add(_movie);
    }

    public void RemoveMovie(String tituloRemover) {
        for (int i = 0; i < filmList.size(); i++) {
            Movie _movie = filmList.get(i);
            if (tituloRemover.equals(_movie.getTitle())) {
                filmList.remove(_movie);
            } else {
                System.out.println("We didn't find any film with that title!");
            }
        }
    }

    public void SearchMovie(String tituloProcurado) {
        for (int i = 0; i < filmList.size(); i++) {
            Movie _movie = filmList.get(i);
            if (tituloProcurado.equals(_movie.getTitle())) {
                _movie.printSummary(i);
            } else if (tituloProcurado.equals(_movie.getDirector())) {
                _movie.printSummary(i);
            }else{
                System.out.println("We didn't find any film with that title!");
            }
        }
    }

    public void printAllMovies() {
        for (int i = 0; i < filmList.size(); i++) {
            Movie _movie = filmList.get(i);
            _movie.printSummary(i);
        }
    }
}
