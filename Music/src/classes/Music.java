package classes;

//imports
import java.util.Scanner;

public class Music {
    private static Scanner ler = new Scanner(System.in);
    private String title;
    private String artist;
    private int duration;
    private double preco;
    
    public Music(){
        this.title = "";
        this.artist = "";
        this.duration = 0;
        this.preco = 0;
    }
    
    public Music(Music other){
        this.title = other.getTitle();
        this.artist = other.getArtist();
        this.duration = other.getDuration();
        this.preco = other.getPreco();
    }
    
    //setters 
    public void setTitle(String title){
        this.title = title;
    }
    
    public void setArtist(String artist){
        this.artist = artist;
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
    
    public String getArtist(){
        return this.artist;
    }
    
    public int getDuration(){
        return this.duration;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
    //Funções
    public void copy(Music other){
        this.title = other.getTitle();
        this.artist = other.getArtist();
        this.duration = other.getDuration();
        this.preco = other.getPreco();
    }
    
    public void print(){
        System.out.println("music informations: ");
        System.out.println("title: " + this.title);
        System.out.println("artist: " + this.artist);
        System.out.println("duration (minutes): " + this.duration + "m.");
        System.out.println("price: " + this.preco);
        System.out.println("");
    }
    
    public void printSummary(int i){
        System.out.println(i + " - title: " + this.title + ". artist: " + this.artist + ". Num. pages: " + this.duration + ". preco: " + this.preco);
    }
    
    public void fill(){
        System.out.println("fill the music informations: ");
        //title
        System.out.print("title: ");
        this.title = ler.nextLine();
        
        //artist
        System.out.print("artist: ");
        this.artist = ler.nextLine();
        
        //number of pages
        System.out.print("duration: ");
        this.duration = Integer.parseInt(ler.nextLine());
        
        //preco
        System.out.print("price: ");
        this.preco = Double.parseDouble(ler.nextLine());
        
        System.out.println("Music registered successfully");
    }
}