package com.parkingLot.POJO;

public class Ticket {
	int compartment;
	int section;
	int floor;
	public Ticket(int compartment, int section, int floor) {
		super();
		this.compartment = compartment;
		this.section = section;
		this.floor = floor;
	}
	public int getCompartment() {
		return compartment;
	}
	public int getSection() {
		return section;
	}
	public int getFloor() {
		return floor;
	}
	@Override
	public String toString() {
		return "Ticket [compartment=" + compartment + ", section=" + section + ", floor=" + floor + "]";
	}
	

}
