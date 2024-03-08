package cadlivros;

//imports
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import Classes.Book;

public class main {

    public static int printMenu() {
        Scanner read = new Scanner(System.in);
        System.out.println(" - - - - - - - - - - ");
        System.out.println("1- Insert book");
        System.out.println("2- Remove book");
        System.out.println("3- Search book");
        System.out.println("0- Exit menu");
        System.out.println(" - - - - - - - - - - ");
        System.out.print("select an option: ");
        return read.nextInt();
    }

    public static int searchBy() {
        Scanner read = new Scanner(System.in);
        System.out.println("You want to search for: ");
        System.out.println("1- Title");
        System.out.println("2- Author");
        System.out.println("0 - Return to menu");
        System.out.println(" - - - - - - - - - - - - ");
        System.out.print("select an option: ");
        return read.nextInt();
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        List<Book> listOfBooks = new ArrayList<>();

        int menuOption = 0;

        do {
            menuOption = printMenu();

            if (menuOption == 1) {
                //Insert
                Book book = new Book();
                book.fill();
                listOfBooks.add(book);
            } else if (menuOption == 2) {
                //Remove
                String remove = read.nextLine();

                for (int i = 0; i < listOfBooks.size(); i++) {
                    Book _book = listOfBooks.get(i);
                    if (remove.equals(_book.getTitle())) {
                        listOfBooks.remove(_book);
                    }
                }
            }
            if (menuOption == 3) {
                //Search
                int searchOption = searchBy();

                if (searchOption == 1) {

                    System.out.print("Title: ");
                    String title = read.nextLine();

                    for (int i = 0; i < listOfBooks.size(); i++) {
                        Book _book = listOfBooks.get(i);
                        if (title.equals(_book.getTitle())) {
                            _book.println();
                        }
                    }
                } else if (searchOption == 2) {

                    System.out.print("Author: ");
                    String author = read.nextLine();

                    for (int i = 0; i < listOfBooks.size(); i++) {
                        Book _book = listOfBooks.get(i);
                        if (author.equals(_book.getAuthor())) {
                            _book.println();
                        }
                    }
                } else if (searchOption == 0) {
                    System.out.println("Voltando ao menu!");
                }
            }
        } while (menuOption != 0);

    }
}
