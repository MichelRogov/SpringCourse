package project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import project.POJO.Company;
import project.POJO.Employee;
import project.POJO.ListDefinition.MyJavaList;
import project.POJO.ListDefinition.MyXmlList;

import java.util.Arrays;

@SpringBootApplication
public class ContextDemoApp {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ContextDemoApp.class, args);
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