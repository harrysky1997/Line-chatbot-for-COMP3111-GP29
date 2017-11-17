package com.example.bot.spring;

public class Booking {
	private String ID;
	private String tourId;
	private TourGuide tourGuide;
	private String hotel;
	private int capacity;
	private int miniCustomer;

	public Booking(
			String ID,
			String tourId,
			TourGuide tourGuide,
			String hotel,
			int capacity,
			int miniCustomer) {
		this.ID = ID;
		this.tourId = tourId;
		this.tourGuide = tourGuide;
		this.hotel = hotel;
		this.capacity = capacity;
		this.miniCustomer = miniCustomer;
	}
	
	public void setID(String ID) { this.ID = ID;}
	public String getID() { return this.ID;}
	
	public void setTour(String tourId) { this.tourId = tourId;}
	public String getTour() { return this.tourId;}
	
	public void setTourGuide(TourGuide tourGuide) { this.tourGuide = tourGuide;}
	public TourGuide getTourGuide() { return this.tourGuide;}
	
	public void setHotel(String hotel) { this.hotel = hotel;}
	public String getHotel() { return this.hotel;}
	
	public void setCapacity(int capacity) { this.capacity = capacity;}
	public int getCapacity() { return this.capacity;}
	
	public void setMiniCustomer(int miniCustomer) { this.miniCustomer = miniCustomer;}
	public int getMiniCustomer() { return this.miniCustomer;}
} 


class TourGuide {
	private String name;
	private String lineAcc;
	
	public TourGuide(
			String name,
			String lineAcc) {
		this.name = name;
		this.lineAcc = lineAcc;
	}
	
	public void setName(String name) { this.name = name;}
	public String getName() { return this.name;}
	
	public void setLineAcc(String lineAcc) { this.lineAcc = lineAcc;}
}
