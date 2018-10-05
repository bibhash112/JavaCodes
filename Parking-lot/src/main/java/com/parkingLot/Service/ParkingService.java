package com.parkingLot.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.parkingLot.POJO.CarDetails;
import com.parkingLot.POJO.Ticket;

public class ParkingService {
	String ticketNo;
	Map<String, CarDetails> carMap;
	List<CarDetails> carSection;
	List<List<CarDetails>> floor;
	List<List<List<CarDetails>>> building;
	int section=1;
	int compartments=1;
	int floors=1;
	public ParkingService() {
		
		carMap=new HashMap<>();
		carSection=new ArrayList<>();
		floor=new ArrayList<>();
		building=new ArrayList<>();
	}
	
	
	public Ticket addCar(CarDetails car)
	{
		int count=0;
		if(floors<=4)
		{
			if(section<=4)
			{
				if(compartments<=10)
				{
					carSection.add(car);
					compartments++;
				}
				count=compartments-1;
				if(compartments==11) {
					List <CarDetails> newList=new ArrayList<>();
					newList.addAll(carSection);
					floor.add(newList); carSection.removeAll(carSection);compartments=1;section++;}
				
			}
			if(section==5) {building.add(floor);floors++;section=1;}
		}
		return new Ticket(count, section, floors);
	}
	
	public Object getCarDetails(Ticket tick)
	{
	  String str=null;
	  int floors=tick.getFloor();
	  int carSection=tick.getSection();
	  int compartment=tick.getCompartment();
	 
	  if(floors==1)
	  {
		str = floor.get(--carSection).get(--compartment).toString();
	  }
	  return str;
	}

	
	
}
