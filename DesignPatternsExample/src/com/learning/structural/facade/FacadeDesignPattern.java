package com.learning.structural.facade;

import com.learning.structural.facade.TravelFacade.BookingType;

class TravelFacade
{
	FlightBooking flightBooking;
	TrainBooking trainBooking;
	HotelBooking hotelBooking;
	enum BookingType
	{
		Flight,Train,Hotel,Flight_And_Hotel,Train_And_Hotel;
	}
	public TravelFacade() {
		super();
		this.flightBooking = new FlightBooking();
		this.trainBooking = new TrainBooking();
		this.hotelBooking = new HotelBooking();
	}
	
	
	public void book(BookingType type,String name)
	{
		switch(type)
		{
		case Flight:
			flightBooking.bookFlight(name);
			return;
			
		case Hotel:
			hotelBooking.bookHotel(name);
			return;
	
		case Train:
			trainBooking.bookTrain(name);
			return;
			
		case Train_And_Hotel:
			hotelBooking.bookHotel(name);
			trainBooking.bookTrain(name);
			return;
	
		case Flight_And_Hotel:
			hotelBooking.bookHotel(name);
			flightBooking.bookFlight(name);
			return;
	
	
			
		}
	}
}

class FlightBooking
{

	public void bookFlight(String name) {
		// TODO Auto-generated method stub
		System.out.println("Flight booked for name:"+name);
	}
	
}

class HotelBooking
{

	public void bookHotel(String name) {
		System.out.println("Hotel booked for name:"+name);
	}
	
}
class TrainBooking
{

	public void bookTrain(String name) {
		System.out.println("Train booked for name:"+name);		
	}
	
}

public class FacadeDesignPattern {

	public static void main(String[] args) {
		TravelFacade booking = new TravelFacade();
		booking.book(BookingType.Hotel, "Rohit");
	}

}
