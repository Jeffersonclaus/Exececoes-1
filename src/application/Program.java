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

/**
 *
 * @author root
 */
public class Program {
    //Program in  very bad version
     public static void main (String []args) throws ParseException{
         
         
      
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
                
                
                if (!checkOut.after(checkIn)){
                
                System.out.println("Error in reservation: Check-out date must be after check-in date");
                
                } else{
                
                    Reservation reservation = new Reservation(number, checkIn, checkOut);
                     
                    System.out.println("Resavation: " + reservation);
                }
                
              sc.close();
	}
    
   
}
