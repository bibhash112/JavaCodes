package com.parkingLot;

import com.parkingLot.POJO.CarDetails;
import com.parkingLot.POJO.Ticket;
import com.parkingLot.Service.ParkingService;

public class ParkingLotApplication {

	public static void main(String[] args) {
	    ParkingService service=new ParkingService();
	    
	    Ticket tck=service.addCar(new CarDetails("Bibhash",900000));
	    System.out.println(tck.toString());
	    Ticket tck1=service.addCar(new CarDetails("Bibhash",800000));
	    System.out.println(tck1.toString());
	    Ticket tck2=service.addCar(new CarDetails("Bibhash",800000));
	    System.out.println(tck2.toString());
	    Ticket tck3=service.addCar(new CarDetails("Bibhash",800000));
	    System.out.println(tck3.toString());
	    Ticket tck4=service.addCar(new CarDetails("Bibhash",800000));
	    System.out.println(tck4.toString());
	    Ticket tck5=service.addCar(new CarDetails("Bibhash",900000));
	    System.out.println(tck5.toString());
	    Ticket tck6=service.addCar(new CarDetails("Bibhash",800000));
	    System.out.println(tck6.toString());
	    Ticket tck7=service.addCar(new CarDetails("Bibhash",800000));
	    System.out.println(tck7.toString());
	    Ticket tck8=service.addCar(new CarDetails("Bibhash",800000));
	    System.out.println(tck8.toString());
	    Ticket tck9=service.addCar(new CarDetails("Hatt",800000));
	    System.out.println(tck9.toString());
	    Ticket tck10=service.addCar(new CarDetails("Bibhash",900000));
	    System.out.println(tck10.toString());
	    Ticket tck11=service.addCar(new CarDetails("Yolo",800000));
	    System.out.println(tck11.toString());
	    Ticket tck12=service.addCar(new CarDetails("Bibhash",800000));
	    System.out.println(tck12.toString());
	    Ticket tck13=service.addCar(new CarDetails("Bibhash",800000));
	    System.out.println(tck13.toString());
	    Ticket tck14=service.addCar(new CarDetails("Bibhash",1));
	    System.out.println(tck14.toString());
	    Ticket tck15=service.addCar(new CarDetails("Bibhash",800000));
	    System.out.println(tck15.toString());
	    Ticket tck16=service.addCar(new CarDetails("Bibhash",800000));
	    System.out.println(tck16.toString());
	    Ticket tck17=service.addCar(new CarDetails("Bibhash",800000));
	    System.out.println(tck17.toString());
	    Ticket tck18=service.addCar(new CarDetails("Hatt",800000));
	    System.out.println(tck18.toString());
	    Ticket tck19=service.addCar(new CarDetails("Bibhash1",900000));
	    System.out.println(tck19.toString());
	    Ticket tck20=service.addCar(new CarDetails("Yolo",800000));
	    System.out.println(tck20.toString());
	    Ticket tck21=service.addCar(new CarDetails("Bibhash",800000));
	    System.out.println(tck21.toString());
	    Ticket tck22=service.addCar(new CarDetails("Bibhash",800000));
	    System.out.println(tck22.toString());
	    Ticket tck23=service.addCar(new CarDetails("Bibhash",1));
	    System.out.println(tck23.toString());
	     System.out.println(service.getCarDetails(tck19));
	    service.remove(tck);
	    
	    
	}
}
