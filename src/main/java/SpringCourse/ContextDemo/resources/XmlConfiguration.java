package SpringCourse.ContextDemo.resources;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath*:xmlContext.xml")
public class XmlConfiguration {
}
