package SpringCourse.ContextDemo.src.resources;

import SpringCourse.ContextDemo.src.POJO.ListDefinition.MyJavaList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class JavaConfiguration {

    @Bean
    public MyJavaList getMyJavaList() {return new MyJavaList();}

}
