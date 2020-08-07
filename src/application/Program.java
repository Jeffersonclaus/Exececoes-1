/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.entities.Reservation;
import model.exception.DomainException;

/**
 *
 * @author root
 */
public class Program {

    //Program in  very bad version
    public static void main(String[] args) {

        try {
            Scanner sc = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);

            System.out.println("Resavation: " + reservation);

            System.out.println("");

            System.out.println("UPDATE DATES CHECKIN and CHECKOUT");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
                    
        } catch (ParseException e) {

            System.out.println("Reservation: +" + e);

        } catch (DomainException e) {
            System.out.println("Reservation: +" + e.getMessage());

        } catch(RuntimeException e ){
        
            System.out.println("ERRO UNEXPECTED");
        }
       
    }

}
