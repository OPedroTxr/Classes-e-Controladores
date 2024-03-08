package classes;
import java.util.Scanner;

public class Movie {
    private static Scanner ler = new Scanner(System.in);
    private String title;
    private String director;
    private int duration;
    private double preco;
    
    public Movie(){
        this.title = "";
        this.director = "";
        this.duration = 0;
        this.preco = 0;
    }
    
    public Movie(Movie other){
        this.title = other.getTitle();
        this.director = other.getDirector();
        this.duration = other.getDuration();
        this.preco = other.getPreco();
    }
    
    //setters 
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setDirector(String director){
        this.director = director;
    }
    
    public void setDuration(int duration){
        this.duration = duration;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    
    //getters
    public String getTitle(){
        return this.title;
    }
    
    public String getDirector(){
        return this.director;
    }
    
    public int getDuration(){
        return this.duration;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    //Funções
    public void copy(Movie other){
        this.title = other.getTitle();
        this.director = other.getDirector();
        this.duration = other.getDuration();
        this.preco = other.getPreco();
    }
    
    public void print(){
        System.out.println("Movie informations: ");
        System.out.println("title: " + this.title);
        System.out.println("director: " + this.director);
        System.out.println("duration: " + this.duration);
        System.out.println("preco: " + this.preco);
        System.out.println("");
    }
    
    public void printSummary(int i){
        System.out.println(i + " - title: " + this.title + ". director: " + this.director + ". duration: " + this.duration + ". preco: " + this.preco);
    }
    
    public void fill(){
        System.out.println("fill the movie informations: ");
        //title
        System.out.print("title: ");
        this.title = ler.nextLine();
        
        //artist
        System.out.print("director: ");
        this.director = ler.nextLine();
        
        //number of pages
        System.out.print("duration: ");
        this.duration = Integer.parseInt(ler.nextLine());
        
        //preco
        System.out.print("preco: ");
        this.preco = Double.parseDouble(ler.nextLine());
        
        System.out.println("Movie registered successfully");
        
    }
    
}
