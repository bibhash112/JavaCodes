package com.parkingLot.Service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import com.parkingLot.POJO.CarDetails;
import com.parkingLot.POJO.Ticket;

public class ParkingServiceTest {
	
	CarDetails mockCar=mock(CarDetails.class);
	Ticket mockTicket=mock(Ticket.class);
	ParkingService parkingService=new ParkingService();
	@Test
	public void accCarTest()
	{
		Ticket testTicket=parkingService.addCar(mockCar);
		assertEquals(1, testTicket.getFloor());
		assertEquals(1, testTicket.getCompartment());
		assertEquals(1, testTicket.getSection());
	}
	
	@Test
	public void getCarDetailsTest()
	{
		when(mockTicket.getFloor()).thenReturn(1);
		when(mockTicket.getSection()).thenReturn(1);
		when(mockTicket.getCompartment()).thenReturn(1);
		String str=parkingService.getCarDetails(mockTicket);
		
		
	}

}
