package com.persons.controllers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.persons.entites.Person;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;

public class RestorePersonAppl {
	static ObjectMapper mapper = new ObjectMapper(); 

	public static void main(String[] args) throws Exception {
		Iterable<Person> persons;
		File file = new File("Serialization/persons.data");
		persons = mapper.readValue(file, new TypeReference<Iterable<Person>>() {});
		for (Person person : persons) {
			System.out.println(person);
		}
	}
}
