package main.persons.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import main.persons.entites.Address;
import main.persons.entites.Child;
import main.persons.entites.Employee;
import main.persons.entites.Person;

import java.io.IOException;
import java.io.PrintStream;
import java.time.LocalDate;

public class StreamsTestAppl {

	static ObjectMapper mapper = new ObjectMapper();
	
	public static void main(String[] args) throws IOException {
		Person[] persons = {
			new Child(123, "Stefan",
					new Address("Berlin", "Kapelle-Ufer", 3, 127),
					LocalDate.of(2012, 10, 20), "Salut"),
			new Employee(124, "Tod",
					new Address("Berlin", "Kapelle-Ufer", 3, 127),
					LocalDate.of(1980, 1, 22), "Motorola", 4000, "054-1234567"),
			new Child(125, "Vasya", 
					new Address("Potsdam", "Am Kanal", 20, 10),
					LocalDate.of(2011, 12, 2), "Stern"),
			new Employee(126, "Moshe", 
					new Address("Rehovot", "Herzel", 100, 10),
					LocalDate.of(1970, 1, 12), "Motorola", 5000, "050-7654321"),
		};

		PrintStream stream = new PrintStream("Serialization/persons.data");
		stream.println(mapper.writeValueAsString(persons));
		stream.close();
		
	}
}