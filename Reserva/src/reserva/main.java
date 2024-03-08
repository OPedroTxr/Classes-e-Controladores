package reserva;

//imports
import java.util.Scanner;
import classes.Reservation;
import classes.ReservationManager;

public class main {

    public static int printMenu() {
        Scanner read = new Scanner(System.in);
        System.out.println(" - - - - - - - - - - ");
        System.out.println("1- Add new reservation");
        System.out.println("2- remove reservation");
        System.out.println("3- Search reservation");
        System.out.println("4- Print all reservations");
        System.out.println("0- Exit menu");
        System.out.println(" - - - - - - - - - - ");
        System.out.print("select an option: ");
        return read.nextInt();
    }

    public static void main(String[] args) {
        ReservationManager reservationList = new ReservationManager();
        Scanner read = new Scanner(System.in);
        int menuSelection = 0;
        String reservationName = "";

        do {
            menuSelection = printMenu();

            switch (menuSelection) {
                case 1:
                    //insert;
                    Reservation _reservation = new Reservation();
                    _reservation.fill();
                    reservationList.addReservation(_reservation);
                    break;
                case 2:
                    //remove;
                    System.out.print("Nome da reserva que deseja remover: ");
                    reservationName = read.nextLine();
                    reservationList.cancelReservation(reservationName);
                    break;
                case 3:
                    //Search;
                    System.out.print("Nome da reserva que deseja pesquisar: ");
                    reservationName = read.nextLine();
                    reservationList.buscarReserva(reservationName);
                    break;
                case 4:
                    //Print all;
                    reservationList.imprimirTodasReservas();
                default:
                    
            }
        } while (menuSelection != 0);
    }
}
