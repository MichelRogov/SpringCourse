package project.POJO;

public class Company {
    private Employee employee;
    private Address address;

    public Company(Employee employee, Address address) {
        this.employee = employee;
        this.address = address;
    }

    public Company() {
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee: " + employee + " Address: " + address;
    }
}
