package film;

import java.util.Scanner;
import managers.FilmManager;

public class main {
    public static int printMenu() {
        Scanner read = new Scanner(System.in);
        System.out.println(" - - - - - - - - - - ");
        System.out.println("1- Add new Movie");
        System.out.println("2- remove Movie");
        System.out.println("3- Search Movie");
        System.out.println("4- Print all Movies");
        System.out.println("0- Exit menu");
        System.out.println(" - - - - - - - - - - ");
        System.out.print("select an option: ");
        return read.nextInt();
    }
    
    public static void main(String[] args) {
        FilmManager _movieManager = new FilmManager();
        Scanner read = new Scanner(System.in);
        int menuSelection = 0;
        String nomeDoFilme = "";
        
        do {
            menuSelection = printMenu();

            switch (menuSelection) {
                case 1:
                    //insert;
                    _movieManager.addMovie();
                    break;
                case 2:
                    //remove;
                    System.out.print("Nome da filme que deseja remover: ");
                    nomeDoFilme = read.nextLine();
                    _movieManager.RemoveMovie(nomeDoFilme);
                    break;
                case 3:
                    //Search;
                    System.out.print("Nome da filme que deseja pesquisar (Titulo ou diretor): ");
                    nomeDoFilme = read.nextLine();
                    _movieManager.SearchMovie(nomeDoFilme);
                    break;
                case 4:
                    //Print all;
                    _movieManager.printAllMovies();
                default:
            }
        } while (menuSelection != 0);
    }
    
}
