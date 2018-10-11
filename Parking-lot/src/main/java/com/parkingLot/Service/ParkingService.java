package com.parkingLot.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.parkingLot.POJO.CarDetails;
import com.parkingLot.POJO.Ticket;

public class ParkingService {
	String ticketNo;
	Map<Ticket, CarDetails> carMap;
	List<CarDetails> carSection;
	List<List<CarDetails>> floor;
	List<List<List<CarDetails>>> building;
	List<Ticket> removedTickets;
	int section=1;
	int compartments=1;
	int floors=1;
	public ParkingService() {
		
		carMap=new HashMap<>();
		carSection=new ArrayList<>();
		floor=new ArrayList<>();
		building=new ArrayList<>();
		removedTickets=new ArrayList<>();
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
			if(section==5) {
				List <List<CarDetails>> newfloorList=new ArrayList<>();
				newfloorList.addAll(floor);
				building.add(newfloorList);
				floor.removeAll(floor);
				floors++;section=1;}
		}
		
		Ticket t= GenerateTicket(count, section, floors);
		carMap.put(t, car);
		return t;
	}
	
	public Ticket GenerateTicket(int count,int section,int floors)
	{
		if(count==10)
		{
			section=section-1;
			return new Ticket(count,section,floors);
		}
		else
		{
			return new Ticket(count,section,floors);
		}
	}
	
	public String getCarDetails(Ticket tick)
	{
	  String str=null;
	  int floors=tick.getFloor();
	  int carSection=tick.getSection();
	  int compartment=tick.getCompartment();
	 
	  if(floors==1)
	  {
		str = floor.get(--carSection).get(--compartment).toString();
	  }
	  else
	  {
		  str =building.get(--floors).get(--carSection).get(--compartment).toString();
	  }
	  return str;
	}
	
	public void remove(Ticket tick)
	{
		int floors=tick.getFloor();
		int carSection=tick.getSection();
		int compartment=tick.getCompartment();
		if(floors==1)
		  {
		   floor.get(--carSection).remove(--compartment);
		  }
		  else
		  {
	       building.get(--floors).get(--carSection).remove(--compartment);
		  }
	}
	

	
	
}
