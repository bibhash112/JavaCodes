package com.capgemini.Safaar.DTO;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class BusDetailsTest {

	BusDetails busService=mock(BusDetails.class);
	
	@Test
	public void getSourceTest()
	{
		when(busService.getSource())
		.thenReturn("Kolkata");
		assertEquals("Kolkata",busService.getSource());
	}
	 @Test
	 public void setSourceTest()
	 {
		busService.setSource("Kolkata");
		when(busService.getSource())
		.thenReturn("Kolkata");
	    assertEquals("Kolkata",busService.getSource());
	 }
	 @Test
	 public void getDestinationTest()
	 {
		 when(busService.getDestination())
		 .thenReturn("siliguri");
		 assertEquals("siliguri",busService.getDestination());
	 }
	 @Test
	 public void setDestinationTest()
	 {
		busService.setDestination("Kolkata");
		when(busService.getDestination())
		.thenReturn("Kolkata");
	    assertEquals("Kolkata",busService.getDestination());
	 }
	 @Test
	 public void getDepartureDateTest()
	 {
		 when(busService.getDepartureDate())
		 .thenReturn("20181010");
		 assertEquals("20181010",busService.getDepartureDate());
	 }
	 @Test
	 public void setDepartureDateTest()
	 {
		busService.setDepartureDate("20181010");
		when(busService.getDepartureDate())
		.thenReturn("20181010");
	    assertEquals("20181010",busService.getDepartureDate());
	 }
	 @Test
	 public void getDepartureTimeTest()
	 {
		 when(busService.getDepartureTime())
		 .thenReturn("10:00");
		 assertEquals("10:00",busService.getDepartureTime());
	 }
	 @Test
	 public void setDepartureTimeTest()
	 {
		busService.setDepartureDate("10:00");
		when(busService.getDepartureTime())
		.thenReturn("10:00");
	    assertEquals("10:00",busService.getDepartureTime());
	 }
	
}
