package main.persons.entites;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import main.jackson.LocalDateDeserializer;
import main.jackson.LocalDateSerializer;

import java.time.LocalDate;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public abstract class Person {
	protected int id;
	protected String name;
	protected Address address;
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonDeserialize(using = LocalDateDeserializer.class)
	protected LocalDate birthDate;

	public Person() {
		
	}
	
	public Person(int id, String name, Address address, LocalDate birthDate) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	@Override
	public String toString() {
		return "";
	}
	
	

}
