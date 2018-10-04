package com.makeMyTrip;

import com.makeMyTrip.Controller.FlightsController;

public class MakeMyTripApplication {

	public static void main(String[] args) {
		FlightsController flightList=new FlightsController();
		flightList.addFlight(new FlightDetails(100, "Kolkata" , "Bangalore", 10102018, 1000, 1500, "Indigo", 3500));
		flightList.addFlight(new FlightDetails(101, "siliguri" , "Kolkata", 10102018, 1100, 1200,"Indigo", 3100));
		flightList.addFlight(new FlightDetails(102, "siliguri" , "Kolkata", 10102018, 1300, 1500,"Indigo", 3000));
		flightList.addFlight(new FlightDetails(103, "siliguri" , "Kolkata", 10102018, 1500, 1600,"Indigo", 3800));
		
		
		/*for(FlightDetails flight: flightList.getAllFlights())
		{
			System.out.println(flight.toString());
		}
		flightList.removeFlight(100);
		for(FlightDetails flight: flightList.getAllFlights())
		{
			System.out.println(flight.toString());
		}*/
		System.out.println(flightList.getMorningFlights("siliguri", "Kolkata"));
		
	}
}
