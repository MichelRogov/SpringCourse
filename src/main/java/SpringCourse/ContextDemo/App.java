package SpringCourse.ContextDemo;

import SpringCourse.ContextDemo.POJO.Company;
import SpringCourse.ContextDemo.POJO.Employee;
import SpringCourse.ContextDemo.POJO.ListDefinition.MyJavaList;
import SpringCourse.ContextDemo.POJO.ListDefinition.MyXmlList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(App.class, args);
        System.out.println("Bean names: " +
                Arrays.toString(context.getBeanNamesForType(Employee.class)));
        Employee employee = context.getBean(Employee.class);
        System.out.println(employee);
        Company company = context.getBean(Company.class);
        System.out.println(company);

        MyXmlList myXmlList = (MyXmlList) context.getBean("myXmlList");
        myXmlList.printList();

        MyJavaList myJavaList = context.getBean(MyJavaList.class);
        myJavaList.printList();
    }
}