package com.makeMyTrip;

public class FlightDetails {
	private int flightId;
	private String source;
	private String destination;
	private int dateofDeparture;
	private int departureTime;
	private int arrivalTime;
	private String airlineName;
	private double fare;

    


	public FlightDetails(int flightId, String source, String destination, int dateofDeparture, int departureTime, int arrivalTime,
	    String airlineName, double fare) {
		super();
		this.flightId=flightId;
		this.source = source;
		this.destination = destination;
		this.dateofDeparture = dateofDeparture;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.airlineName = airlineName;
		this.fare = fare;
	}
	
	

	public double getFare() {
		return fare;
	}
	public int getflightId() {
		return flightId;
	}
	public void setSource(String source) {
		this.source=source;
	}



	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getDuration() {
		if(arrivalTime<departureTime)
		return arrivalTime-departureTime;
		else
			return (2400-departureTime)+(arrivalTime);
	}

	
	public String getSource() {
		return source;
	}

	public int getDateofDeparture() {
		return dateofDeparture;
	}

	public String getAirlineName() {
		return airlineName;
	}



	@Override
	public String toString() {
		return "FlightDetails [flightId=" + flightId + ", source=" + source + ", destination=" + destination
				+ ", dateofDeparture=" + dateofDeparture + ", departureTime=" + departureTime + ", arrivalTime="
				+ arrivalTime + ", airlineName=" + airlineName + ", fare=" + fare + "]";
	}
	
	
}
