package com.busResvWithoutJDBC;

public class Bus {
	private int busNo;
	private boolean isAC;
	private int capacity;
	private int maxCapacity;
	
	Bus(int busNo, boolean isAC, int capacity, int maxCapacity) {
		this.busNo = busNo;
		this.isAC = isAC;
		this.capacity = capacity;
		this.maxCapacity = maxCapacity;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public int getMaxCapacity() {
		return maxCapacity;
	}
	
	public void setAC(boolean isAC) {
		this.isAC = isAC;
	}
	
	public void setCapacity() {
		capacity -= 1;
	}
	
	public int getBusNo() {
		return busNo;
	}
	
	public boolean getACStatus() {
		return isAC;
	}
	
	public void displayBusInfo() {
		System.out.println("Bus Number: " + busNo);
		if (isAC) {
			System.out.println("AC Status: Yes");
		}
		else {
			System.out.println("AC Status: No");
		}
		System.out.println("Capacity: " + maxCapacity);
		System.out.println(); // New Line
	}
	
}