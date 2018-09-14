package SpringCourse.ContextDemo.POJO;


public class Employee {
    private String name;
    private int age;
    private String country;

    public Employee() {
    }

    public Employee(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Employee(int age, String country) {
        this.age = age;
        this.country = country;
    }

    public String toString() {
        return "Employee Name is " + name + " and employee Age is " + age
                + " years, lives in " + country;
    }
}
