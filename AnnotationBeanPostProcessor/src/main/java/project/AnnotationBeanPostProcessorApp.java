package project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import project.shared.CommonSettings;
import project.shared.CommonSettingsMapper;

import java.util.Map;

@SpringBootApplication(scanBasePackages={"project"})
public class AnnotationBeanPostProcessorApp
{
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(AnnotationBeanPostProcessorApp.class, args);
        Map<String, CommonSettings> settingsMap = context.getBean(CommonSettingsMapper.class).getSettingsMap();

        settingsMap.get("SearchService").getSettings();
        settingsMap.get("UserService").getSettings();
        settingsMap.get("InboundChannel").getSettings();
        settingsMap.get("PropertySourcesPlaceholder").getSettings();
    }
}
