package main.persons.entites;

import java.time.LocalDate;

public class Employee extends Person {
	private String company;
	private int salary;
	private String phone;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, Address address, LocalDate birthDate, String company, int salary,
			String phone) {
		super(id, name, address, birthDate);
		this.company = company;
		this.salary = salary;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return String.format("Employee [id=%s, name=%s, address=%s, birthDate=%s, company=%s, salary=%s, phone=%s]", id,
				name, address, birthDate, company, salary, phone);
	}
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
