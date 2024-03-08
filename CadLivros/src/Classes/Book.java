package Classes;

import java.util.Scanner;

public class Book {

    private static Scanner ler = new Scanner(System.in);
    private String title;
    private String author;
    private int numb_of_pages;
    private double price;

    public Book() {
        title = "";
        author = "";
        numb_of_pages = 0;
        price = 0;
    }

    public Book(Book other) {
        title = other.getTitle();
        author = other.getAuthor();
        numb_of_pages = other.getNumbOfPages();
        price = other.getPrice();
    }

    //setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumbOfPages(int numb_of_pages) {
        this.numb_of_pages = numb_of_pages;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumbOfPages() {
        return numb_of_pages;
    }

    public double getPrice() {
        return price;
    }

    //Funções
    public void copy(Book other) {
        title = other.getTitle();
        author = other.getAuthor();
        numb_of_pages = other.getNumbOfPages();
        price = other.getPrice();
    }

    public void print() {
        System.out.println(" - - - - - Print - - - - - - ");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Number of pages: " + numb_of_pages);
        System.out.println("Price: " + price);
        System.out.println(" - - - - END PRINT - - - - ");
    }

    public void println() {
        System.out.println("Title: " + title
                + ". Author: " + author
                + ". Numb. of Pages: " + numb_of_pages
                + ". Price: " + price);
    }
    
    public void fill(){
        String text = "";
        System.out.println("fill the book informations: ");
        //title
        System.out.print("Title: ");
        text = ler.nextLine();
        this.title = text;
        
        //author
        System.out.print("Author: ");
        text = ler.nextLine();
        this.author = text;
        
        //number of pages
        System.out.print("Number of pages: ");
        text = ler.nextLine();
        this.numb_of_pages = Integer.parseInt(text);
        
        //title
        System.out.print("Price: ");
        text = ler.nextLine();
        this.price = Double.parseDouble(text);
        
        System.out.println("Book registered successfully");
        
    }

}
