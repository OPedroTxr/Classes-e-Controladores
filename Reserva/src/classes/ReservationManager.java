package classes;

//imports
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import classes.Reservation;

public class ReservationManager {

    private List<Reservation> reservationList;

    public ReservationManager() {
        reservationList = new ArrayList<>();
    }
    
    public int Size(){
        return reservationList.size();
    }

    //funções
    public void addReservation(Reservation reservation) {
        reservationList.add(reservation);
        System.out.print(" - - - - Booked Successfully - - - - ");
    }

    public void cancelReservation(String nomeReserva) {
        for(int i = 0; i < reservationList.size(); i++){
            Reservation _reservation = reservationList.get(i);
            if(nomeReserva.equals(_reservation.getReservationName())){
                reservationList.remove(_reservation);
            }
        }
    }

    public void buscarReserva(String nomeReserva) {
        for(int i = 0; i < reservationList.size(); i++){
            Reservation _reservation = reservationList.get(i);
            if(nomeReserva.equals(_reservation.getReservationName())){
                _reservation.println();
            }
        }
    }
    
    public void imprimirTodasReservas(){
        for(int i = 0; i < reservationList.size(); i++){
            Reservation _reservation = reservationList.get(i);
            _reservation.println();
        }
    }
}
