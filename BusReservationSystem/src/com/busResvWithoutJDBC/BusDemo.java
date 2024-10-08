package com.busResvWithoutJDBC;

import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {
	public static void main(String[] args) {
		ArrayList<Bus> buses = new ArrayList<>();
		ArrayList<Booking> bookings = new ArrayList<>();
		
		buses.add(new Bus(1, true, 1, 5));
		buses.add(new Bus(2, false, 60, 60));
		buses.add(new Bus(3, true, 55, 55));
		buses.add(new Bus(4, false, 55, 55));
		buses.add(new Bus(5, true, 35, 35));
		
		int userOption = 1;
		Scanner sc = new Scanner(System.in);
		
		while (userOption == 1) {
			System.out.println("Information of Buses: \n");
			for (int i = 0; i < buses.size(); i++) {
				buses.get(i).displayBusInfo();
			}
			System.out.println("Enter 1 to Book and 2 to Exit!");
			userOption = sc.nextInt();
		
			if (userOption == 1) {
				Booking booking = new Booking();
				if (booking.isAvailable(bookings, buses)) {
					bookings.add(booking);
					System.out.println("Your Booking is Confirmed!");
				}
				else {
					System.out.println("Sorry, The Bus is Already Booked.\nPlease Try Another Date or Bus!");
				}
			}
		}
		
		sc.close();
	}
}