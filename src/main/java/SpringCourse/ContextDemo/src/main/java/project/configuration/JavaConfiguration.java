package project.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import project.POJO.ListDefinition.MyJavaList;


@Configuration
public class JavaConfiguration {

    @Bean
    public MyJavaList getMyJavaList() {return new MyJavaList();}

}
