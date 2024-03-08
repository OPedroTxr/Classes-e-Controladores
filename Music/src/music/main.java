package music;

//import
import java.util.Scanner;
import managers.MusicManager;

public class main {
    public static int printMenu() {
        Scanner read = new Scanner(System.in);
        System.out.println(" - - - - - - - - - - ");
        System.out.println("1- Add new Music");
        System.out.println("2- remove Music");
        System.out.println("3- Search Music");
        System.out.println("4- Print all Musics");
        System.out.println("0- Exit menu");
        System.out.println(" - - - - - - - - - - ");
        System.out.print("select an option: ");
        return read.nextInt();
    }
    
    public static void main(String[] args) {
        MusicManager _musicManager = new MusicManager();
        Scanner read = new Scanner(System.in);
        int menuSelection = 0;
        String nomeDaMusica = "";
        
        do {
            menuSelection = printMenu();

            switch (menuSelection) {
                case 1:
                    //insert;
                    _musicManager.addMusic();
                    break;
                case 2:
                    //remove;
                    System.out.print("Nome da musica que deseja remover: ");
                    nomeDaMusica = read.nextLine();
                    _musicManager.removeMusic(nomeDaMusica);
                    break;
                case 3:
                    //Search;
                    System.out.print("Nome da musica que deseja pesquisar: ");
                    nomeDaMusica = read.nextLine();
                    _musicManager.searchMusic(nomeDaMusica);
                    break;
                case 4:
                    //Print all;
                default:
            }
        } while (menuSelection != 0);
    }
}