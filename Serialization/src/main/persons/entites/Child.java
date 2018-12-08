package main.persons.entites;

import java.time.LocalDate;

public class Child extends Person {

	private String kindergarten;
	
	public Child() {
		
	}

	public Child(int id, String name, Address address, LocalDate birthDate, String kindergarten) {
		super(id, name, address, birthDate);
		this.kindergarten = kindergarten;
	}

	@Override
	public String toString() {
		return String.format("Child [kindergarten=%s, name=%s, address=%s, id=%s, birthdate=%s]",
				kindergarten, name, address, id, birthDate);
	}

	public String getKindergarten() {
		return kindergarten;
	}

	public void setKindergarten(String kindergarten) {
		this.kindergarten = kindergarten;
	}
	
}
