package com.makeMyTrip.Controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import com.makeMyTrip.FlightDetails;

public class FlightsController {

	ArrayList<FlightDetails> flightList;
	
	public FlightsController()
	{
		flightList=new ArrayList<>();
	}
	
	public void addFlight(FlightDetails flight)
	{
		flightList.add(flight);
	}
	
	public ArrayList<FlightDetails> removeFlight(int flightId)
	{
		for(FlightDetails flt: flightList)
		{
			if(flt.getflightId()==flightId)
				flightList.remove(flt);
			return flightList;
		}
		throw new RuntimeException("Flight Record Not Found!!!!");
	}
	public ArrayList<FlightDetails> updateFlightDepTime(int flightId, int departureTime)
	{
		for(FlightDetails flt: flightList)
		{
			if(flt.getflightId()==flightId)
				flt.setDepartureTime(departureTime);
			return flightList;
		}
		throw new RuntimeException("Flight Record Not Found!!!!");
	}
	public ArrayList<FlightDetails> updateFlightArrTime(int flightId, int arrivalTime)
	{
		for(FlightDetails flt: flightList)
		{
			if(flt.getflightId()==flightId)
				flt.setArrivalTime(arrivalTime);
			return flightList;
		}
		throw new RuntimeException("Flight Record Not Found!!!!");
	}
	public ArrayList<FlightDetails> updateFlightSource(int flightId, String source)
	{
		for(FlightDetails flt: flightList)
		{
			if(flt.getflightId()==flightId)
				flt.setSource(source);
			return flightList;
		}
		throw new RuntimeException("Flight Record Not Found!!!!");
	}
	public ArrayList<FlightDetails> updateFlightDestination(int flightId, String destination)
	{
		for(FlightDetails flt: flightList)
		{
			if(flt.getflightId()==flightId)
				flt.setDestination(destination);
			return flightList;
		}
		throw new RuntimeException("Flight Record Not Found!!!!");
	}
	public ArrayList<FlightDetails> getAllFlights()
	{
		return flightList;
	}
	
	public ArrayList<FlightDetails> sortByFlightTime(String source, String destination)
	{
		for(FlightDetails flt: flightList)
		{
			if(flt.getSource()==source&&flt.getDestination()==destination)
			{
				Collections.sort(flightList, new Comparator<FlightDetails>() {
					public int compare(FlightDetails one, FlightDetails other) {
				        return one.getDuration()-other.getDuration();
				    }
				});
				return flightList;
			}
		}
		throw new RuntimeException("Flight Record Not Found!!!!");
	}
	public ArrayList<FlightDetails> sortByFlightFare(String source, String destination)
	{
		for(FlightDetails flt: flightList)
		{
			if(flt.getSource()==source&&flt.getDestination()==destination)
			{
				Collections.sort(flightList, new Comparator<FlightDetails>() {
					public int compare(FlightDetails one, FlightDetails other) {
				        return (int) (one.getFare()-other.getFare());
				    }
				});
				return flightList;
			}
		}
		throw new RuntimeException("Flight Record Not Found!!!!");
	}
	
	public FlightDetails getMorningFlights(String source, String destination)
	{
		for(FlightDetails flt: flightList)
		{
			if(flt.getSource().equals(source)&&flt.getDestination().equals(destination))
			{
				if(flt.getDepartureTime()>=0600&&flt.getDepartureTime()<1200)
				return flt;
			}
		}
		throw new RuntimeException("Flight Record Not Found!!!!");
	}
	public FlightDetails getAfterNoonFlights(String source, String destination)
	{
		for(FlightDetails flt: flightList)
		{
			if(flt.getSource().equals(source)&&flt.getDestination().equals(destination))
			{
				if(flt.getDepartureTime()>=1200&&flt.getDepartureTime()<1800)
				return flt;
			}
		}
		throw new RuntimeException("Flight Record Not Found!!!!");
	}
	public FlightDetails getNightFlights(String source, String destination)
	{
		for(FlightDetails flt: flightList)
		{
			if(flt.getSource().equals(source)&&flt.getDestination().equals(destination))
			{
				if(flt.getDepartureTime()>=1800&&flt.getDepartureTime()<=2400)
				return flt;
			}
		}
		throw new RuntimeException("Flight Record Not Found!!!!");
	}
	public FlightDetails getLateNightFlights(String source, String destination)
	{
		for(FlightDetails flt: flightList)
		{
			if(flt.getSource().equals(source)&&flt.getDestination().equals(destination))
			{
				if(flt.getDepartureTime()>0000&&flt.getDepartureTime()<0600)
				return flt;
			}
		}
		throw new RuntimeException("Flight Record Not Found!!!!");
	}
	
	
}
