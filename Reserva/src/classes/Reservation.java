package classes;

//Imports
import java.util.Scanner;

public class Reservation {
    private static Scanner read = new Scanner(System.in);
    private String reservationName;
    private int numberOfCompanions;
    private String dateAndTime;

    public Reservation() {
        reservationName = "";
        numberOfCompanions = 0;
        dateAndTime = "dd/mm/yy - 00:00";
    }

    public Reservation(Reservation other) {
        reservationName = other.getReservationName();
        numberOfCompanions = other.getNumberOfCompanions();
        dateAndTime = other.getDateAndTime();
    }

    //setters
    public void setReservationName(String reservationName) {
        this.reservationName = reservationName;
    }

    public void setNumberOfCompanions(int numberOfCompanions) {
        this.numberOfCompanions = numberOfCompanions;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    //getters
    public String getReservationName() {
        return reservationName;
    }

    public int getNumberOfCompanions() {
        return numberOfCompanions;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    //funções
    public void copy(Reservation other) {
        reservationName = other.getReservationName();
        numberOfCompanions = other.getNumberOfCompanions();
        dateAndTime = other.getDateAndTime();
    }

    public void println() {
        System.out.println("Reservation name: " + reservationName
                + ". Number of companions:  " + numberOfCompanions
                + ". Date and time: " + dateAndTime + ".");
    }
    
    public void print(){
        System.out.println(" - - - - Booking details - - - - ");
        System.out.println("Reservation name: " + reservationName);
        System.out.println("Number of companions: " + numberOfCompanions);
        System.out.println("Date and time: " + dateAndTime);
        System.out.println(" - - - - - - - END - - - - - - - ");
    }
    
    public void fill(){
        System.out.println(" - - - Filling the reservation - - - ");
        System.out.print("Reservation name: ");
        reservationName = read.nextLine();
        System.out.print("Number of companions: ");
        numberOfCompanions = Integer.parseInt(read.nextLine());
        System.out.print("Date and time: ");
        dateAndTime = read.nextLine();
    }
}
