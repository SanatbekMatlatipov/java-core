package uz.sanatbek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainComparableAndComporator {
    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympian", 8, 12);
        if (theatre.reserveSeat("H11"))
            System.out.println("Please Pay");
        else
            System.out.println("Sorry seat is taken");
        if (theatre.reserveSeat("H11"))
            System.out.println("Please Pay");
        else
            System.out.println("Sorry seat is taken");
        List<Theatre.Seat> reserveSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reserveSeats);
        printList(reserveSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13.00));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("====================================================");
    }
}
