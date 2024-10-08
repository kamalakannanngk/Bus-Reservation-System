package com.busResvWithoutJDBC;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Booking {
	String passengerName;
	int busNo;
	Date date;
	
	Booking() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name of the Passenger: ");
		passengerName = sc.nextLine();
		
		System.out.println("Enter the Bus Number: ");
		busNo = sc.nextInt();
		
		System.out.println("Enter the Date: (dd-mm-yyyy) ");
		String dateInput = sc.next();
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date = dateFormat.parse(dateInput);
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	
	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int capacity = 0;
		
		for (int i = 0; i < buses.size(); i++) {
			if (buses.get(i).getBusNo() == busNo) {
				capacity = buses.get(i).getCapacity();
				if (capacity > 0) {
					buses.get(i).setCapacity();
				}
			}
		}
		
		int booked = 0;
		
		for (int i = 0; i < bookings.size(); i++) {
			if (bookings.get(i).busNo == busNo && bookings.get(i).date.equals(date)) {
				booked += 1;
			}
		}
		
		return (capacity >= booked);
	}
	
}