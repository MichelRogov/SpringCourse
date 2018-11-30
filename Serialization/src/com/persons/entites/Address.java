package com.persons.entites;

public class Address {
	private String city;
	private String street;
	private int building;
	private int apartment;
	
	public Address() {
		
	}
	
	public Address(String city, String street, int building, int apartment) {
		super();
		this.city = city;
		this.street = street;
		this.building = building;
		this.apartment = apartment;
	}

	public String getCity() {
		return city;
	}

	public String getStreet() {
		return street;
	}

	public int getBuilding() {
		return building;
	}

	public int getApartment() {
		return apartment;
	}

	@Override
	public String toString() {
		return String.format("Address [city=%s, street=%s, building=%s, apartment=%s]", city, street, building,
				apartment);
	}

}
