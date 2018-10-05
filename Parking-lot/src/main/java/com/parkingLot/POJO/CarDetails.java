package com.parkingLot.POJO;

public class CarDetails {
	String carOwner;
	double phoneNumber;
	
	public CarDetails() {
		
	}
	public CarDetails(String carOwner, double phoneNumber)
	{
		this.carOwner=carOwner;
		this.phoneNumber=phoneNumber;
	}
	public String getCarOwner() {
		return carOwner;
	}
	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}
	public double getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "CarDetails [carOwner=" + carOwner + ", phoneNumber=" + phoneNumber + "]";
	}
	

}
