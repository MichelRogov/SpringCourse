package SpringCourse.ContextDemo.resources;

import SpringCourse.ContextDemo.POJO.ListDefinition.MyJavaList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JavaConfiguration {

    @Bean
    public MyJavaList getMyJavaList() {return new MyJavaList();}

}
